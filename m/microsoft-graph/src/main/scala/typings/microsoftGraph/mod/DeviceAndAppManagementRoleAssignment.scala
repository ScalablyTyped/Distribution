package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class DeviceAndAppManagementRoleAssignmentMutableBuilder[Self <: DeviceAndAppManagementRoleAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersNull: Self = StObject.set(x, "members", null)
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value :_*))
  }
}
