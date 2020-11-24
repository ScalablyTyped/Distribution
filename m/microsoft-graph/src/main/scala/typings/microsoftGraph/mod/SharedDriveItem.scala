package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedDriveItem extends BaseItem {
  
  // Used to access the underlying driveItem
  var driveItem: js.UndefOr[NullableOption[DriveItem]] = js.native
  
  // All driveItems contained in the sharing root. This collection cannot be enumerated.
  var items: js.UndefOr[NullableOption[js.Array[DriveItem]]] = js.native
  
  // Used to access the underlying list
  var list: js.UndefOr[NullableOption[List]] = js.native
  
  // Used to access the underlying listItem
  var listItem: js.UndefOr[NullableOption[ListItem]] = js.native
  
  // Information about the owner of the shared item being referenced.
  var owner: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  // Used to access the permission representing the underlying sharing link
  var permission: js.UndefOr[NullableOption[Permission]] = js.native
  
  // Used to access the underlying driveItem. Deprecated -- use driveItem instead.
  var root: js.UndefOr[NullableOption[DriveItem]] = js.native
  
  // Used to access the underlying site
  var site: js.UndefOr[NullableOption[Site]] = js.native
}
object SharedDriveItem {
  
  @scala.inline
  def apply(): SharedDriveItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedDriveItem]
  }
  
  @scala.inline
  implicit class SharedDriveItemOps[Self <: SharedDriveItem] (val x: Self) extends AnyVal {
    
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
    def setDriveItem(value: NullableOption[DriveItem]): Self = this.set("driveItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveItem: Self = this.set("driveItem", js.undefined)
    
    @scala.inline
    def setDriveItemNull: Self = this.set("driveItem", null)
    
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
    def setListItem(value: NullableOption[ListItem]): Self = this.set("listItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItem: Self = this.set("listItem", js.undefined)
    
    @scala.inline
    def setListItemNull: Self = this.set("listItem", null)
    
    @scala.inline
    def setOwner(value: NullableOption[IdentitySet]): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setOwnerNull: Self = this.set("owner", null)
    
    @scala.inline
    def setPermission(value: NullableOption[Permission]): Self = this.set("permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermission: Self = this.set("permission", js.undefined)
    
    @scala.inline
    def setPermissionNull: Self = this.set("permission", null)
    
    @scala.inline
    def setRoot(value: NullableOption[DriveItem]): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setSite(value: NullableOption[Site]): Self = this.set("site", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSite: Self = this.set("site", js.undefined)
    
    @scala.inline
    def setSiteNull: Self = this.set("site", null)
  }
}
