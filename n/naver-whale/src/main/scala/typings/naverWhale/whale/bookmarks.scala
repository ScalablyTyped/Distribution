package typings.naverWhale.whale

import typings.chrome.chrome.events.Event
import typings.naverWhale.naverWhaleStrings.managed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Bookmarks
////////////////////
/**
  * Use the chrome.bookmarks API to create, organize, and otherwise manipulate bookmarks. Also see Override Pages, which you can use to create a custom Bookmark Manager page.
  * Availability: Since Chrome 5.
  * Permissions:  "bookmarks"
  */
object bookmarks {
  
  trait BookmarkChangeInfo extends StObject {
    
    var title: String
    
    var url: js.UndefOr[String] = js.undefined
  }
  object BookmarkChangeInfo {
    
    inline def apply(title: String): BookmarkChangeInfo = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[BookmarkChangeInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BookmarkChangeInfo] (val x: Self) extends AnyVal {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type BookmarkChangedEvent = Event[
    js.Function2[
      /* id */ String, 
      /* changeInfo */ typings.chrome.chrome.bookmarks.BookmarkChangeInfo, 
      Unit
    ]
  ]
  
  trait BookmarkChangesArg extends StObject {
    
    var title: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object BookmarkChangesArg {
    
    inline def apply(): BookmarkChangesArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BookmarkChangesArg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BookmarkChangesArg] (val x: Self) extends AnyVal {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type BookmarkChildrenReordered = Event[
    js.Function2[
      /* id */ String, 
      /* reorderInfo */ typings.chrome.chrome.bookmarks.BookmarkReorderInfo, 
      Unit
    ]
  ]
  
  trait BookmarkCreateArg extends StObject {
    
    var index: js.UndefOr[Double] = js.undefined
    
    /** Optional. Defaults to the Other Bookmarks folder.  */
    var parentId: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object BookmarkCreateArg {
    
    inline def apply(): BookmarkCreateArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BookmarkCreateArg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BookmarkCreateArg] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type BookmarkCreatedEvent = Event[
    js.Function2[
      /* id */ String, 
      /* bookmark */ typings.chrome.chrome.bookmarks.BookmarkTreeNode, 
      Unit
    ]
  ]
  
  trait BookmarkDestinationArg extends StObject {
    
    var index: js.UndefOr[Double] = js.undefined
    
    var parentId: js.UndefOr[String] = js.undefined
  }
  object BookmarkDestinationArg {
    
    inline def apply(): BookmarkDestinationArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BookmarkDestinationArg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BookmarkDestinationArg] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    }
  }
  
  type BookmarkImportBeganEvent = Event[js.Function0[Unit]]
  
  type BookmarkImportEndedEvent = Event[js.Function0[Unit]]
  
  trait BookmarkMoveInfo extends StObject {
    
    var index: Double
    
    var oldIndex: Double
    
    var oldParentId: String
    
    var parentId: String
  }
  object BookmarkMoveInfo {
    
    inline def apply(index: Double, oldIndex: Double, oldParentId: String, parentId: String): BookmarkMoveInfo = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldParentId = oldParentId.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BookmarkMoveInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BookmarkMoveInfo] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
      
      inline def setOldParentId(value: String): Self = StObject.set(x, "oldParentId", value.asInstanceOf[js.Any])
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    }
  }
  
  type BookmarkMovedEvent = Event[
    js.Function2[
      /* id */ String, 
      /* moveInfo */ typings.chrome.chrome.bookmarks.BookmarkMoveInfo, 
      Unit
    ]
  ]
  
  trait BookmarkRemoveInfo extends StObject {
    
    var index: Double
    
    var node: typings.chrome.chrome.bookmarks.BookmarkTreeNode
    
    var parentId: String
  }
  object BookmarkRemoveInfo {
    
