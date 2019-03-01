package typings
package pluploadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait plupload_chunk_response extends plupload_response {
  var offset: scala.Double
  var total: scala.Double
}

object plupload_chunk_response {
  @scala.inline
  def apply(
    offset: scala.Double,
    response: java.lang.String,
    responseHeaders: java.lang.String,
    status: scala.Double,
    total: scala.Double
  ): plupload_chunk_response = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("response")(response)
    __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[plupload_chunk_response]
  }
}

