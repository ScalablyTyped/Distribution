package typings.mochaDashEach

import typings.mocha.Mocha.ITest
import typings.mocha.Mocha.ITestCallbackContext
import typings.mochaDashEach.mochaDashEachMod.ForEachITestDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_It extends js.Object {
  @JSName("it")
  var it_Original: ForEachITestDefinition = js.native
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
  def it(expectation: String): ITest = js.native
  def it(
    expectation: String,
    callback: js.ThisFunction1[/* this */ ITestCallbackContext, /* repeated */ js.Any, _]
  ): ITest = js.native
}

