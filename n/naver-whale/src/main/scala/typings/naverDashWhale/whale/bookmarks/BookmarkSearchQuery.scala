package typings.naverDashWhale.whale.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkSearchQuery extends js.Object {
  var query: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object BookmarkSearchQuery {
  @scala.inline
  def apply(query: String = null, title: String = null, url: String = null): BookmarkSearchQuery = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[BookmarkSearchQuery]
  }
}

