package typings.minappEnv.ICloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFileResultItem extends js.Object {
  var errMsg: String = js.native
  var fileID: String = js.native
  var status: Double = js.native
}

object DeleteFileResultItem {
  @scala.inline
  def apply(errMsg: String, fileID: String, status: Double): DeleteFileResultItem = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileID = fileID.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileResultItem]
  }
  @scala.inline
  implicit class DeleteFileResultItemOps[Self <: DeleteFileResultItem] (val x: Self) extends AnyVal {
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
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileID(value: String): Self = this.set("fileID", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

