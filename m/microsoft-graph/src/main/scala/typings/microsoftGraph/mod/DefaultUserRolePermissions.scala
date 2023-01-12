package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultUserRolePermissions extends StObject {
  
  // Indicates whether the default user role can create applications.
  var allowedToCreateApps: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether the default user role can create security groups.
  var allowedToCreateSecurityGroups: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether the default user role can read other users.
  var allowedToReadOtherUsers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if user consent to apps is allowed, and if it is, which permission to grant consent and which app consent
    * policy (permissionGrantPolicy) govern the permission for users to grant consent. Value should be in the format
    * managePermissionGrantsForSelf.{id}, where {id} is the id of a built-in or custom app consent policy. An empty list
    * indicates user consent to apps is disabled.
    */
  var permissionGrantPoliciesAssigned: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object DefaultUserRolePermissions {
  
  inline def apply(): DefaultUserRolePermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultUserRolePermissions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultUserRolePermissions] (val x: Self) extends AnyVal {
    
    inline def setAllowedToCreateApps(value: Boolean): Self = StObject.set(x, "allowedToCreateApps", value.asInstanceOf[js.Any])
    
    inline def setAllowedToCreateAppsUndefined: Self = StObject.set(x, "allowedToCreateApps", js.undefined)
    
    inline def setAllowedToCreateSecurityGroups(value: Boolean): Self = StObject.set(x, "allowedToCreateSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setAllowedToCreateSecurityGroupsUndefined: Self = StObject.set(x, "allowedToCreateSecurityGroups", js.undefined)
    
    inline def setAllowedToReadOtherUsers(value: Boolean): Self = StObject.set(x, "allowedToReadOtherUsers", value.asInstanceOf[js.Any])
    
    inline def setAllowedToReadOtherUsersUndefined: Self = StObject.set(x, "allowedToReadOtherUsers", js.undefined)
    
    inline def setPermissionGrantPoliciesAssigned(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "permissionGrantPoliciesAssigned", value.asInstanceOf[js.Any])
    
    inline def setPermissionGrantPoliciesAssignedNull: Self = StObject.set(x, "permissionGrantPoliciesAssigned", null)
    
    inline def setPermissionGrantPoliciesAssignedUndefined: Self = StObject.set(x, "permissionGrantPoliciesAssigned", js.undefined)
    
    inline def setPermissionGrantPoliciesAssignedVarargs(value: String*): Self = StObject.set(x, "permissionGrantPoliciesAssigned", js.Array(value*))
  }
}
