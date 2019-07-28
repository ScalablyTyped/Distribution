package typings.plupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait plupload_chunk_response extends plupload_response {
  var offset: Double
  var total: Double
}

object plupload_chunk_response {
  @scala.inline
  def apply(offset: Double, response: String, responseHeaders: String, status: Double, total: Double): plupload_chunk_response = {
    val __obj = js.Dynamic.literal(offset = offset, response = response, responseHeaders = responseHeaders, status = status, total = total)
  
    __obj.asInstanceOf[plupload_chunk_response]
  }
}

