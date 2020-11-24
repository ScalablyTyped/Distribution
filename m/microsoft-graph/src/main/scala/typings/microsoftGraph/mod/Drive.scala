package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Drive extends BaseItem {
  
  /**
    * Describes the type of drive represented by this resource. OneDrive personal drives will return personal. OneDrive for
    * Business will return business. SharePoint document libraries will return documentLibrary. Read-only.
    */
  var driveType: js.UndefOr[NullableOption[String]] = js.native
  
  // The list of items the user is following. Only in OneDrive for Business.
  var following: js.UndefOr[NullableOption[js.Array[DriveItem]]] = js.native
  
  // All items contained in the drive. Read-only. Nullable.
  var items: js.UndefOr[NullableOption[js.Array[DriveItem]]] = js.native
  
  // For drives in SharePoint, the underlying document library list. Read-only. Nullable.
  var list: js.UndefOr[NullableOption[List]] = js.native
  
  // Optional. The user account that owns the drive. Read-only.
  var owner: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  // Optional. Information about the drive's storage space quota. Read-only.
  var quota: js.UndefOr[NullableOption[Quota]] = js.native
  
  // The root folder of the drive. Read-only.
  var root: js.UndefOr[NullableOption[DriveItem]] = js.native
  
  var sharePointIds: js.UndefOr[NullableOption[SharepointIds]] = js.native
  
  // Collection of common folders available in OneDrive. Read-only. Nullable.
  var special: js.UndefOr[NullableOption[js.Array[DriveItem]]] = js.native
  
  // If present, indicates that this is a system-managed drive. Read-only.
  var system: js.UndefOr[NullableOption[SystemFacet]] = js.native
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
    def setDriveType(value: NullableOption[String]): Self = this.set("driveType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveType: Self = this.set("driveType", js.undefined)
    
    @scala.inline
    def setDriveTypeNull: Self = this.set("driveType", null)
    
    @scala.inline
    def setFollowingVarargs(value: DriveItem*): Self = this.set("following", js.Array(value :_*))
    
    @scala.inline
    def setFollowing(value: NullableOption[js.Array[DriveItem]]): Self = this.set("following", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowing: Self = this.set("following", js.undefined)
    
    @scala.inline
    def setFollowingNull: Self = this.set("following", null)
    
    @scala.inline
    def setItemsVarargs(value: DriveItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: NullableOption[js.Array[DriveItem]]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setItemsNull: Self = this.set("items", null)
    
    @scala.inline
    def setList(value: NullableOption[List]): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    
    @scala.inline
    def setListNull: Self = this.set("list", null)
    
    @scala.inline
    def setOwner(value: NullableOption[IdentitySet]): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setOwnerNull: Self = this.set("owner", null)
    
    @scala.inline
    def setQuota(value: NullableOption[Quota]): Self = this.set("quota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuota: Self = this.set("quota", js.undefined)
    
    @scala.inline
    def setQuotaNull: Self = this.set("quota", null)
    
    @scala.inline
    def setRoot(value: NullableOption[DriveItem]): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setSharePointIds(value: NullableOption[SharepointIds]): Self = this.set("sharePointIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharePointIds: Self = this.set("sharePointIds", js.undefined)
    
    @scala.inline
    def setSharePointIdsNull: Self = this.set("sharePointIds", null)
    
    @scala.inline
    def setSpecialVarargs(value: DriveItem*): Self = this.set("special", js.Array(value :_*))
    
    @scala.inline
    def setSpecial(value: NullableOption[js.Array[DriveItem]]): Self = this.set("special", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecial: Self = this.set("special", js.undefined)
    
    @scala.inline
    def setSpecialNull: Self = this.set("special", null)
    
    @scala.inline
    def setSystem(value: NullableOption[SystemFacet]): Self = this.set("system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
    
    @scala.inline
    def setSystemNull: Self = this.set("system", null)
  }
}
