package typings.minappEnv.ICloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadFileParam extends ICloudAPIParam[DownloadFileResult] {
  var cloudPath: js.UndefOr[String] = js.native
  var fileID: String = js.native
}

object DownloadFileParam {
  @scala.inline
  def apply(fileID: String): DownloadFileParam = {
    val __obj = js.Dynamic.literal(fileID = fileID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileParam]
  }
  @scala.inline
  implicit class DownloadFileParamOps[Self <: DownloadFileParam] (val x: Self) extends AnyVal {
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
    def setFileID(value: String): Self = this.set("fileID", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloudPath(value: String): Self = this.set("cloudPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudPath: Self = this.set("cloudPath", js.undefined)
  }
  
}

