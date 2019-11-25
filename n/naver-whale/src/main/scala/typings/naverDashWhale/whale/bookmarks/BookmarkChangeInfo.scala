package typings.naverDashWhale.whale.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkChangeInfo extends js.Object {
  var title: String
  var url: js.UndefOr[String] = js.undefined
}

object BookmarkChangeInfo {
  @scala.inline
  def apply(title: String, url: String = null): BookmarkChangeInfo = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarkChangeInfo]
  }
}

