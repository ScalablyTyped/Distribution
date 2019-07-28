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
    val __obj = js.Dynamic.literal(code = code, file = file, message = message, response = response, responseHeaders = responseHeaders, status = status)
  
    __obj.asInstanceOf[plupload_error]
  }
}

