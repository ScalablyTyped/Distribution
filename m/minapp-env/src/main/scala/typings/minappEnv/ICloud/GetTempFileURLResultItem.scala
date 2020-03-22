package typings.minappEnv.ICloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTempFileURLResultItem extends js.Object {
  var errMsg: String
  var fileID: String
  var maxAge: Double
  var status: Double
  var tempFileURL: String
}

object GetTempFileURLResultItem {
  @scala.inline
  def apply(errMsg: String, fileID: String, maxAge: Double, status: Double, tempFileURL: String): GetTempFileURLResultItem = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileID = fileID.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tempFileURL = tempFileURL.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTempFileURLResultItem]
  }
}

