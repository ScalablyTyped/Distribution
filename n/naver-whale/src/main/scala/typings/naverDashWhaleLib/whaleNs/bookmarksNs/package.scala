package typings
package naverDashWhaleLib.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bookmarksNs {
  type BookmarkChangedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* changeInfo */ chromeLib.chromeNs.bookmarksNs.BookmarkChangeInfo, 
      scala.Unit
    ]
  ]
  type BookmarkChildrenReordered = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* reorderInfo */ chromeLib.chromeNs.bookmarksNs.BookmarkReorderInfo, 
      scala.Unit
    ]
  ]
  type BookmarkCreatedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* bookmark */ chromeLib.chromeNs.bookmarksNs.BookmarkTreeNode, 
      scala.Unit
    ]
  ]
  type BookmarkImportBeganEvent = chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  type BookmarkImportEndedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  type BookmarkMovedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* moveInfo */ chromeLib.chromeNs.bookmarksNs.BookmarkMoveInfo, 
      scala.Unit
    ]
  ]
  type BookmarkRemovedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* removeInfo */ chromeLib.chromeNs.bookmarksNs.BookmarkRemoveInfo, 
      scala.Unit
    ]
  ]
}
