package typings.mochaDashEach

import typings.mocha.Mocha.ITest
import typings.mocha.Mocha.ITestCallbackContext
import typings.mocha.Mocha.ITestDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mocha-each", JSImport.Namespace)
@js.native
object mochaDashEachMod extends js.Object {
  /**
    * This interface describes the kind of `it` available from a `forEach` call.
    * The result is very similar to Mocha's `ITestDefinition` interface.
    */
  @js.native
  trait ForEachITestDefinition extends js.Object {
    /*
      * The callback functions in each of these properties take a variable
      * number of arguments, based on how many values were passed in tuples
      * in the call of forEach that generated this property.
      *
      * This problem is similar to `Function.prototype.apply`, which also
      * does not have strong typing
      * (see github.com/Microsoft/Typescript/issues/212).
      *
      * These callback functions can all accept an optional callback generated
      * by mocha, which is used for asynchronous code testing. However,
      * since rest parameters have to be the final parameter in a function
      * declaration, this function cannot be explicitly mentioned here.
      *
      * A more accurate signature for the callback functions would be
      *     callback?: (this, ...args, done?: MochaDone)
      * Additionally, Mocha does not export its MochaDone interface.
      */
    def apply(expectation: String): ITest = js.native
    def apply(
      expectation: String,
      callback: js.ThisFunction1[/* this */ ITestCallbackContext, /* repeated */ js.Any, _]
    ): ITest = js.native
    def only(expectation: String): ITest = js.native
    def only(
      expectation: String,
      callback: js.ThisFunction1[/* this */ ITestCallbackContext, /* repeated */ js.Any, _]
    ): ITest = js.native
    def skip(expectation: String): ITest = js.native
    def skip(
      expectation: String,
      callback: js.ThisFunction1[/* this */ ITestCallbackContext, /* repeated */ js.Any, _]
    ): ITest = js.native
  }
  
  /**
    * This function takes an array collections of parameters to be used in
    * a series of mocha tests, defined using the `it` notation common to
    * Mocha.
    */
  def apply(parameters: js.Array[_]): Anon_It = js.native
  def apply(parameters: js.Array[_], defaultIt: ITestDefinition): Anon_It = js.native
}

