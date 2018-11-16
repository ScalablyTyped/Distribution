package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated use `Mocha.SuiteFunction` instead. */
@js.native
trait IContextDefinition extends js.Object {
  /** @deprecated use `Mocha.SuiteFunction` instead. */
  def apply(
    description: java.lang.String,
    callback: js.ThisFunction0[/* this */ ISuiteCallbackContext, scala.Unit]
  ): ISuite = js.native
  /** @deprecated use `Mocha.SuiteFunction` instead. */
  def only(
    description: java.lang.String,
    callback: js.ThisFunction0[/* this */ ISuiteCallbackContext, scala.Unit]
  ): ISuite = js.native
  /** @deprecated use `Mocha.SuiteFunction` instead. */
  def skip(
    description: java.lang.String,
    callback: js.ThisFunction0[/* this */ ISuiteCallbackContext, scala.Unit]
  ): scala.Unit = js.native
}

