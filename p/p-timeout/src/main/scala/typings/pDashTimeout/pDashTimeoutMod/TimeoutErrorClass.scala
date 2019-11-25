package typings.pDashTimeout.pDashTimeoutMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeoutErrorClass extends Error {
  @JSName("name")
  val name_TimeoutErrorClass: typings.pDashTimeout.pDashTimeoutStrings.TimeoutError
}

object TimeoutErrorClass {
  @scala.inline
  def apply(message: String, name: typings.pDashTimeout.pDashTimeoutStrings.TimeoutError, stack: String = null): TimeoutErrorClass = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutErrorClass]
  }
}

