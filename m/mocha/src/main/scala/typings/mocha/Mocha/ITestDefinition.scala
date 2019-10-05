package typings.mocha.Mocha

import typings.mocha.MochaDone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated use `Mocha.TestFunction` instead. */
@js.native
trait ITestDefinition extends js.Object {
  /** @deprecated use `Mocha.TestFunction` instead. */
  /** @deprecated `Mocha.TestFunction` does not allow mixing `done` with a return type of `PromiseLike<any>`. */
  def apply(expectation: String): ITest = js.native
  def apply(
    expectation: String,
    callback: js.ThisFunction1[/* this */ ITestCallbackContext, /* done */ MochaDone, js.Thenable[_] | Unit]
  ): ITest = js.native
  /** @deprecated use `Mocha.TestFunction` instead. */
  /** @deprecated `Mocha.TestFunction#only` does not allow mixing `done` with a return type of `PromiseLike<any>`. */
  def only(expectation: String): ITest = js.native
  def only(
    expectation: String,
    callback: js.ThisFunction1[/* this */ ITestCallbackContext, /* done */ MochaDone, js.Thenable[_] | Unit]
  ): ITest = js.native
  /** @deprecated use `Mocha.TestFunction` instead. */
  /** @deprecated `Mocha.TestFunction#skip` does not allow mixing `done` with a return type of `PromiseLike<any>`. */
  def skip(expectation: String): Unit = js.native
  def skip(
    expectation: String,
    callback: js.ThisFunction1[/* this */ ITestCallbackContext, /* done */ MochaDone, js.Thenable[_] | Unit]
  ): Unit = js.native
}

