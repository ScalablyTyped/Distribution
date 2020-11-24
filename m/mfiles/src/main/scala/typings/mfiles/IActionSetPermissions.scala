package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IActionSetPermissions extends js.Object {
  
  def Clone(): IActionSetPermissions = js.native
  
  var DiscardsAutomaticPermissions: Boolean = js.native
  
  var Permissions: IAccessControlList = js.native
}
object IActionSetPermissions {
  
  @scala.inline
  def apply(
    Clone: () => IActionSetPermissions,
    DiscardsAutomaticPermissions: Boolean,
    Permissions: IAccessControlList
  ): IActionSetPermissions = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), DiscardsAutomaticPermissions = DiscardsAutomaticPermissions.asInstanceOf[js.Any], Permissions = Permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionSetPermissions]
  }
  
  @scala.inline
  implicit class IActionSetPermissionsOps[Self <: IActionSetPermissions] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => IActionSetPermissions): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDiscardsAutomaticPermissions(value: Boolean): Self = this.set("DiscardsAutomaticPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: IAccessControlList): Self = this.set("Permissions", value.asInstanceOf[js.Any])
  }
}
