package typings
package pDashRetryLib.pDashRetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortErrorClass
  extends stdLib.Error {
  @JSName("name")
  val name_AbortErrorClass: pDashRetryLib.pDashRetryLibStrings.AbortError
  val originalError: stdLib.Error
}

object AbortErrorClass {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: pDashRetryLib.pDashRetryLibStrings.AbortError,
    originalError: stdLib.Error,
    stack: java.lang.String = null
  ): AbortErrorClass = {
    val __obj = js.Dynamic.literal(message = message, name = name, originalError = originalError)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[AbortErrorClass]
  }
}

