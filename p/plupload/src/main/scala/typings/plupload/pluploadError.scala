package typings.plupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pluploadError extends pluploadResponse {
  var code: Double
  var file: js.Any
  var message: String
}

object pluploadError {
  @scala.inline
  def apply(
    code: Double,
    file: js.Any,
    message: String,
    response: String,
    responseHeaders: String,
    status: Double
  ): pluploadError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[pluploadError]
  }
}

