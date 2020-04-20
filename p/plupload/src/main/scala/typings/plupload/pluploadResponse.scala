package typings.plupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pluploadResponse extends js.Object {
  var response: String
  var responseHeaders: String
  var status: Double
}

object pluploadResponse {
  @scala.inline
  def apply(response: String, responseHeaders: String, status: Double): pluploadResponse = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[pluploadResponse]
  }
}

