package typings.naverDashWhale.whale.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkRemoveInfo extends js.Object {
  var index: Double
  var node: typings.chrome.chrome.bookmarks.BookmarkTreeNode
  var parentId: String
}

object BookmarkRemoveInfo {
  @scala.inline
  def apply(index: Double, node: typings.chrome.chrome.bookmarks.BookmarkTreeNode, parentId: String): BookmarkRemoveInfo = {
    val __obj = js.Dynamic.literal(index = index, node = node, parentId = parentId)
  
    __obj.asInstanceOf[BookmarkRemoveInfo]
  }
}

