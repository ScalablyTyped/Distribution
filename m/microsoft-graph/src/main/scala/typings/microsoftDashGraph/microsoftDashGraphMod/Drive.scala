package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Drive extends BaseItem {
  /**
    * Describes the type of drive represented by this resource. OneDrive personal drives will return personal. OneDrive for
    * Business will return business. SharePoint document libraries will return documentLibrary. Read-only.
    */
  var driveType: js.UndefOr[String] = js.undefined
  // All items contained in the drive. Read-only. Nullable.
  var items: js.UndefOr[js.Array[DriveItem]] = js.undefined
  // For drives in SharePoint, the underlying document library list. Read-only. Nullable.
  var list: js.UndefOr[List] = js.undefined
  // Optional. The user account that owns the drive. Read-only.
  var owner: js.UndefOr[IdentitySet] = js.undefined
  // Optional. Information about the drive's storage space quota. Read-only.
  var quota: js.UndefOr[Quota] = js.undefined
  // The root folder of the drive. Read-only.
  var root: js.UndefOr[DriveItem] = js.undefined
  var sharePointIds: js.UndefOr[SharepointIds] = js.undefined
  // Collection of common folders available in OneDrive. Read-only. Nullable.
  var special: js.UndefOr[js.Array[DriveItem]] = js.undefined
  // If present, indicates that this is a system-managed drive. Read-only.
  var system: js.UndefOr[SystemFacet] = js.undefined
}

object Drive {
  @scala.inline
  def apply(
    createdBy: IdentitySet = null,
    createdByUser: User = null,
    createdDateTime: String = null,
    description: String = null,
    driveType: String = null,
    eTag: String = null,
    id: String = null,
    items: js.Array[DriveItem] = null,
    lastModifiedBy: IdentitySet = null,
    lastModifiedByUser: User = null,
    lastModifiedDateTime: String = null,
    list: List = null,
    name: String = null,
    owner: IdentitySet = null,
    parentReference: ItemReference = null,
    quota: Quota = null,
    root: DriveItem = null,
    sharePointIds: SharepointIds = null,
    special: js.Array[DriveItem] = null,
    system: SystemFacet = null,
    webUrl: String = null
  ): Drive = {
    val __obj = js.Dynamic.literal()
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy.asInstanceOf[js.Any])
    if (createdByUser != null) __obj.updateDynamic("createdByUser")(createdByUser.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (driveType != null) __obj.updateDynamic("driveType")(driveType.asInstanceOf[js.Any])
    if (eTag != null) __obj.updateDynamic("eTag")(eTag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy.asInstanceOf[js.Any])
    if (lastModifiedByUser != null) __obj.updateDynamic("lastModifiedByUser")(lastModifiedByUser.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (parentReference != null) __obj.updateDynamic("parentReference")(parentReference.asInstanceOf[js.Any])
    if (quota != null) __obj.updateDynamic("quota")(quota.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (sharePointIds != null) __obj.updateDynamic("sharePointIds")(sharePointIds.asInstanceOf[js.Any])
    if (special != null) __obj.updateDynamic("special")(special.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Drive]
  }
}

