package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated use `Mocha.TestFunction` instead. */
@js.native
trait ITestDefinition extends js.Object {
  /** @deprecated use `Mocha.TestFunction` instead. */
  /** @deprecated `Mocha.TestFunction` does not allow mixing `done` with a return type of `PromiseLike<any>`. */
  def apply(expectation: java.lang.String): ITest = js.native
  /** @deprecated use `Mocha.TestFunction` instead. */
  /** @deprecated `Mocha.TestFunction` does not allow mixing `done` with a return type of `PromiseLike<any>`. */
  def apply(
    expectation: java.lang.String,
    callback: js.ThisFunction1[
      /* this */ ITestCallbackContext, 
      /* done */ mochaLib.MochaDone, 
      js.Thenable[_] | scala.Unit
    ]
  ): ITest = js.native
  /** @deprecated use `Mocha.TestFunction` instead. */
  /** @deprecated `Mocha.TestFunction#only` does not allow mixing `done` with a return type of `PromiseLike<any>`. */
  def only(expectation: java.lang.String): ITest = js.native
  /** @deprecated use `Mocha.TestFunction` instead. */
  /** @deprecated `Mocha.TestFunction#only` does not allow mixing `done` with a return type of `PromiseLike<any>`. */
  def only(
    expectation: java.lang.String,
    callback: js.ThisFunction1[
      /* this */ ITestCallbackContext, 
      /* done */ mochaLib.MochaDone, 
      js.Thenable[_] | scala.Unit
    ]
  ): ITest = js.native
  /** @deprecated use `Mocha.TestFunction` instead. */
  /** @deprecated `Mocha.TestFunction#skip` does not allow mixing `done` with a return type of `PromiseLike<any>`. */
  def skip(expectation: java.lang.String): scala.Unit = js.native
  /** @deprecated use `Mocha.TestFunction` instead. */
  /** @deprecated `Mocha.TestFunction#skip` does not allow mixing `done` with a return type of `PromiseLike<any>`. */
  def skip(
    expectation: java.lang.String,
    callback: js.ThisFunction1[
      /* this */ ITestCallbackContext, 
      /* done */ mochaLib.MochaDone, 
      js.Thenable[_] | scala.Unit
    ]
  ): scala.Unit = js.native
}

