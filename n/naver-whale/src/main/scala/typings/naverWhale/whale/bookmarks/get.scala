package typings.naverWhale.whale.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bookmarks.get")
@js.native
object get extends js.Object {
  def apply(
    idList: js.Array[String],
    callback: js.Function1[/* results */ js.Array[typings.chrome.chrome.bookmarks.BookmarkTreeNode], Unit]
  ): Unit = js.native
  def apply(
    id: String,
    callback: js.Function1[/* results */ js.Array[typings.chrome.chrome.bookmarks.BookmarkTreeNode], Unit]
  ): Unit = js.native
}

