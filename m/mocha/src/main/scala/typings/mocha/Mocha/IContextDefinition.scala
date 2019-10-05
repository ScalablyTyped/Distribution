package typings.mocha.Mocha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated use `Mocha.SuiteFunction` instead. */
@js.native
trait IContextDefinition extends js.Object {
  /** @deprecated use `Mocha.SuiteFunction` instead. */
  def apply(description: String, callback: js.ThisFunction0[/* this */ ISuiteCallbackContext, Unit]): ISuite = js.native
  /** @deprecated use `Mocha.SuiteFunction` instead. */
  def only(description: String, callback: js.ThisFunction0[/* this */ ISuiteCallbackContext, Unit]): ISuite = js.native
  /** @deprecated use `Mocha.SuiteFunction` instead. */
  def skip(description: String, callback: js.ThisFunction0[/* this */ ISuiteCallbackContext, Unit]): Unit = js.native
}

