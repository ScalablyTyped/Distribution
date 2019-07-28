package typings.micro

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OriginalError extends js.Object {
  var originalError: js.UndefOr[Error] = js.undefined
  var statusCode: Double
}

object Anon_OriginalError {
  @scala.inline
  def apply(statusCode: Double, originalError: Error = null): Anon_OriginalError = {
    val __obj = js.Dynamic.literal(statusCode = statusCode)
    if (originalError != null) __obj.updateDynamic("originalError")(originalError)
    __obj.asInstanceOf[Anon_OriginalError]
  }
}

