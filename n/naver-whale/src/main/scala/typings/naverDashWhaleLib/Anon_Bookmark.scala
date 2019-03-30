package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Bookmark extends js.Object {
  var MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE: scala.Double = js.native
  var MAX_WRITE_OPERATIONS_PER_HOUR: scala.Double = js.native
  var onChanged: chromeLib.chromeNs.bookmarksNs.BookmarkChangedEvent = js.native
  var onChildrenReordered: chromeLib.chromeNs.bookmarksNs.BookmarkChildrenReordered = js.native
  var onCreated: chromeLib.chromeNs.bookmarksNs.BookmarkCreatedEvent = js.native
  var onImportBegan: chromeLib.chromeNs.bookmarksNs.BookmarkImportBeganEvent = js.native
  var onImportEnded: chromeLib.chromeNs.bookmarksNs.BookmarkImportEndedEvent = js.native
  var onMoved: chromeLib.chromeNs.bookmarksNs.BookmarkMovedEvent = js.native
  var onRemoved: chromeLib.chromeNs.bookmarksNs.BookmarkRemovedEvent = js.native
  def create(bookmark: chromeLib.chromeNs.bookmarksNs.BookmarkCreateArg): scala.Unit = js.native
  def create(
    bookmark: chromeLib.chromeNs.bookmarksNs.BookmarkCreateArg,
    callback: js.Function1[/* result */ chromeLib.chromeNs.bookmarksNs.BookmarkTreeNode, scala.Unit]
  ): scala.Unit = js.native
  def get(
    idList: js.Array[java.lang.String],
    callback: js.Function1[
      /* results */ js.Array[chromeLib.chromeNs.bookmarksNs.BookmarkTreeNode], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def get(
    id: java.lang.String,
    callback: js.Function1[
      /* results */ js.Array[chromeLib.chromeNs.bookmarksNs.BookmarkTreeNode], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getChildren(
    id: java.lang.String,
    callback: js.Function1[
      /* results */ js.Array[chromeLib.chromeNs.bookmarksNs.BookmarkTreeNode], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getRecent(
    numberOfItems: scala.Double,
    callback: js.Function1[
      /* results */ js.Array[chromeLib.chromeNs.bookmarksNs.BookmarkTreeNode], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getSubTree(
    id: java.lang.String,
    callback: js.Function1[
      /* results */ js.Array[chromeLib.chromeNs.bookmarksNs.BookmarkTreeNode], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getTree(
    callback: js.Function1[
      /* results */ js.Array[chromeLib.chromeNs.bookmarksNs.BookmarkTreeNode], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def move(id: java.lang.String, destination: chromeLib.chromeNs.bookmarksNs.BookmarkDestinationArg): scala.Unit = js.native
  def move(
    id: java.lang.String,
    destination: chromeLib.chromeNs.bookmarksNs.BookmarkDestinationArg,
    callback: js.Function1[/* result */ chromeLib.chromeNs.bookmarksNs.BookmarkTreeNode, scala.Unit]
  ): scala.Unit = js.native
  def remove(id: java.lang.String): scala.Unit = js.native
  def remove(id: java.lang.String, callback: js.Function): scala.Unit = js.native
  def removeTree(id: java.lang.String): scala.Unit = js.native
  def removeTree(id: java.lang.String, callback: js.Function): scala.Unit = js.native
  def search(
    query: chromeLib.chromeNs.bookmarksNs.BookmarkSearchQuery,
    callback: js.Function1[
      /* results */ js.Array[chromeLib.chromeNs.bookmarksNs.BookmarkTreeNode], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def search(
    query: java.lang.String,
    callback: js.Function1[
      /* results */ js.Array[chromeLib.chromeNs.bookmarksNs.BookmarkTreeNode], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def update(id: java.lang.String, changes: chromeLib.chromeNs.bookmarksNs.BookmarkChangesArg): scala.Unit = js.native
  def update(
    id: java.lang.String,
    changes: chromeLib.chromeNs.bookmarksNs.BookmarkChangesArg,
    callback: js.Function1[/* result */ chromeLib.chromeNs.bookmarksNs.BookmarkTreeNode, scala.Unit]
  ): scala.Unit = js.native
}

