package typings.ospec.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ospec extends js.Object {
  
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
  def spy[A /* <: js.Array[_] */](): Spy[A, js.UndefOr[scala.Nothing]] = js.native
   // tslint:disable-line:no-unnecessary-generics
  def spy[A /* <: js.Array[_] */, R](fn: js.Function1[/* args */ A, R]): Spy[A, R] = js.native
  
  /** Amount of time (in milliseconds) to wait until bailing out of a test */
  def timeout(delay: Double): Unit = js.native
}
