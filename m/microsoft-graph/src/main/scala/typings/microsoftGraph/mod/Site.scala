package typings.microsoftGraph.mod

import typings.microsoftGraph.mod.TermStore.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Site
  extends StObject
     with BaseItem {
  
  // Analytics about the view activities that took place in this site.
  var analytics: js.UndefOr[NullableOption[ItemAnalytics]] = js.undefined
  
  // The collection of column definitions reusable across lists under this site.
  var columns: js.UndefOr[NullableOption[js.Array[ColumnDefinition]]] = js.undefined
  
  // The collection of content types defined for this site.
  var contentTypes: js.UndefOr[NullableOption[js.Array[ContentType]]] = js.undefined
  
  // The full title for the site. Read-only.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The default drive (document library) for this site.
  var drive: js.UndefOr[NullableOption[Drive]] = js.undefined
  
  // The collection of drives (document libraries) under this site.
  var drives: js.UndefOr[NullableOption[js.Array[Drive]]] = js.undefined
  
  var error: js.UndefOr[NullableOption[PublicError]] = js.undefined
  
  var externalColumns: js.UndefOr[NullableOption[js.Array[ColumnDefinition]]] = js.undefined
  
  // Used to address any item contained in this site. This collection can't be enumerated.
  var items: js.UndefOr[NullableOption[js.Array[BaseItem]]] = js.undefined
  
  // The collection of lists under this site.
  var lists: js.UndefOr[NullableOption[js.Array[typings.microsoftGraph.mod.List]]] = js.undefined
  
  // Calls the OneNote service for notebook related operations.
  var onenote: js.UndefOr[NullableOption[Onenote]] = js.undefined
  
  // The collection of long-running operations on the site.
  var operations: js.UndefOr[NullableOption[js.Array[RichLongRunningOperation]]] = js.undefined
  
  // The permissions associated with the site. Nullable.
  var permissions: js.UndefOr[NullableOption[js.Array[Permission]]] = js.undefined
  
  // If present, indicates that this is the root site in the site collection. Read-only.
  var root: js.UndefOr[NullableOption[Root]] = js.undefined
  
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[NullableOption[SharepointIds]] = js.undefined
  
  // Provides details about the site's site collection. Available only on the root site. Read-only.
  var siteCollection: js.UndefOr[NullableOption[SiteCollection]] = js.undefined
  
  // The collection of the sub-sites under this site.
  var sites: js.UndefOr[NullableOption[js.Array[Site]]] = js.undefined
  
  // The default termStore under this site.
  var termStore: js.UndefOr[NullableOption[Store]] = js.undefined
  
  // The collection of termStores under this site.
  var termStores: js.UndefOr[NullableOption[js.Array[Store]]] = js.undefined
}
object Site {
  
