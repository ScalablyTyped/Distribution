package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceAndAppManagementRoleAssignment
  extends StObject
     with RoleAssignment {
  
  // The list of ids of role member security groups. These are IDs from Azure Active Directory.
  var members: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object DeviceAndAppManagementRoleAssignment {
  
  inline def apply(): DeviceAndAppManagementRoleAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceAndAppManagementRoleAssignment]
  }
  
  extension [Self <: DeviceAndAppManagementRoleAssignment](x: Self) {
    
    inline def setMembers(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersNull: Self = StObject.set(x, "members", null)
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value :_*))
  }
}
