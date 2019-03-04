package typings
package pDashRetryLib.pDashRetryMod.pRetryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortError
  extends stdLib.Error {
  @JSName("name")
  val name_AbortError: pDashRetryLib.pDashRetryLibStrings.AbortError
  val originalError: stdLib.Error
}

object AbortError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: pDashRetryLib.pDashRetryLibStrings.AbortError,
    originalError: stdLib.Error,
    stack: java.lang.String = null
  ): AbortError = {
    val __obj = js.Dynamic.literal(message = message, name = name, originalError = originalError)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[AbortError]
  }
}

