package typings.naverWhale.whale.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bookmarks.move")
@js.native
object move extends js.Object {
  def apply(id: String, destination: typings.chrome.chrome.bookmarks.BookmarkDestinationArg): Unit = js.native
  def apply(
    id: String,
    destination: typings.chrome.chrome.bookmarks.BookmarkDestinationArg,
    callback: js.Function1[/* result */ typings.chrome.chrome.bookmarks.BookmarkTreeNode, Unit]
  ): Unit = js.native
}

