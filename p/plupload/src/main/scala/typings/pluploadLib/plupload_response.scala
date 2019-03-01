package typings
package pluploadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait plupload_response extends js.Object {
  var response: java.lang.String
  var responseHeaders: java.lang.String
  var status: scala.Double
}

object plupload_response {
  @scala.inline
  def apply(response: java.lang.String, responseHeaders: java.lang.String, status: scala.Double): plupload_response = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("response")(response)
    __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[plupload_response]
  }
}

