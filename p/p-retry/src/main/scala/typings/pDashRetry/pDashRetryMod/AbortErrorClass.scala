package typings.pDashRetry.pDashRetryMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortErrorClass extends Error {
  @JSName("name")
  val name_AbortErrorClass: typings.pDashRetry.pDashRetryStrings.AbortError
  val originalError: Error
}

object AbortErrorClass {
  @scala.inline
  def apply(
    message: String,
    name: typings.pDashRetry.pDashRetryStrings.AbortError,
    originalError: Error,
    stack: String = null
  ): AbortErrorClass = {
    val __obj = js.Dynamic.literal(message = message, name = name, originalError = originalError)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[AbortErrorClass]
  }
}

