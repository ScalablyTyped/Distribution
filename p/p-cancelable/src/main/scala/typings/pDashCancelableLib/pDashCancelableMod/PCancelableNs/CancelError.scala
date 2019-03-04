package typings
package pDashCancelableLib.pDashCancelableMod.PCancelableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelError
  extends stdLib.Error {
  val isCanceled: scala.Boolean
  @JSName("name")
  val name_CancelError: pDashCancelableLib.pDashCancelableLibStrings.CancelError
}

object CancelError {
  @scala.inline
  def apply(
    isCanceled: scala.Boolean,
    message: java.lang.String,
    name: pDashCancelableLib.pDashCancelableLibStrings.CancelError,
    stack: java.lang.String = null
  ): CancelError = {
    val __obj = js.Dynamic.literal(isCanceled = isCanceled, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[CancelError]
  }
}

