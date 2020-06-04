package testUnitaireTest;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assume.assumeTrue;

import java.util.Arrays;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class DemoTest {
	@BeforeClass
	public static void beforClass() {
		System.out.println("avant la Class");
		}
	@AfterClass
	public static void afterClass() {
		System.out.println("apres la Class");
		}
	@Before
	public void beforMethode() {
		System.out.println("avant la  methode");
		}
	@Before
	public void afterMethode() {
		System.out.println("apres la methode");
		}
	
	@Test
	public void testTrue() {
		assertTrue("true", true);
	}
	
	@Test
	public void testFalse() {
		assertFalse("faux", false);
	}
	
	@Test
	public void testAssertArrayEqual() {
		int[] tab1 = {'a', 'b', 'c',};
	    int[] tab2 = {'a', 'b', 'c',};
	    assertArrayEquals ("les deux tableaux sont identiques", tab1, tab2);
	}
	
	 
	 @Test
	  public void testAssertNotNull() {
	    assertNotNull("NOT NULL", 5%2);
	  }
	 @Test
	  public void testAssertSame() {
	    assertSame("should be same", 8%2, 6%2);
	  }
	 @Test
	  public void testAssertNotSame() {
	    assertNotSame("should not be same Object", 6%4,8%5 );
	  }
	 @Test
	  public void testAssertTrue() {
	    assertTrue("failure - should be true", true);
	  }
	 @Test
	  public void testAssertfalse() {
	    assertFalse("failure - should be true", false);
	  }
	
	@Test
	public void testAssertNull() {
	    assertNull("Devrait être null", null);
	}
	@Test
    public void abortedTest() {
        assumeTrue("abc".contains("Z"));
        fail("test should have been aborted");
    }


	
}
