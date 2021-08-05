package typings.ospec

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("ospec", JSImport.Namespace)
  @js.native
  val ^ : Ospec = js.native
  
  @js.native
  trait Assertion[T] extends StObject {
    
    /** Asserts that two objects are recursively equal */
    def deepEquals(expected: T): AssertionDescriber = js.native
    
    /** Asserts that two objects are **not** recursively equal */
    def notDeepEquals(value: T): AssertionDescriber = js.native
    
    /** Asserts that two values are **not** strictly equal */
    def notEquals(value: T): AssertionDescriber = js.native
    
    /** Asserts that the function does **not** throw an error of given type */
    def notThrows(error: String): AssertionDescriber = js.native
    def notThrows(error: ObjectConstructor): AssertionDescriber = js.native
    
    /** Asserts that the function throws an error of a given type */
    def throws(error: String): AssertionDescriber = js.native
    def throws(error: ObjectConstructor): AssertionDescriber = js.native
  }
  
  type AssertionDescriber = js.Function1[/* description */ String, Unit]
  
  type Definer = js.Function2[
    /* done */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
    /* timeout */ js.Function1[/* delay */ Double, Unit], 
    Unit | js.Thenable[js.Any]
  ]
  
  type ObjectConstructor = Instantiable1[/* args (repeated) */ js.Any, js.Any]
  
  @js.native
  trait Ospec extends StObject {
    
    /** Defines a test */
    def apply(name: String, assertions: Definer): Unit = js.native
    /** Starts an assertion */
    def apply[T](actual: T): Assertion[T] = js.native
    
    /** Defines code to be run at the end of a test group */
    def after(setup: Definer): Unit = js.native
    
    /** Defines code to be run after each test in a group */
    def afterEach(teardown: Definer): Unit = js.native
    
    /** Defines code to be run at the beginning of a test group */
    def before(setup: Definer): Unit = js.native
    
    /** Defines code to be run before each test in a group */
    def beforeEach(teardown: Definer): Unit = js.native
    
    def `new`(): Ospec = js.native
    
    /** Defines a test */
    def only(name: String, assertions: Definer): Unit = js.native
    
    /** Default reporter used by `o.run()` */
    def report(results: js.Array[Result]): Double = js.native
    /** Default reporter used by `o.run()` */
    @JSName("report")
    var report_Original: Reporter = js.native
    
    /** Runs the test suite */
    def run(): Unit = js.native
    def run(reporter: Reporter): Unit = js.native
    
    /** Defines a group of tests */
    def spec(name: String, tests: js.Function0[Unit]): Unit = js.native
    
    /** Configure the default amount of time (in milliseconds) to wait until bailing out of a group of tests */
    def specTimeout(delay: Double): Unit = js.native
    
    /** Returns a function that records the number of times it gets called, and its arguments */
    def spy[A /* <: js.Array[js.Any] */](): Spy[A, Unit] = js.native
    // tslint:disable-line:no-unnecessary-generics
    def spy[A /* <: js.Array[js.Any] */, R](fn: js.Function1[/* args */ A, R]): Spy[A, R] = js.native
    
    /** Amount of time (in milliseconds) to wait until bailing out of a test */
    def timeout(delay: Double): Unit = js.native
  }
  
  type Reporter = js.Function1[/* results */ js.Array[Result], Double]
  
  trait Result extends StObject {
    
    var context: String
    
    var error: Error | Null
    
    var message: String
    
    var pass: Boolean | Null
    
    var testError: Error | Null
  }
  object Result {
    
    inline def apply(context: String, message: String): Result = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], error = null, pass = null, testError = null)
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPass(value: Boolean): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setPassNull: Self = StObject.set(x, "pass", null)
      
      inline def setTestError(value: Error): Self = StObject.set(x, "testError", value.asInstanceOf[js.Any])
      
      inline def setTestErrorNull: Self = StObject.set(x, "testError", null)
    }
  }
  
  @js.native
  trait Spy[Args /* <: js.Array[js.Any] */, Returns] extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
    ): Returns = js.native
    
    /** The arguments that were passed to the function in the last time it was called */
    val args: Args = js.native
    
    /** The number of times the function has been called */
    val callCount: Double = js.native
    
    /** List of arguments that were passed to the function each tine it was called */
    val calls: js.Array[Args] = js.native
  }
  
  type _To = Ospec
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Ospec = ^
}
