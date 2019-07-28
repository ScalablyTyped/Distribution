package typings.ol.assertionErrorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertionError extends Error {
  var code: Double
}

object AssertionError {
  @scala.inline
  def apply(code: Double, message: String, name: String, stack: String = null): AssertionError = {
    val __obj = js.Dynamic.literal(code = code, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[AssertionError]
  }
}

