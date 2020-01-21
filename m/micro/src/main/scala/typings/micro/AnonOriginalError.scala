package typings.micro

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOriginalError extends js.Object {
  var originalError: js.UndefOr[Error] = js.undefined
  var statusCode: Double
}

object AnonOriginalError {
  @scala.inline
  def apply(statusCode: Double, originalError: Error = null): AnonOriginalError = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    if (originalError != null) __obj.updateDynamic("originalError")(originalError.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOriginalError]
  }
}

