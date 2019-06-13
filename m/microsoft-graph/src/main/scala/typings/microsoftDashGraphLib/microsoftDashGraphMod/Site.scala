package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Site extends BaseItem {
  var analytics: js.UndefOr[ItemAnalytics] = js.undefined
  /** The collection of column definitions reusable across lists under this site. */
  var columns: js.UndefOr[js.Array[ColumnDefinition]] = js.undefined
  /** The collection of content types defined for this site. */
  var contentTypes: js.UndefOr[js.Array[ContentType]] = js.undefined
  /** The full title for the site. Read-only. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The default drive (document library) for this site. */
  var drive: js.UndefOr[Drive] = js.undefined
  /** The collection of drives (document libraries) under this site. */
  var drives: js.UndefOr[js.Array[Drive]] = js.undefined
  /** Used to address any item contained in this site. This collection cannot be enumerated. */
  var items: js.UndefOr[js.Array[BaseItem]] = js.undefined
  /** The collection of lists under this site. */
  var lists: js.UndefOr[js.Array[List]] = js.undefined
  /** Calls the OneNote service for notebook related operations. */
  var onenote: js.UndefOr[Onenote] = js.undefined
  /** If present, indicates that this is the root site in the site collection. Read-only. */
  var root: js.UndefOr[Root] = js.undefined
  /** Returns identifiers useful for SharePoint REST compatibility. Read-only. */
  var sharepointIds: js.UndefOr[SharepointIds] = js.undefined
  /** Provides details about the site's site collection. Available only on the root site. Read-only. */
  var siteCollection: js.UndefOr[SiteCollection] = js.undefined
  /** The collection of the sub-sites under this site. */
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
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    drive: Drive = null,
    drives: js.Array[Drive] = null,
    eTag: java.lang.String = null,
    id: java.lang.String = null,
    items: js.Array[BaseItem] = null,
    lastModifiedBy: IdentitySet = null,
    lastModifiedByUser: User = null,
    lastModifiedDateTime: java.lang.String = null,
    lists: js.Array[List] = null,
    name: java.lang.String = null,
    onenote: Onenote = null,
    parentReference: ItemReference = null,
    root: Root = null,
    sharepointIds: SharepointIds = null,
    siteCollection: SiteCollection = null,
    sites: js.Array[Site] = null,
    webUrl: java.lang.String = null
  ): Site = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (contentTypes != null) __obj.updateDynamic("contentTypes")(contentTypes)
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy)
    if (createdByUser != null) __obj.updateDynamic("createdByUser")(createdByUser)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (drive != null) __obj.updateDynamic("drive")(drive)
    if (drives != null) __obj.updateDynamic("drives")(drives)
    if (eTag != null) __obj.updateDynamic("eTag")(eTag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (items != null) __obj.updateDynamic("items")(items)
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy)
    if (lastModifiedByUser != null) __obj.updateDynamic("lastModifiedByUser")(lastModifiedByUser)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (lists != null) __obj.updateDynamic("lists")(lists)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onenote != null) __obj.updateDynamic("onenote")(onenote)
    if (parentReference != null) __obj.updateDynamic("parentReference")(parentReference)
    if (root != null) __obj.updateDynamic("root")(root)
    if (sharepointIds != null) __obj.updateDynamic("sharepointIds")(sharepointIds)
    if (siteCollection != null) __obj.updateDynamic("siteCollection")(siteCollection)
    if (sites != null) __obj.updateDynamic("sites")(sites)
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[Site]
  }
}

