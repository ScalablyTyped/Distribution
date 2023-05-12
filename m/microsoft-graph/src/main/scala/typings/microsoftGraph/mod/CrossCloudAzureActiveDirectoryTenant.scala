package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossCloudAzureActiveDirectoryTenant
  extends StObject
     with IdentitySource {
  
  /**
    * The ID of the cloud where the tenant is located, one of microsoftonline.com, microsoftonline.us or
    * partner.microsoftonline.cn. Read only.
    */
  var cloudInstance: js.UndefOr[String] = js.undefined
  
  // The name of the Azure Active Directory tenant. Read only.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The ID of the Azure Active Directory tenant. Read only.
  var tenantId: js.UndefOr[NullableOption[String]] = js.undefined
}
object CrossCloudAzureActiveDirectoryTenant {
  
  inline def apply(): CrossCloudAzureActiveDirectoryTenant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossCloudAzureActiveDirectoryTenant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrossCloudAzureActiveDirectoryTenant] (val x: Self) extends AnyVal {
    
    inline def setCloudInstance(value: String): Self = StObject.set(x, "cloudInstance", value.asInstanceOf[js.Any])
    
    inline def setCloudInstanceUndefined: Self = StObject.set(x, "cloudInstance", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setTenantId(value: NullableOption[String]): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
