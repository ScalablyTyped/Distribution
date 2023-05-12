package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TenantAppManagementPolicy
  extends StObject
     with PolicyBase {
  
  // Restrictions that apply as default to all application objects in the tenant.
  var applicationRestrictions: js.UndefOr[NullableOption[AppManagementConfiguration]] = js.undefined
  
  // Denotes whether the policy is enabled. Default value is false.
  var isEnabled: js.UndefOr[Boolean] = js.undefined
  
  // Restrictions that apply as default to all service principal objects in the tenant.
  var servicePrincipalRestrictions: js.UndefOr[NullableOption[AppManagementConfiguration]] = js.undefined
}
object TenantAppManagementPolicy {
  
  inline def apply(): TenantAppManagementPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TenantAppManagementPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TenantAppManagementPolicy] (val x: Self) extends AnyVal {
    
    inline def setApplicationRestrictions(value: NullableOption[AppManagementConfiguration]): Self = StObject.set(x, "applicationRestrictions", value.asInstanceOf[js.Any])
    
    inline def setApplicationRestrictionsNull: Self = StObject.set(x, "applicationRestrictions", null)
    
    inline def setApplicationRestrictionsUndefined: Self = StObject.set(x, "applicationRestrictions", js.undefined)
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    inline def setServicePrincipalRestrictions(value: NullableOption[AppManagementConfiguration]): Self = StObject.set(x, "servicePrincipalRestrictions", value.asInstanceOf[js.Any])
    
    inline def setServicePrincipalRestrictionsNull: Self = StObject.set(x, "servicePrincipalRestrictions", null)
    
    inline def setServicePrincipalRestrictionsUndefined: Self = StObject.set(x, "servicePrincipalRestrictions", js.undefined)
  }
}
