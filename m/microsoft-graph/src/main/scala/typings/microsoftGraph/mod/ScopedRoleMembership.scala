package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScopedRoleMembership extends Entity {
  
  // Unique identifier for the administrative unit that the directory role is scoped to
  var administrativeUnitId: js.UndefOr[String] = js.native
  
  // Unique identifier for the directory role that the member is in.
  var roleId: js.UndefOr[String] = js.native
  
  // Role member identity information. Represents the user that is a member of this scoped-role.
  var roleMemberInfo: js.UndefOr[Identity] = js.native
}
object ScopedRoleMembership {
  
  @scala.inline
  def apply(): ScopedRoleMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScopedRoleMembership]
  }
  
  @scala.inline
  implicit class ScopedRoleMembershipOps[Self <: ScopedRoleMembership] (val x: Self) extends AnyVal {
    
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
    def setAdministrativeUnitId(value: String): Self = this.set("administrativeUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdministrativeUnitId: Self = this.set("administrativeUnitId", js.undefined)
    
    @scala.inline
    def setRoleId(value: String): Self = this.set("roleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleId: Self = this.set("roleId", js.undefined)
    
    @scala.inline
    def setRoleMemberInfo(value: Identity): Self = this.set("roleMemberInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleMemberInfo: Self = this.set("roleMemberInfo", js.undefined)
  }
}
