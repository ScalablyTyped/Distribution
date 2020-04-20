package typings.minappEnv.ICloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFileResultItem extends js.Object {
  var errMsg: String
  var fileID: String
  var status: Double
}

object DeleteFileResultItem {
  @scala.inline
  def apply(errMsg: String, fileID: String, status: Double): DeleteFileResultItem = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileID = fileID.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileResultItem]
  }
}

