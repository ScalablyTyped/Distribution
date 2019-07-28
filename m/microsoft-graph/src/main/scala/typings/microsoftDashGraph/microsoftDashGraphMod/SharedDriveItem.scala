package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedDriveItem extends BaseItem {
  // Used to access the underlying driveItem
  var driveItem: js.UndefOr[DriveItem] = js.undefined
  // All driveItems contained in the sharing root. This collection cannot be enumerated.
  var items: js.UndefOr[js.Array[DriveItem]] = js.undefined
  // Used to access the underlying list
  var list: js.UndefOr[List] = js.undefined
  // Used to access the underlying listItem
  var listItem: js.UndefOr[ListItem] = js.undefined
  // Information about the owner of the shared item being referenced.
  var owner: js.UndefOr[IdentitySet] = js.undefined
  // Used to access the underlying driveItem. Deprecated -- use driveItem instead.
  var root: js.UndefOr[DriveItem] = js.undefined
  // Used to access the underlying site
  var site: js.UndefOr[Site] = js.undefined
}

object SharedDriveItem {
  @scala.inline
  def apply(
    createdBy: IdentitySet = null,
    createdByUser: User = null,
    createdDateTime: String = null,
    description: String = null,
    driveItem: DriveItem = null,
    eTag: String = null,
    id: String = null,
    items: js.Array[DriveItem] = null,
    lastModifiedBy: IdentitySet = null,
    lastModifiedByUser: User = null,
    lastModifiedDateTime: String = null,
    list: List = null,
    listItem: ListItem = null,
    name: String = null,
    owner: IdentitySet = null,
    parentReference: ItemReference = null,
    root: DriveItem = null,
    site: Site = null,
    webUrl: String = null
  ): SharedDriveItem = {
    val __obj = js.Dynamic.literal()
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy)
    if (createdByUser != null) __obj.updateDynamic("createdByUser")(createdByUser)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (driveItem != null) __obj.updateDynamic("driveItem")(driveItem)
    if (eTag != null) __obj.updateDynamic("eTag")(eTag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (items != null) __obj.updateDynamic("items")(items)
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy)
    if (lastModifiedByUser != null) __obj.updateDynamic("lastModifiedByUser")(lastModifiedByUser)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (list != null) __obj.updateDynamic("list")(list)
    if (listItem != null) __obj.updateDynamic("listItem")(listItem)
    if (name != null) __obj.updateDynamic("name")(name)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (parentReference != null) __obj.updateDynamic("parentReference")(parentReference)
    if (root != null) __obj.updateDynamic("root")(root)
    if (site != null) __obj.updateDynamic("site")(site)
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[SharedDriveItem]
  }
}

