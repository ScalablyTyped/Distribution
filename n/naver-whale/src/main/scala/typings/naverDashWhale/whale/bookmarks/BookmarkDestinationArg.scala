package typings.naverDashWhale.whale.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkDestinationArg extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var parentId: js.UndefOr[String] = js.undefined
}

object BookmarkDestinationArg {
  @scala.inline
  def apply(index: Int | Double = null, parentId: String = null): BookmarkDestinationArg = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarkDestinationArg]
  }
}

