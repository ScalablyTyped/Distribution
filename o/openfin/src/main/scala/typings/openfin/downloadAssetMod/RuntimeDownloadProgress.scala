package typings.openfin.downloadAssetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeDownloadProgress extends js.Object {
  var downloadedBytes: Double
  var totalBytes: Double
}

object RuntimeDownloadProgress {
  @scala.inline
  def apply(downloadedBytes: Double, totalBytes: Double): RuntimeDownloadProgress = {
    val __obj = js.Dynamic.literal(downloadedBytes = downloadedBytes.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RuntimeDownloadProgress]
  }
}

