package typings.plupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pluploadChunkResponse extends pluploadResponse {
  var offset: Double
  var total: Double
}

object pluploadChunkResponse {
  @scala.inline
  def apply(offset: Double, response: String, responseHeaders: String, status: Double, total: Double): pluploadChunkResponse = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[pluploadChunkResponse]
  }
}