    inline def apply(index: Double, node: typings.chrome.chrome.bookmarks.BookmarkTreeNode, parentId: String): BookmarkRemoveInfo = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BookmarkRemoveInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BookmarkRemoveInfo] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setNode(value: typings.chrome.chrome.bookmarks.BookmarkTreeNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    }
  }
  
  type BookmarkRemovedEvent = Event[
    js.Function2[
      /* id */ String, 
      /* removeInfo */ typings.chrome.chrome.bookmarks.BookmarkRemoveInfo, 
      Unit
    ]
  ]
  
  trait BookmarkReorderInfo extends StObject {
    
    var childIds: js.Array[String]
  }
  object BookmarkReorderInfo {
    
    inline def apply(childIds: js.Array[String]): BookmarkReorderInfo = {
      val __obj = js.Dynamic.literal(childIds = childIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[BookmarkReorderInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BookmarkReorderInfo] (val x: Self) extends AnyVal {
      
      inline def setChildIds(value: js.Array[String]): Self = StObject.set(x, "childIds", value.asInstanceOf[js.Any])
      
      inline def setChildIdsVarargs(value: String*): Self = StObject.set(x, "childIds", js.Array(value*))
    }
  }
  
  trait BookmarkSearchQuery extends StObject {
    
    var query: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object BookmarkSearchQuery {
    
    inline def apply(): BookmarkSearchQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BookmarkSearchQuery]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BookmarkSearchQuery] (val x: Self) extends AnyVal {
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait BookmarkTreeNode extends StObject {
    
    /** Optional. An ordered list of children of this node.  */
    var children: js.UndefOr[js.Array[typings.chrome.chrome.bookmarks.BookmarkTreeNode]] = js.undefined
    
    /** Optional. When this node was created, in milliseconds since the epoch (new Date(dateAdded)).  */
    var dateAdded: js.UndefOr[Double] = js.undefined
    
    /** Optional. When the contents of this folder last changed, in milliseconds since the epoch.   */
    var dateGroupModified: js.UndefOr[Double] = js.undefined
    
    /** The unique identifier for the node. IDs are unique within the current profile, and they remain valid even after the browser is restarted.  */
    var id: String
    
    /** Optional. The 0-based position of this node within its parent folder.  */
    var index: js.UndefOr[Double] = js.undefined
    
    /** Optional. The id of the parent folder. Omitted for the root node.   */
    var parentId: js.UndefOr[String] = js.undefined
    
    /** The text displayed for the node. */
    var title: String
    
    /**
      * Optional.
      * Since Chrome 37.
      * Indicates the reason why this node is unmodifiable. The managed value indicates that this node was configured by the system administrator or by the custodian of a supervised user. Omitted if the node can be modified by the user and the extension (default).
      */
    var unmodifiable: js.UndefOr[managed] = js.undefined
    
    /** Optional. The URL navigated to when a user clicks the bookmark. Omitted for folders.   */
    var url: js.UndefOr[String] = js.undefined
  }
  object BookmarkTreeNode {
    
    inline def apply(id: String, title: String): BookmarkTreeNode = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[BookmarkTreeNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BookmarkTreeNode] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[typings.chrome.chrome.bookmarks.BookmarkTreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: typings.chrome.chrome.bookmarks.BookmarkTreeNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDateAdded(value: Double): Self = StObject.set(x, "dateAdded", value.asInstanceOf[js.Any])
      
      inline def setDateAddedUndefined: Self = StObject.set(x, "dateAdded", js.undefined)
      
      inline def setDateGroupModified(value: Double): Self = StObject.set(x, "dateGroupModified", value.asInstanceOf[js.Any])
      
      inline def setDateGroupModifiedUndefined: Self = StObject.set(x, "dateGroupModified", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUnmodifiable(value: managed): Self = StObject.set(x, "unmodifiable", value.asInstanceOf[js.Any])
      
      inline def setUnmodifiableUndefined: Self = StObject.set(x, "unmodifiable", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
