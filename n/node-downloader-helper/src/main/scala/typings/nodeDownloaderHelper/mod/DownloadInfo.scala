package typings.nodeDownloaderHelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadInfo extends js.Object {
  
   // if the download is a resume,
  var downloadedSize: Double = js.native
  
   // total file size got from the server
  var fileName: String = js.native
  
   // assigned name
  var filePath: String = js.native
  
   // download path
  var isResumed: Boolean = js.native
  
  var totalSize: Double = js.native
}
object DownloadInfo {
  
  @scala.inline
  def apply(downloadedSize: Double, fileName: String, filePath: String, isResumed: Boolean, totalSize: Double): DownloadInfo = {
    val __obj = js.Dynamic.literal(downloadedSize = downloadedSize.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], isResumed = isResumed.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadInfo]
  }
  
  @scala.inline
  implicit class DownloadInfoOps[Self <: DownloadInfo] (val x: Self) extends AnyVal {
    
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
    def setIsResumed(value: Boolean): Self = this.set("isResumed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
  }
}
