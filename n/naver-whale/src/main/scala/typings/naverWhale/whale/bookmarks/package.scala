package typings.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object bookmarks {
  
  type BookmarkChangedEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* changeInfo */ typings.chrome.chrome.bookmarks.BookmarkChangeInfo, 
      scala.Unit
    ]
  ]
  
  type BookmarkChildrenReordered = typings.chrome.chrome.events.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* reorderInfo */ typings.chrome.chrome.bookmarks.BookmarkReorderInfo, 
      scala.Unit
    ]
  ]
  
  type BookmarkCreatedEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* bookmark */ typings.chrome.chrome.bookmarks.BookmarkTreeNode, 
      scala.Unit
    ]
  ]
  
  type BookmarkImportBeganEvent = typings.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  
  type BookmarkImportEndedEvent = typings.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  
  type BookmarkMovedEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* moveInfo */ typings.chrome.chrome.bookmarks.BookmarkMoveInfo, 
      scala.Unit
    ]
  ]
  
  type BookmarkRemovedEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* removeInfo */ typings.chrome.chrome.bookmarks.BookmarkRemoveInfo, 
      scala.Unit
    ]
  ]
}
