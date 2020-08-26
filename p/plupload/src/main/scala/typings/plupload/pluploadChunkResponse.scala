package typings.plupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait pluploadChunkResponse extends pluploadResponse {
  var offset: Double = js.native
  var total: Double = js.native
}

object pluploadChunkResponse {
  @scala.inline
  def apply(offset: Double, response: String, responseHeaders: String, status: Double, total: Double): pluploadChunkResponse = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[pluploadChunkResponse]
  }
  @scala.inline
  implicit class pluploadChunkResponseOps[Self <: pluploadChunkResponse] (val x: Self) extends AnyVal {
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
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

