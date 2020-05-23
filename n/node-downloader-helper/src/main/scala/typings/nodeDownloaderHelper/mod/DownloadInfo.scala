package typings.nodeDownloaderHelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadInfo extends js.Object {
   // if the download is a resume,
  var downloadedSize: Double
   // total file size got from the server
  var fileName: String
   // assigned name
  var filePath: String
   // download path
  var isResumed: Boolean
  var totalSize: Double
}

object DownloadInfo {
  @scala.inline
  def apply(downloadedSize: Double, fileName: String, filePath: String, isResumed: Boolean, totalSize: Double): DownloadInfo = {
    val __obj = js.Dynamic.literal(downloadedSize = downloadedSize.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], isResumed = isResumed.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadInfo]
  }
}

