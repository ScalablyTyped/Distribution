package typings.pDashCancelable.pDashCancelableMod

import typings.pDashCancelable.pDashCancelableNumbers.`true`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelErrorClass extends Error {
  val isCanceled: `true`
  @JSName("name")
  val name_CancelErrorClass: typings.pDashCancelable.pDashCancelableStrings.CancelError
}

object CancelErrorClass {
  @scala.inline
  def apply(
    isCanceled: `true`,
    message: String,
    name: typings.pDashCancelable.pDashCancelableStrings.CancelError,
    stack: String = null
  ): CancelErrorClass = {
    val __obj = js.Dynamic.literal(isCanceled = isCanceled, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[CancelErrorClass]
  }
}

