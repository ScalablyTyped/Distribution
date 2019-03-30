package typings
package naverDashWhaleLib.whaleNs.bookmarksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkSearchQuery extends js.Object {
  var query: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object BookmarkSearchQuery {
  @scala.inline
  def apply(query: java.lang.String = null, title: java.lang.String = null, url: java.lang.String = null): BookmarkSearchQuery = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[BookmarkSearchQuery]
  }
}

