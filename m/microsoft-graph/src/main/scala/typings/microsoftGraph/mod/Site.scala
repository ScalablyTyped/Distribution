package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Site extends BaseItem {
  // Analytics about the view activities that took place in this site.
  var analytics: js.UndefOr[ItemAnalytics] = js.native
  // The collection of column definitions reusable across lists under this site.
  var columns: js.UndefOr[js.Array[ColumnDefinition]] = js.native
  // The collection of content types defined for this site.
  var contentTypes: js.UndefOr[js.Array[ContentType]] = js.native
  // The full title for the site. Read-only.
  var displayName: js.UndefOr[String] = js.native
  // The default drive (document library) for this site.
  var drive: js.UndefOr[Drive] = js.native
  // The collection of drives (document libraries) under this site.
  var drives: js.UndefOr[js.Array[Drive]] = js.native
  var error: js.UndefOr[PublicError] = js.native
  // Used to address any item contained in this site. This collection cannot be enumerated.
  var items: js.UndefOr[js.Array[BaseItem]] = js.native
  // The collection of lists under this site.
  var lists: js.UndefOr[js.Array[List]] = js.native
  // Calls the OneNote service for notebook related operations.
  var onenote: js.UndefOr[Onenote] = js.native
  // If present, indicates that this is the root site in the site collection. Read-only.
  var root: js.UndefOr[Root] = js.native
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[SharepointIds] = js.native
  // Provides details about the site's site collection. Available only on the root site. Read-only.
  var siteCollection: js.UndefOr[SiteCollection] = js.native
  // The collection of the sub-sites under this site.
  var sites: js.UndefOr[js.Array[Site]] = js.native
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
    def setAnalytics(value: ItemAnalytics): Self = this.set("analytics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalytics: Self = this.set("analytics", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: ColumnDefinition*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[ColumnDefinition]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setContentTypesVarargs(value: ContentType*): Self = this.set("contentTypes", js.Array(value :_*))
    @scala.inline
    def setContentTypes(value: js.Array[ContentType]): Self = this.set("contentTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentTypes: Self = this.set("contentTypes", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setDrive(value: Drive): Self = this.set("drive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrive: Self = this.set("drive", js.undefined)
    @scala.inline
    def setDrivesVarargs(value: Drive*): Self = this.set("drives", js.Array(value :_*))
    @scala.inline
    def setDrives(value: js.Array[Drive]): Self = this.set("drives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrives: Self = this.set("drives", js.undefined)
    @scala.inline
    def setError(value: PublicError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setItemsVarargs(value: BaseItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[BaseItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setListsVarargs(value: List*): Self = this.set("lists", js.Array(value :_*))
    @scala.inline
    def setLists(value: js.Array[List]): Self = this.set("lists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLists: Self = this.set("lists", js.undefined)
    @scala.inline
    def setOnenote(value: Onenote): Self = this.set("onenote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnenote: Self = this.set("onenote", js.undefined)
    @scala.inline
    def setRoot(value: Root): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setSharepointIds(value: SharepointIds): Self = this.set("sharepointIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharepointIds: Self = this.set("sharepointIds", js.undefined)
    @scala.inline
    def setSiteCollection(value: SiteCollection): Self = this.set("siteCollection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteCollection: Self = this.set("siteCollection", js.undefined)
    @scala.inline
    def setSitesVarargs(value: Site*): Self = this.set("sites", js.Array(value :_*))
    @scala.inline
    def setSites(value: js.Array[Site]): Self = this.set("sites", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSites: Self = this.set("sites", js.undefined)
  }
  
}

