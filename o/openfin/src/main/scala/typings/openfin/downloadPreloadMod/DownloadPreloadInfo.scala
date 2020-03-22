package typings.openfin.downloadPreloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadPreloadInfo extends js.Object {
  var error: String
  var success: Boolean
  var url: js.UndefOr[String] = js.undefined
}

object DownloadPreloadInfo {
  @scala.inline
  def apply(error: String, success: Boolean, url: String = null): DownloadPreloadInfo = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadPreloadInfo]
  }
}

