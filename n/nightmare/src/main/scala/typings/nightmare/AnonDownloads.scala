package typings.nightmare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDownloads extends js.Object {
  var downloads: js.UndefOr[String] = js.undefined
}

object AnonDownloads {
  @scala.inline
  def apply(downloads: String = null): AnonDownloads = {
    val __obj = js.Dynamic.literal()
    if (downloads != null) __obj.updateDynamic("downloads")(downloads.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDownloads]
  }
}

