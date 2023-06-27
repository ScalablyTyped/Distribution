package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultUserRolePermissions extends StObject {
  
  /**
    * Indicates whether the default user role can create applications. This setting corresponds to the Users can register
    * applications setting in the User settings menu in the Azure portal.
    */
  var allowedToCreateApps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the default user role can create security groups. This setting corresponds to the following menus in
    * the Azure portal: The Users can create security groups in Azure portals, API or PowerShell setting in the Group
    * settings menu. Users can create security groups setting in the User settings menu.
    */
  var allowedToCreateSecurityGroups: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the default user role can create tenants. This setting corresponds to the Restrict non-admin users
    * from creating tenants setting in the User settings menu in the Azure portal. When this setting is false, users assigned
    * the Tenant Creator role can still create tenants.
    */
  var allowedToCreateTenants: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether the registered owners of a device can read their own BitLocker recovery keys with default user role.
  var allowedToReadBitlockerKeysForOwnedDevice: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
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
    
    inline def setAllowedToCreateTenants(value: NullableOption[Boolean]): Self = StObject.set(x, "allowedToCreateTenants", value.asInstanceOf[js.Any])
    
    inline def setAllowedToCreateTenantsNull: Self = StObject.set(x, "allowedToCreateTenants", null)
    
    inline def setAllowedToCreateTenantsUndefined: Self = StObject.set(x, "allowedToCreateTenants", js.undefined)
    
    inline def setAllowedToReadBitlockerKeysForOwnedDevice(value: NullableOption[Boolean]): Self = StObject.set(x, "allowedToReadBitlockerKeysForOwnedDevice", value.asInstanceOf[js.Any])
    
    inline def setAllowedToReadBitlockerKeysForOwnedDeviceNull: Self = StObject.set(x, "allowedToReadBitlockerKeysForOwnedDevice", null)
    
    inline def setAllowedToReadBitlockerKeysForOwnedDeviceUndefined: Self = StObject.set(x, "allowedToReadBitlockerKeysForOwnedDevice", js.undefined)
    
    inline def setAllowedToReadOtherUsers(value: Boolean): Self = StObject.set(x, "allowedToReadOtherUsers", value.asInstanceOf[js.Any])
    
    inline def setAllowedToReadOtherUsersUndefined: Self = StObject.set(x, "allowedToReadOtherUsers", js.undefined)
    
    inline def setPermissionGrantPoliciesAssigned(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "permissionGrantPoliciesAssigned", value.asInstanceOf[js.Any])
    
    inline def setPermissionGrantPoliciesAssignedNull: Self = StObject.set(x, "permissionGrantPoliciesAssigned", null)
    
    inline def setPermissionGrantPoliciesAssignedUndefined: Self = StObject.set(x, "permissionGrantPoliciesAssigned", js.undefined)
    
    inline def setPermissionGrantPoliciesAssignedVarargs(value: String*): Self = StObject.set(x, "permissionGrantPoliciesAssigned", js.Array(value*))
  }
}
