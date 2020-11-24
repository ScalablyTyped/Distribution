package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceAndAppManagementRoleAssignment extends RoleAssignment {
  
  // The list of ids of role member security groups. These are IDs from Azure Active Directory.
  var members: js.UndefOr[NullableOption[js.Array[String]]] = js.native
}
object DeviceAndAppManagementRoleAssignment {
  
  @scala.inline
  def apply(): DeviceAndAppManagementRoleAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceAndAppManagementRoleAssignment]
  }
  
  @scala.inline
  implicit class DeviceAndAppManagementRoleAssignmentOps[Self <: DeviceAndAppManagementRoleAssignment] (val x: Self) extends AnyVal {
    
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
    def setMembersVarargs(value: String*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: NullableOption[js.Array[String]]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
    
    @scala.inline
    def setMembersNull: Self = this.set("members", null)
  }
}
