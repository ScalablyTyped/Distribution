package typings.nodeDownloaderHelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinalDownloadInfo extends js.Object {
   // total size of file on the disk
  var downloadedSize: Double = js.native
  var fileName: String = js.native
   // assigned name
  var filePath: String = js.native
   // total file size got from the server
  var onDiskSize: Double = js.native
   // download path
  var totalSize: Double = js.native
}

object FinalDownloadInfo {
  @scala.inline
  def apply(downloadedSize: Double, fileName: String, filePath: String, onDiskSize: Double, totalSize: Double): FinalDownloadInfo = {
    val __obj = js.Dynamic.literal(downloadedSize = downloadedSize.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], onDiskSize = onDiskSize.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalDownloadInfo]
  }
  @scala.inline
  implicit class FinalDownloadInfoOps[Self <: FinalDownloadInfo] (val x: Self) extends AnyVal {
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
    def setDownloadedSize(value: Double): Self = this.set("downloadedSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDiskSize(value: Double): Self = this.set("onDiskSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
  }
  
}

