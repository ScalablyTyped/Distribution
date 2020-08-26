package typings.plupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait pluploadResponse extends js.Object {
  var response: String = js.native
  var responseHeaders: String = js.native
  var status: Double = js.native
}

object pluploadResponse {
  @scala.inline
  def apply(response: String, responseHeaders: String, status: Double): pluploadResponse = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[pluploadResponse]
  }
  @scala.inline
  implicit class pluploadResponseOps[Self <: pluploadResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResponse(value: String): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseHeaders(value: String): Self = this.set("responseHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

