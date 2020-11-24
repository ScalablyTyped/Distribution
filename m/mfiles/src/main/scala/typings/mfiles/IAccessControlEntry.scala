package typings.mfiles

import typings.mfiles.MFiles.MFPermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAccessControlEntry extends js.Object {
  
  var ChangePermissionsPermission: MFPermission = js.native
  
  def Clone(): IAccessControlEntry = js.native
  
  var EditPermission: MFPermission = js.native
  
  var IsGroup: Boolean = js.native
  
  var ReadPermission: MFPermission = js.native
  
  var UserOrGroupID: Double = js.native
}
object IAccessControlEntry {
  
  @scala.inline
  def apply(
    ChangePermissionsPermission: MFPermission,
    Clone: () => IAccessControlEntry,
    EditPermission: MFPermission,
    IsGroup: Boolean,
    ReadPermission: MFPermission,
    UserOrGroupID: Double
  ): IAccessControlEntry = {
    val __obj = js.Dynamic.literal(ChangePermissionsPermission = ChangePermissionsPermission.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), EditPermission = EditPermission.asInstanceOf[js.Any], IsGroup = IsGroup.asInstanceOf[js.Any], ReadPermission = ReadPermission.asInstanceOf[js.Any], UserOrGroupID = UserOrGroupID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccessControlEntry]
  }
  
  @scala.inline
  implicit class IAccessControlEntryOps[Self <: IAccessControlEntry] (val x: Self) extends AnyVal {
    
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
    def setChangePermissionsPermission(value: MFPermission): Self = this.set("ChangePermissionsPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IAccessControlEntry): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEditPermission(value: MFPermission): Self = this.set("EditPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGroup(value: Boolean): Self = this.set("IsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPermission(value: MFPermission): Self = this.set("ReadPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserOrGroupID(value: Double): Self = this.set("UserOrGroupID", value.asInstanceOf[js.Any])
  }
}
