package typings
package pDashTimeoutLib.pDashTimeoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeoutErrorClass
  extends stdLib.Error {
  @JSName("name")
  val name_TimeoutErrorClass: pDashTimeoutLib.pDashTimeoutLibStrings.TimeoutError
}

object TimeoutErrorClass {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: pDashTimeoutLib.pDashTimeoutLibStrings.TimeoutError,
    stack: java.lang.String = null
  ): TimeoutErrorClass = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[TimeoutErrorClass]
  }
}

