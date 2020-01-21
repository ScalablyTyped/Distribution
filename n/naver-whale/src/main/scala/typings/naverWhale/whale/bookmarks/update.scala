package typings.naverWhale.whale.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bookmarks.update")
@js.native
object update extends js.Object {
  def apply(id: String, changes: typings.chrome.chrome.bookmarks.BookmarkChangesArg): Unit = js.native
  def apply(
    id: String,
    changes: typings.chrome.chrome.bookmarks.BookmarkChangesArg,
    callback: js.Function1[/* result */ typings.chrome.chrome.bookmarks.BookmarkTreeNode, Unit]
  ): Unit = js.native
}

