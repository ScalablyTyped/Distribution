package typings.naverWhale.whale.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bookmarks.search")
@js.native
object search extends js.Object {
  def apply(
    query: String,
    callback: js.Function1[/* results */ js.Array[typings.chrome.chrome.bookmarks.BookmarkTreeNode], Unit]
  ): Unit = js.native
  def apply(
    query: typings.chrome.chrome.bookmarks.BookmarkSearchQuery,
    callback: js.Function1[/* results */ js.Array[typings.chrome.chrome.bookmarks.BookmarkTreeNode], Unit]
  ): Unit = js.native
}

