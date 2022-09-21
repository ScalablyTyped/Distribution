package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossTenantAccessPolicyB2BSetting extends StObject {
  
  // The list of applications targeted with your cross-tenant access policy.
  var applications: js.UndefOr[NullableOption[CrossTenantAccessPolicyTargetConfiguration]] = js.undefined
  
  // The list of users and groups targeted with your cross-tenant access policy.
  var usersAndGroups: js.UndefOr[NullableOption[CrossTenantAccessPolicyTargetConfiguration]] = js.undefined
}
object CrossTenantAccessPolicyB2BSetting {
  
  inline def apply(): CrossTenantAccessPolicyB2BSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossTenantAccessPolicyB2BSetting]
  }
  
  extension [Self <: CrossTenantAccessPolicyB2BSetting](x: Self) {
    
    inline def setApplications(value: NullableOption[CrossTenantAccessPolicyTargetConfiguration]): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsNull: Self = StObject.set(x, "applications", null)
    
    inline def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    inline def setUsersAndGroups(value: NullableOption[CrossTenantAccessPolicyTargetConfiguration]): Self = StObject.set(x, "usersAndGroups", value.asInstanceOf[js.Any])
    
    inline def setUsersAndGroupsNull: Self = StObject.set(x, "usersAndGroups", null)
    
    inline def setUsersAndGroupsUndefined: Self = StObject.set(x, "usersAndGroups", js.undefined)
  }
}
