package typings.naverDashWhale.whaleNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bookmarksNs {
  type BookmarkChangedEvent = Event[
    js.Function2[
      /* id */ String, 
      /* changeInfo */ typings.chrome.chromeNs.bookmarksNs.BookmarkChangeInfo, 
      Unit
    ]
  ]
  type BookmarkChildrenReordered = Event[
    js.Function2[
      /* id */ String, 
      /* reorderInfo */ typings.chrome.chromeNs.bookmarksNs.BookmarkReorderInfo, 
      Unit
    ]
  ]
  type BookmarkCreatedEvent = Event[
    js.Function2[
      /* id */ String, 
      /* bookmark */ typings.chrome.chromeNs.bookmarksNs.BookmarkTreeNode, 
      Unit
    ]
  ]
  type BookmarkImportBeganEvent = Event[js.Function0[Unit]]
  type BookmarkImportEndedEvent = Event[js.Function0[Unit]]
  type BookmarkMovedEvent = Event[
    js.Function2[
      /* id */ String, 
      /* moveInfo */ typings.chrome.chromeNs.bookmarksNs.BookmarkMoveInfo, 
      Unit
    ]
  ]
  type BookmarkRemovedEvent = Event[
    js.Function2[
      /* id */ String, 
      /* removeInfo */ typings.chrome.chromeNs.bookmarksNs.BookmarkRemoveInfo, 
      Unit
    ]
  ]
}
