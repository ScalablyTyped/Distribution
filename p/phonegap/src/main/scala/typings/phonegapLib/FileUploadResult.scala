package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploadResult extends js.Object {
  var bytesSent: scala.Double
  var response: java.lang.String
  var responseCode: scala.Double
}

object FileUploadResult {
  @scala.inline
  def apply(bytesSent: scala.Double, response: java.lang.String, responseCode: scala.Double): FileUploadResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bytesSent")(bytesSent)
    __obj.updateDynamic("response")(response)
    __obj.updateDynamic("responseCode")(responseCode)
    __obj.asInstanceOf[FileUploadResult]
  }
}

