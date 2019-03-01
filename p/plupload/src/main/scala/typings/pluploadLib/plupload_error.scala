package typings
package pluploadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait plupload_error extends plupload_response {
  var code: scala.Double
  var file: js.Any
  var message: java.lang.String
}

object plupload_error {
  @scala.inline
  def apply(
    code: scala.Double,
    file: js.Any,
    message: java.lang.String,
    response: java.lang.String,
    responseHeaders: java.lang.String,
    status: scala.Double
  ): plupload_error = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("file")(file)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("response")(response)
    __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[plupload_error]
  }
}

