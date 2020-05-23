package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadedBytes extends js.Object {
  var downloadedBytes: Double
  var totalBytes: Double
}

object DownloadedBytes {
  @scala.inline
  def apply(downloadedBytes: Double, totalBytes: Double): DownloadedBytes = {
    val __obj = js.Dynamic.literal(downloadedBytes = downloadedBytes.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadedBytes]
  }
}

