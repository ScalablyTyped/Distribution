package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Drive extends BaseItem {
  /**
    * Describes the type of drive represented by this resource. OneDrive personal drives will return personal.
    * OneDrive for Business will return business. SharePoint document libraries will return documentLibrary. Read-only.
    */
  var driveType: js.UndefOr[java.lang.String] = js.undefined
  /** All items contained in the drive. Read-only. Nullable. */
  var items: js.UndefOr[js.Array[DriveItem]] = js.undefined
  /** For drives in SharePoint, the underlying document library list. Read-only. Nullable. */
  var list: js.UndefOr[List] = js.undefined
  /** Optional. The user account that owns the drive. Read-only. */
  var owner: js.UndefOr[IdentitySet] = js.undefined
  /** Optional. Information about the drive's storage space quota. Read-only. */
  var quota: js.UndefOr[Quota] = js.undefined
  /** The root folder of the drive. Read-only. */
  var root: js.UndefOr[DriveItem] = js.undefined
  var sharePointIds: js.UndefOr[SharepointIds] = js.undefined
  /** Collection of common folders available in OneDrive. Read-only. Nullable. */
  var special: js.UndefOr[js.Array[DriveItem]] = js.undefined
  /** If present, indicates that this is a system-managed drive. Read-only. */
  var system: js.UndefOr[SystemFacet] = js.undefined
}

object Drive {
  @scala.inline
  def apply(
    createdBy: IdentitySet = null,
    createdByUser: User = null,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    driveType: java.lang.String = null,
    eTag: java.lang.String = null,
    id: java.lang.String = null,
    items: js.Array[DriveItem] = null,
    lastModifiedBy: IdentitySet = null,
    lastModifiedByUser: User = null,
    lastModifiedDateTime: java.lang.String = null,
    list: List = null,
    name: java.lang.String = null,
    owner: IdentitySet = null,
    parentReference: ItemReference = null,
    quota: Quota = null,
    root: DriveItem = null,
    sharePointIds: SharepointIds = null,
    special: js.Array[DriveItem] = null,
    system: SystemFacet = null,
    webUrl: java.lang.String = null
  ): Drive = {
    val __obj = js.Dynamic.literal()
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy)
    if (createdByUser != null) __obj.updateDynamic("createdByUser")(createdByUser)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (driveType != null) __obj.updateDynamic("driveType")(driveType)
    if (eTag != null) __obj.updateDynamic("eTag")(eTag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (items != null) __obj.updateDynamic("items")(items)
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy)
    if (lastModifiedByUser != null) __obj.updateDynamic("lastModifiedByUser")(lastModifiedByUser)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (list != null) __obj.updateDynamic("list")(list)
    if (name != null) __obj.updateDynamic("name")(name)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (parentReference != null) __obj.updateDynamic("parentReference")(parentReference)
    if (quota != null) __obj.updateDynamic("quota")(quota)
    if (root != null) __obj.updateDynamic("root")(root)
    if (sharePointIds != null) __obj.updateDynamic("sharePointIds")(sharePointIds)
    if (special != null) __obj.updateDynamic("special")(special)
    if (system != null) __obj.updateDynamic("system")(system)
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[Drive]
  }
}

