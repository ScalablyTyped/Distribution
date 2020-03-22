package typings.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDownloadedBytes extends js.Object {
  var downloadedBytes: Double
  var totalBytes: Double
}

object AnonDownloadedBytes {
  @scala.inline
  def apply(downloadedBytes: Double, totalBytes: Double): AnonDownloadedBytes = {
    val __obj = js.Dynamic.literal(downloadedBytes = downloadedBytes.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDownloadedBytes]
  }
}

