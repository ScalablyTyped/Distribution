package typings
package pDashTimeoutLib.pDashTimeoutMod.pTimeoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeoutError
  extends stdLib.Error {
  @JSName("name")
  val name_TimeoutError: pDashTimeoutLib.pDashTimeoutLibStrings.TimeoutError
}

object TimeoutError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: pDashTimeoutLib.pDashTimeoutLibStrings.TimeoutError,
    stack: java.lang.String = null
  ): TimeoutError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[TimeoutError]
  }
}

