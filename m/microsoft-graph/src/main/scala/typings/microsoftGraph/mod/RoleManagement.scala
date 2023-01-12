package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoleManagement extends StObject {
  
  var directory: js.UndefOr[NullableOption[RbacApplication]] = js.undefined
  
  // Container for roles and assignments for entitlement management resources.
  var entitlementManagement: js.UndefOr[NullableOption[RbacApplication]] = js.undefined
}
object RoleManagement {
  
  inline def apply(): RoleManagement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleManagement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoleManagement] (val x: Self) extends AnyVal {
    
    inline def setDirectory(value: NullableOption[RbacApplication]): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setDirectoryNull: Self = StObject.set(x, "directory", null)
    
    inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
    
    inline def setEntitlementManagement(value: NullableOption[RbacApplication]): Self = StObject.set(x, "entitlementManagement", value.asInstanceOf[js.Any])
    
    inline def setEntitlementManagementNull: Self = StObject.set(x, "entitlementManagement", null)
    
    inline def setEntitlementManagementUndefined: Self = StObject.set(x, "entitlementManagement", js.undefined)
  }
}
