package typings.nodeAppleReceiptVerify.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError extends Error {
  var appleStatus: Double
  var isRetryable: Boolean
}

object ValidationError {
  @scala.inline
  def apply(appleStatus: Double, isRetryable: Boolean, message: String, name: String, stack: String = null): ValidationError = {
    val __obj = js.Dynamic.literal(appleStatus = appleStatus.asInstanceOf[js.Any], isRetryable = isRetryable.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
}

