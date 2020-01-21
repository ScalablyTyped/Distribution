package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Site extends BaseItem {
  // Analytics about the view activities that took place in this site.
  var analytics: js.UndefOr[ItemAnalytics] = js.undefined
  // The collection of column definitions reusable across lists under this site.
  var columns: js.UndefOr[js.Array[ColumnDefinition]] = js.undefined
  // The collection of content types defined for this site.
  var contentTypes: js.UndefOr[js.Array[ContentType]] = js.undefined
  // The full title for the site. Read-only.
  var displayName: js.UndefOr[String] = js.undefined
  // The default drive (document library) for this site.
  var drive: js.UndefOr[Drive] = js.undefined
  // The collection of drives (document libraries) under this site.
  var drives: js.UndefOr[js.Array[Drive]] = js.undefined
  // Used to address any item contained in this site. This collection cannot be enumerated.
  var items: js.UndefOr[js.Array[BaseItem]] = js.undefined
  // The collection of lists under this site.
  var lists: js.UndefOr[js.Array[List]] = js.undefined
  // Calls the OneNote service for notebook related operations.
  var onenote: js.UndefOr[Onenote] = js.undefined
  // If present, indicates that this is the root site in the site collection. Read-only.
  var root: js.UndefOr[Root] = js.undefined
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[SharepointIds] = js.undefined
  // Provides details about the site's site collection. Available only on the root site. Read-only.
  var siteCollection: js.UndefOr[SiteCollection] = js.undefined
  // The collection of the sub-sites under this site.
  var sites: js.UndefOr[js.Array[Site]] = js.undefined
}

object Site {
  @scala.inline
  def apply(
    analytics: ItemAnalytics = null,
    columns: js.Array[ColumnDefinition] = null,
    contentTypes: js.Array[ContentType] = null,
    createdBy: IdentitySet = null,
    createdByUser: User = null,
    createdDateTime: String = null,
    description: String = null,
    displayName: String = null,
    drive: Drive = null,
    drives: js.Array[Drive] = null,
    eTag: String = null,
    id: String = null,
    items: js.Array[BaseItem] = null,
    lastModifiedBy: IdentitySet = null,
    lastModifiedByUser: User = null,
    lastModifiedDateTime: String = null,
    lists: js.Array[List] = null,
    name: String = null,
    onenote: Onenote = null,
    parentReference: ItemReference = null,
    root: Root = null,
    sharepointIds: SharepointIds = null,
    siteCollection: SiteCollection = null,
    sites: js.Array[Site] = null,
    webUrl: String = null
  ): Site = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (contentTypes != null) __obj.updateDynamic("contentTypes")(contentTypes.asInstanceOf[js.Any])
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy.asInstanceOf[js.Any])
    if (createdByUser != null) __obj.updateDynamic("createdByUser")(createdByUser.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (drive != null) __obj.updateDynamic("drive")(drive.asInstanceOf[js.Any])
    if (drives != null) __obj.updateDynamic("drives")(drives.asInstanceOf[js.Any])
    if (eTag != null) __obj.updateDynamic("eTag")(eTag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy.asInstanceOf[js.Any])
    if (lastModifiedByUser != null) __obj.updateDynamic("lastModifiedByUser")(lastModifiedByUser.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (lists != null) __obj.updateDynamic("lists")(lists.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onenote != null) __obj.updateDynamic("onenote")(onenote.asInstanceOf[js.Any])
    if (parentReference != null) __obj.updateDynamic("parentReference")(parentReference.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (sharepointIds != null) __obj.updateDynamic("sharepointIds")(sharepointIds.asInstanceOf[js.Any])
    if (siteCollection != null) __obj.updateDynamic("siteCollection")(siteCollection.asInstanceOf[js.Any])
    if (sites != null) __obj.updateDynamic("sites")(sites.asInstanceOf[js.Any])
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Site]
  }
}

