package typings.nodeDownloaderHelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinalDownloadInfo extends js.Object {
   // total size of file on the disk
  var downloadedSize: Double
  var fileName: String
   // assigned name
  var filePath: String
   // total file size got from the server
  var onDiskSize: Double
   // download path
  var totalSize: Double
}

object FinalDownloadInfo {
  @scala.inline
  def apply(downloadedSize: Double, fileName: String, filePath: String, onDiskSize: Double, totalSize: Double): FinalDownloadInfo = {
    val __obj = js.Dynamic.literal(downloadedSize = downloadedSize.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], onDiskSize = onDiskSize.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalDownloadInfo]
  }
}

