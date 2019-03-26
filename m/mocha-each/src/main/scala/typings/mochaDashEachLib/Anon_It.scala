package typings
package mochaDashEachLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_It extends js.Object {
  @JSName("it")
  var it_Original: mochaDashEachLib.mochaDashEachMod.ForEachITestDefinition = js.native
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
  def it(expectation: java.lang.String): mochaLib.MochaNs.ITest = js.native
  def it(
    expectation: java.lang.String,
    callback: js.ThisFunction1[/* this */ mochaLib.MochaNs.ITestCallbackContext, /* repeated */ js.Any, _]
  ): mochaLib.MochaNs.ITest = js.native
}

