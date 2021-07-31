package typings.microsoftGraph.mod

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
  
  // Used to address any item contained in this site. This collection cannot be enumerated.
  var items: js.UndefOr[NullableOption[js.Array[BaseItem]]] = js.undefined
  
  // The collection of lists under this site.
  var lists: js.UndefOr[NullableOption[js.Array[List]]] = js.undefined
  
  // Calls the OneNote service for notebook related operations.
  var onenote: js.UndefOr[NullableOption[Onenote]] = js.undefined
  
  // If present, indicates that this is the root site in the site collection. Read-only.
  var root: js.UndefOr[NullableOption[Root]] = js.undefined
  
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[NullableOption[SharepointIds]] = js.undefined
  
  // Provides details about the site's site collection. Available only on the root site. Read-only.
  var siteCollection: js.UndefOr[NullableOption[SiteCollection]] = js.undefined
  
  // The collection of the sub-sites under this site.
  var sites: js.UndefOr[NullableOption[js.Array[Site]]] = js.undefined
}
object Site {
  
  @scala.inline
  def apply(): Site = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Site]
  }
  
  @scala.inline
  implicit class SiteMutableBuilder[Self <: Site] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalytics(value: NullableOption[ItemAnalytics]): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyticsNull: Self = StObject.set(x, "analytics", null)
    
    @scala.inline
    def setAnalyticsUndefined: Self = StObject.set(x, "analytics", js.undefined)
    
    @scala.inline
    def setColumns(value: NullableOption[js.Array[ColumnDefinition]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsNull: Self = StObject.set(x, "columns", null)
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: ColumnDefinition*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setContentTypes(value: NullableOption[js.Array[ContentType]]): Self = StObject.set(x, "contentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypesNull: Self = StObject.set(x, "contentTypes", null)
    
    @scala.inline
    def setContentTypesUndefined: Self = StObject.set(x, "contentTypes", js.undefined)
    
    @scala.inline
    def setContentTypesVarargs(value: ContentType*): Self = StObject.set(x, "contentTypes", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setDrive(value: NullableOption[Drive]): Self = StObject.set(x, "drive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveNull: Self = StObject.set(x, "drive", null)
    
    @scala.inline
    def setDriveUndefined: Self = StObject.set(x, "drive", js.undefined)
    
    @scala.inline
    def setDrives(value: NullableOption[js.Array[Drive]]): Self = StObject.set(x, "drives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrivesNull: Self = StObject.set(x, "drives", null)
    
    @scala.inline
    def setDrivesUndefined: Self = StObject.set(x, "drives", js.undefined)
    
    @scala.inline
    def setDrivesVarargs(value: Drive*): Self = StObject.set(x, "drives", js.Array(value :_*))
    
    @scala.inline
    def setError(value: NullableOption[PublicError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = StObject.set(x, "error", null)
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setItems(value: NullableOption[js.Array[BaseItem]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsNull: Self = StObject.set(x, "items", null)
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: BaseItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setLists(value: NullableOption[js.Array[List]]): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListsNull: Self = StObject.set(x, "lists", null)
    
    @scala.inline
    def setListsUndefined: Self = StObject.set(x, "lists", js.undefined)
    
    @scala.inline
    def setListsVarargs(value: List*): Self = StObject.set(x, "lists", js.Array(value :_*))
    
    @scala.inline
    def setOnenote(value: NullableOption[Onenote]): Self = StObject.set(x, "onenote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnenoteNull: Self = StObject.set(x, "onenote", null)
    
    @scala.inline
    def setOnenoteUndefined: Self = StObject.set(x, "onenote", js.undefined)
    
    @scala.inline
    def setRoot(value: NullableOption[Root]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setSharepointIds(value: NullableOption[SharepointIds]): Self = StObject.set(x, "sharepointIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharepointIdsNull: Self = StObject.set(x, "sharepointIds", null)
    
    @scala.inline
    def setSharepointIdsUndefined: Self = StObject.set(x, "sharepointIds", js.undefined)
    
    @scala.inline
    def setSiteCollection(value: NullableOption[SiteCollection]): Self = StObject.set(x, "siteCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteCollectionNull: Self = StObject.set(x, "siteCollection", null)
    
    @scala.inline
    def setSiteCollectionUndefined: Self = StObject.set(x, "siteCollection", js.undefined)
    
    @scala.inline
    def setSites(value: NullableOption[js.Array[Site]]): Self = StObject.set(x, "sites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSitesNull: Self = StObject.set(x, "sites", null)
    
    @scala.inline
    def setSitesUndefined: Self = StObject.set(x, "sites", js.undefined)
    
    @scala.inline
    def setSitesVarargs(value: Site*): Self = StObject.set(x, "sites", js.Array(value :_*))
  }
}
