package typings.naverWhale.whale.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bookmarks")
@js.native
object ^ extends js.Object {
  var MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE: Double = js.native
  var MAX_WRITE_OPERATIONS_PER_HOUR: Double = js.native
  var onChanged: typings.chrome.chrome.bookmarks.BookmarkChangedEvent = js.native
  var onChildrenReordered: typings.chrome.chrome.bookmarks.BookmarkChildrenReordered = js.native
  var onCreated: typings.chrome.chrome.bookmarks.BookmarkCreatedEvent = js.native
  var onImportBegan: typings.chrome.chrome.bookmarks.BookmarkImportBeganEvent = js.native
  var onImportEnded: typings.chrome.chrome.bookmarks.BookmarkImportEndedEvent = js.native
  var onMoved: typings.chrome.chrome.bookmarks.BookmarkMovedEvent = js.native
  var onRemoved: typings.chrome.chrome.bookmarks.BookmarkRemovedEvent = js.native
}

