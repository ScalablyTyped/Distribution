package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossTenantAccessPolicy
  extends StObject
     with PolicyBase {
  
  /**
    * Defines the default configuration for how your organization interacts with external Azure Active Directory
    * organizations.
    */
  var default: js.UndefOr[NullableOption[CrossTenantAccessPolicyConfigurationDefault]] = js.undefined
  
  /**
    * Used to specify which Microsoft clouds an organization would like to collaborate with. By default, this value is empty.
    * Supported values for this field are: microsoftonline.com, microsoftonline.us, and partner.microsoftonline.cn.
    */
  var allowedCloudEndpoints: js.UndefOr[js.Array[String]] = js.undefined
  
  // Defines partner-specific configurations for external Azure Active Directory organizations.
  var partners: js.UndefOr[NullableOption[js.Array[CrossTenantAccessPolicyConfigurationPartner]]] = js.undefined
}
object CrossTenantAccessPolicy {
  
  inline def apply(): CrossTenantAccessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossTenantAccessPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrossTenantAccessPolicy] (val x: Self) extends AnyVal {
    
    inline def setAllowedCloudEndpoints(value: js.Array[String]): Self = StObject.set(x, "allowedCloudEndpoints", value.asInstanceOf[js.Any])
    
    inline def setAllowedCloudEndpointsUndefined: Self = StObject.set(x, "allowedCloudEndpoints", js.undefined)
    
    inline def setAllowedCloudEndpointsVarargs(value: String*): Self = StObject.set(x, "allowedCloudEndpoints", js.Array(value*))
    
    inline def setDefault(value: NullableOption[CrossTenantAccessPolicyConfigurationDefault]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultNull: Self = StObject.set(x, "default", null)
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setPartners(value: NullableOption[js.Array[CrossTenantAccessPolicyConfigurationPartner]]): Self = StObject.set(x, "partners", value.asInstanceOf[js.Any])
    
    inline def setPartnersNull: Self = StObject.set(x, "partners", null)
    
    inline def setPartnersUndefined: Self = StObject.set(x, "partners", js.undefined)
    
    inline def setPartnersVarargs(value: CrossTenantAccessPolicyConfigurationPartner*): Self = StObject.set(x, "partners", js.Array(value*))
  }
}
