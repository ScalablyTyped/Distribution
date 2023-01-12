package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzureActiveDirectoryTenant
  extends StObject
     with IdentitySource {
  
  // The name of the Azure Active Directory tenant. Read only.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The ID of the Azure Active Directory tenant. Read only.
  var tenantId: js.UndefOr[NullableOption[String]] = js.undefined
}
object AzureActiveDirectoryTenant {
  
  inline def apply(): AzureActiveDirectoryTenant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureActiveDirectoryTenant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AzureActiveDirectoryTenant] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setTenantId(value: NullableOption[String]): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
