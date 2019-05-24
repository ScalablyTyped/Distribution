package typings
package pDashCancelableLib.pDashCancelableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelErrorClass
  extends stdLib.Error {
  val isCanceled: pDashCancelableLib.pDashCancelableLibNumbers.`true`
  @JSName("name")
  val name_CancelErrorClass: pDashCancelableLib.pDashCancelableLibStrings.CancelError
}

object CancelErrorClass {
  @scala.inline
  def apply(
    isCanceled: pDashCancelableLib.pDashCancelableLibNumbers.`true`,
    message: java.lang.String,
    name: pDashCancelableLib.pDashCancelableLibStrings.CancelError,
    stack: java.lang.String = null
  ): CancelErrorClass = {
    val __obj = js.Dynamic.literal(isCanceled = isCanceled, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[CancelErrorClass]
  }
}

