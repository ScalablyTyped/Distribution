package typings.naverDashWhale.whaleNs.bookmarksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bookmarks")
@js.native
object ^ extends js.Object {
  var MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE: Double = js.native
  var MAX_WRITE_OPERATIONS_PER_HOUR: Double = js.native
  var onChanged: typings.chrome.chromeNs.bookmarksNs.BookmarkChangedEvent = js.native
  var onChildrenReordered: typings.chrome.chromeNs.bookmarksNs.BookmarkChildrenReordered = js.native
  var onCreated: typings.chrome.chromeNs.bookmarksNs.BookmarkCreatedEvent = js.native
  var onImportBegan: typings.chrome.chromeNs.bookmarksNs.BookmarkImportBeganEvent = js.native
  var onImportEnded: typings.chrome.chromeNs.bookmarksNs.BookmarkImportEndedEvent = js.native
  var onMoved: typings.chrome.chromeNs.bookmarksNs.BookmarkMovedEvent = js.native
  var onRemoved: typings.chrome.chromeNs.bookmarksNs.BookmarkRemovedEvent = js.native
  def create(bookmark: typings.chrome.chromeNs.bookmarksNs.BookmarkCreateArg): Unit = js.native
  def create(
    bookmark: typings.chrome.chromeNs.bookmarksNs.BookmarkCreateArg,
    callback: js.Function1[/* result */ typings.chrome.chromeNs.bookmarksNs.BookmarkTreeNode, Unit]
  ): Unit = js.native
  def get(
    idList: js.Array[String],
    callback: js.Function1[/* results */ js.Array[typings.chrome.chromeNs.bookmarksNs.BookmarkTreeNode], Unit]
  ): Unit = js.native
  def get(
    id: String,
    callback: js.Function1[/* results */ js.Array[typings.chrome.chromeNs.bookmarksNs.BookmarkTreeNode], Unit]
  ): Unit = js.native
  def getChildren(
    id: String,
    callback: js.Function1[/* results */ js.Array[typings.chrome.chromeNs.bookmarksNs.BookmarkTreeNode], Unit]
  ): Unit = js.native
  def getRecent(
    numberOfItems: Double,
    callback: js.Function1[/* results */ js.Array[typings.chrome.chromeNs.bookmarksNs.BookmarkTreeNode], Unit]
  ): Unit = js.native
  def getSubTree(
    id: String,
    callback: js.Function1[/* results */ js.Array[typings.chrome.chromeNs.bookmarksNs.BookmarkTreeNode], Unit]
  ): Unit = js.native
  def getTree(
    callback: js.Function1[/* results */ js.Array[typings.chrome.chromeNs.bookmarksNs.BookmarkTreeNode], Unit]
  ): Unit = js.native
  def move(id: String, destination: typings.chrome.chromeNs.bookmarksNs.BookmarkDestinationArg): Unit = js.native
  def move(
    id: String,
    destination: typings.chrome.chromeNs.bookmarksNs.BookmarkDestinationArg,
    callback: js.Function1[/* result */ typings.chrome.chromeNs.bookmarksNs.BookmarkTreeNode, Unit]
  ): Unit = js.native
  def remove(id: String): Unit = js.native
  def remove(id: String, callback: js.Function): Unit = js.native
  def removeTree(id: String): Unit = js.native
  def removeTree(id: String, callback: js.Function): Unit = js.native
  def search(
    query: String,
    callback: js.Function1[/* results */ js.Array[typings.chrome.chromeNs.bookmarksNs.BookmarkTreeNode], Unit]
  ): Unit = js.native
  def search(
    query: typings.chrome.chromeNs.bookmarksNs.BookmarkSearchQuery,
    callback: js.Function1[/* results */ js.Array[typings.chrome.chromeNs.bookmarksNs.BookmarkTreeNode], Unit]
  ): Unit = js.native
  def update(id: String, changes: typings.chrome.chromeNs.bookmarksNs.BookmarkChangesArg): Unit = js.native
  def update(
    id: String,
    changes: typings.chrome.chromeNs.bookmarksNs.BookmarkChangesArg,
    callback: js.Function1[/* result */ typings.chrome.chromeNs.bookmarksNs.BookmarkTreeNode, Unit]
  ): Unit = js.native
}

