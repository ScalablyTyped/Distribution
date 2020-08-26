package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Drive extends BaseItem {
  /**
    * Describes the type of drive represented by this resource. OneDrive personal drives will return personal. OneDrive for
    * Business will return business. SharePoint document libraries will return documentLibrary. Read-only.
    */
  var driveType: js.UndefOr[String] = js.native
  // The list of items the user is following. Only in OneDrive for Business.
  var following: js.UndefOr[js.Array[DriveItem]] = js.native
  // All items contained in the drive. Read-only. Nullable.
  var items: js.UndefOr[js.Array[DriveItem]] = js.native
  // For drives in SharePoint, the underlying document library list. Read-only. Nullable.
  var list: js.UndefOr[List] = js.native
  // Optional. The user account that owns the drive. Read-only.
  var owner: js.UndefOr[IdentitySet] = js.native
  // Optional. Information about the drive's storage space quota. Read-only.
  var quota: js.UndefOr[Quota] = js.native
  // The root folder of the drive. Read-only.
  var root: js.UndefOr[DriveItem] = js.native
  var sharePointIds: js.UndefOr[SharepointIds] = js.native
  // Collection of common folders available in OneDrive. Read-only. Nullable.
  var special: js.UndefOr[js.Array[DriveItem]] = js.native
  // If present, indicates that this is a system-managed drive. Read-only.
  var system: js.UndefOr[SystemFacet] = js.native
}

object Drive {
  @scala.inline
  def apply(): Drive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Drive]
  }
  @scala.inline
  implicit class DriveOps[Self <: Drive] (val x: Self) extends AnyVal {
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
    def setDriveType(value: String): Self = this.set("driveType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriveType: Self = this.set("driveType", js.undefined)
    @scala.inline
    def setFollowingVarargs(value: DriveItem*): Self = this.set("following", js.Array(value :_*))
    @scala.inline
    def setFollowing(value: js.Array[DriveItem]): Self = this.set("following", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowing: Self = this.set("following", js.undefined)
    @scala.inline
    def setItemsVarargs(value: DriveItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[DriveItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setList(value: List): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setOwner(value: IdentitySet): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setQuota(value: Quota): Self = this.set("quota", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuota: Self = this.set("quota", js.undefined)
    @scala.inline
    def setRoot(value: DriveItem): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setSharePointIds(value: SharepointIds): Self = this.set("sharePointIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharePointIds: Self = this.set("sharePointIds", js.undefined)
    @scala.inline
    def setSpecialVarargs(value: DriveItem*): Self = this.set("special", js.Array(value :_*))
    @scala.inline
    def setSpecial(value: js.Array[DriveItem]): Self = this.set("special", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecial: Self = this.set("special", js.undefined)
    @scala.inline
    def setSystem(value: SystemFacet): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
  }
  
}

