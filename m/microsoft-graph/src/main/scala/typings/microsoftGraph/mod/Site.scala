package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Site extends BaseItem {
  
  // Analytics about the view activities that took place in this site.
  var analytics: js.UndefOr[NullableOption[ItemAnalytics]] = js.native
  
  // The collection of column definitions reusable across lists under this site.
  var columns: js.UndefOr[NullableOption[js.Array[ColumnDefinition]]] = js.native
  
  // The collection of content types defined for this site.
  var contentTypes: js.UndefOr[NullableOption[js.Array[ContentType]]] = js.native
  
  // The full title for the site. Read-only.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The default drive (document library) for this site.
  var drive: js.UndefOr[NullableOption[Drive]] = js.native
  
  // The collection of drives (document libraries) under this site.
  var drives: js.UndefOr[NullableOption[js.Array[Drive]]] = js.native
  
  var error: js.UndefOr[NullableOption[PublicError]] = js.native
  
  // Used to address any item contained in this site. This collection cannot be enumerated.
  var items: js.UndefOr[NullableOption[js.Array[BaseItem]]] = js.native
  
  // The collection of lists under this site.
  var lists: js.UndefOr[NullableOption[js.Array[List]]] = js.native
  
  // Calls the OneNote service for notebook related operations.
  var onenote: js.UndefOr[NullableOption[Onenote]] = js.native
  
  // If present, indicates that this is the root site in the site collection. Read-only.
  var root: js.UndefOr[NullableOption[Root]] = js.native
  
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[NullableOption[SharepointIds]] = js.native
  
  // Provides details about the site's site collection. Available only on the root site. Read-only.
  var siteCollection: js.UndefOr[NullableOption[SiteCollection]] = js.native
  
  // The collection of the sub-sites under this site.
  var sites: js.UndefOr[NullableOption[js.Array[Site]]] = js.native
}
object Site {
  
  @scala.inline
  def apply(): Site = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Site]
  }
  
  @scala.inline
  implicit class SiteOps[Self <: Site] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnalytics(value: NullableOption[ItemAnalytics]): Self = this.set("analytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalytics: Self = this.set("analytics", js.undefined)
    
    @scala.inline
    def setAnalyticsNull: Self = this.set("analytics", null)
    
    @scala.inline
    def setColumnsVarargs(value: ColumnDefinition*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: NullableOption[js.Array[ColumnDefinition]]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setColumnsNull: Self = this.set("columns", null)
    
    @scala.inline
    def setContentTypesVarargs(value: ContentType*): Self = this.set("contentTypes", js.Array(value :_*))
    
    @scala.inline
    def setContentTypes(value: NullableOption[js.Array[ContentType]]): Self = this.set("contentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentTypes: Self = this.set("contentTypes", js.undefined)
    
    @scala.inline
    def setContentTypesNull: Self = this.set("contentTypes", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setDrive(value: NullableOption[Drive]): Self = this.set("drive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrive: Self = this.set("drive", js.undefined)
    
    @scala.inline
    def setDriveNull: Self = this.set("drive", null)
    
    @scala.inline
    def setDrivesVarargs(value: Drive*): Self = this.set("drives", js.Array(value :_*))
    
    @scala.inline
    def setDrives(value: NullableOption[js.Array[Drive]]): Self = this.set("drives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrives: Self = this.set("drives", js.undefined)
    
    @scala.inline
    def setDrivesNull: Self = this.set("drives", null)
    
    @scala.inline
    def setError(value: NullableOption[PublicError]): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
    
    @scala.inline
    def setItemsVarargs(value: BaseItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: NullableOption[js.Array[BaseItem]]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setItemsNull: Self = this.set("items", null)
    
    @scala.inline
    def setListsVarargs(value: List*): Self = this.set("lists", js.Array(value :_*))
    
    @scala.inline
    def setLists(value: NullableOption[js.Array[List]]): Self = this.set("lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLists: Self = this.set("lists", js.undefined)
    
    @scala.inline
    def setListsNull: Self = this.set("lists", null)
    
    @scala.inline
    def setOnenote(value: NullableOption[Onenote]): Self = this.set("onenote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnenote: Self = this.set("onenote", js.undefined)
    
    @scala.inline
    def setOnenoteNull: Self = this.set("onenote", null)
    
    @scala.inline
    def setRoot(value: NullableOption[Root]): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setSharepointIds(value: NullableOption[SharepointIds]): Self = this.set("sharepointIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharepointIds: Self = this.set("sharepointIds", js.undefined)
    
    @scala.inline
    def setSharepointIdsNull: Self = this.set("sharepointIds", null)
    
    @scala.inline
    def setSiteCollection(value: NullableOption[SiteCollection]): Self = this.set("siteCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteCollection: Self = this.set("siteCollection", js.undefined)
    
    @scala.inline
    def setSiteCollectionNull: Self = this.set("siteCollection", null)
    
    @scala.inline
    def setSitesVarargs(value: Site*): Self = this.set("sites", js.Array(value :_*))
    
    @scala.inline
    def setSites(value: NullableOption[js.Array[Site]]): Self = this.set("sites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSites: Self = this.set("sites", js.undefined)
    
    @scala.inline
    def setSitesNull: Self = this.set("sites", null)
  }
}
