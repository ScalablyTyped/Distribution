package typings
package pDashThrottleLib.pDashThrottleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortErrorClass
  extends stdLib.Error {
  @JSName("name")
  val name_AbortErrorClass: pDashThrottleLib.pDashThrottleLibStrings.AbortError
}

object AbortErrorClass {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: pDashThrottleLib.pDashThrottleLibStrings.AbortError,
    stack: java.lang.String = null
  ): AbortErrorClass = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[AbortErrorClass]
  }
}