  inline def apply(): Site = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Site]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Site] (val x: Self) extends AnyVal {
    
    inline def setAnalytics(value: NullableOption[ItemAnalytics]): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsNull: Self = StObject.set(x, "analytics", null)
    
    inline def setAnalyticsUndefined: Self = StObject.set(x, "analytics", js.undefined)
    
    inline def setColumns(value: NullableOption[js.Array[ColumnDefinition]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsNull: Self = StObject.set(x, "columns", null)
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: ColumnDefinition*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setContentTypes(value: NullableOption[js.Array[ContentType]]): Self = StObject.set(x, "contentTypes", value.asInstanceOf[js.Any])
    
    inline def setContentTypesNull: Self = StObject.set(x, "contentTypes", null)
    
    inline def setContentTypesUndefined: Self = StObject.set(x, "contentTypes", js.undefined)
    
    inline def setContentTypesVarargs(value: ContentType*): Self = StObject.set(x, "contentTypes", js.Array(value*))
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDrive(value: NullableOption[Drive]): Self = StObject.set(x, "drive", value.asInstanceOf[js.Any])
    
    inline def setDriveNull: Self = StObject.set(x, "drive", null)
    
    inline def setDriveUndefined: Self = StObject.set(x, "drive", js.undefined)
    
    inline def setDrives(value: NullableOption[js.Array[Drive]]): Self = StObject.set(x, "drives", value.asInstanceOf[js.Any])
    
    inline def setDrivesNull: Self = StObject.set(x, "drives", null)
    
    inline def setDrivesUndefined: Self = StObject.set(x, "drives", js.undefined)
    
    inline def setDrivesVarargs(value: Drive*): Self = StObject.set(x, "drives", js.Array(value*))
    
    inline def setError(value: NullableOption[PublicError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExternalColumns(value: NullableOption[js.Array[ColumnDefinition]]): Self = StObject.set(x, "externalColumns", value.asInstanceOf[js.Any])
    
    inline def setExternalColumnsNull: Self = StObject.set(x, "externalColumns", null)
    
    inline def setExternalColumnsUndefined: Self = StObject.set(x, "externalColumns", js.undefined)
    
    inline def setExternalColumnsVarargs(value: ColumnDefinition*): Self = StObject.set(x, "externalColumns", js.Array(value*))
    
    inline def setItems(value: NullableOption[js.Array[BaseItem]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsNull: Self = StObject.set(x, "items", null)
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: BaseItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLists(value: NullableOption[js.Array[typings.microsoftGraph.mod.List]]): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
    
    inline def setListsNull: Self = StObject.set(x, "lists", null)
    
    inline def setListsUndefined: Self = StObject.set(x, "lists", js.undefined)
    
    inline def setListsVarargs(value: typings.microsoftGraph.mod.List*): Self = StObject.set(x, "lists", js.Array(value*))
    
    inline def setOnenote(value: NullableOption[Onenote]): Self = StObject.set(x, "onenote", value.asInstanceOf[js.Any])
    
    inline def setOnenoteNull: Self = StObject.set(x, "onenote", null)
    
    inline def setOnenoteUndefined: Self = StObject.set(x, "onenote", js.undefined)
    
    inline def setOperations(value: NullableOption[js.Array[RichLongRunningOperation]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsNull: Self = StObject.set(x, "operations", null)
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: RichLongRunningOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setPermissions(value: NullableOption[js.Array[Permission]]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsNull: Self = StObject.set(x, "permissions", null)
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setRoot(value: NullableOption[Root]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSharepointIds(value: NullableOption[SharepointIds]): Self = StObject.set(x, "sharepointIds", value.asInstanceOf[js.Any])
    
    inline def setSharepointIdsNull: Self = StObject.set(x, "sharepointIds", null)
    
    inline def setSharepointIdsUndefined: Self = StObject.set(x, "sharepointIds", js.undefined)
    
    inline def setSiteCollection(value: NullableOption[SiteCollection]): Self = StObject.set(x, "siteCollection", value.asInstanceOf[js.Any])
    
    inline def setSiteCollectionNull: Self = StObject.set(x, "siteCollection", null)
    
    inline def setSiteCollectionUndefined: Self = StObject.set(x, "siteCollection", js.undefined)
    
    inline def setSites(value: NullableOption[js.Array[Site]]): Self = StObject.set(x, "sites", value.asInstanceOf[js.Any])
    
    inline def setSitesNull: Self = StObject.set(x, "sites", null)
    
    inline def setSitesUndefined: Self = StObject.set(x, "sites", js.undefined)
    
    inline def setSitesVarargs(value: Site*): Self = StObject.set(x, "sites", js.Array(value*))
    
    inline def setTermStore(value: NullableOption[Store]): Self = StObject.set(x, "termStore", value.asInstanceOf[js.Any])
    
    inline def setTermStoreNull: Self = StObject.set(x, "termStore", null)
    
    inline def setTermStoreUndefined: Self = StObject.set(x, "termStore", js.undefined)
    
    inline def setTermStores(value: NullableOption[js.Array[Store]]): Self = StObject.set(x, "termStores", value.asInstanceOf[js.Any])
    
    inline def setTermStoresNull: Self = StObject.set(x, "termStores", null)
    
    inline def setTermStoresUndefined: Self = StObject.set(x, "termStores", js.undefined)
    
    inline def setTermStoresVarargs(value: Store*): Self = StObject.set(x, "termStores", js.Array(value*))
  }
}
