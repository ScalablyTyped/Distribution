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
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy.asInstanceOf[js.Any])
    if (createdByUser != null) __obj.updateDynamic("createdByUser")(createdByUser.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (driveItem != null) __obj.updateDynamic("driveItem")(driveItem.asInstanceOf[js.Any])
    if (eTag != null) __obj.updateDynamic("eTag")(eTag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy.asInstanceOf[js.Any])
    if (lastModifiedByUser != null) __obj.updateDynamic("lastModifiedByUser")(lastModifiedByUser.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (listItem != null) __obj.updateDynamic("listItem")(listItem.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (parentReference != null) __obj.updateDynamic("parentReference")(parentReference.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (site != null) __obj.updateDynamic("site")(site.asInstanceOf[js.Any])
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedDriveItem]
  }
}

