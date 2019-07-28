package typings.naverDashWhale.whaleNs.bookmarksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkRemoveInfo extends js.Object {
  var index: Double
  var node: typings.chrome.chromeNs.bookmarksNs.BookmarkTreeNode
  var parentId: String
}

object BookmarkRemoveInfo {
  @scala.inline
  def apply(index: Double, node: typings.chrome.chromeNs.bookmarksNs.BookmarkTreeNode, parentId: String): BookmarkRemoveInfo = {
    val __obj = js.Dynamic.literal(index = index, node = node, parentId = parentId)
  
    __obj.asInstanceOf[BookmarkRemoveInfo]
  }
}

