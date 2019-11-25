package typings.plupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait plupload_error extends plupload_response {
  var code: Double
  var file: js.Any
  var message: String
}

object plupload_error {
  @scala.inline
  def apply(
    code: Double,
    file: js.Any,
    message: String,
    response: String,
    responseHeaders: String,
    status: Double
  ): plupload_error = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[plupload_error]
  }
}

