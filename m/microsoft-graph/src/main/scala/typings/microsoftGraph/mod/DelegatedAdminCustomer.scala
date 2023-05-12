package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelegatedAdminCustomer
  extends StObject
     with Entity {
  
  // The Azure AD display name of the customer tenant. Read-only. Supports $orderBy.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Contains the management details of a service in the customer tenant that's managed by delegated administration.
  var serviceManagementDetails: js.UndefOr[NullableOption[js.Array[DelegatedAdminServiceManagementDetail]]] = js.undefined
  
  // The Azure AD-assigned tenant ID of the customer. Read-only.
  var tenantId: js.UndefOr[String] = js.undefined
}
object DelegatedAdminCustomer {
  
  inline def apply(): DelegatedAdminCustomer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegatedAdminCustomer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DelegatedAdminCustomer] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setServiceManagementDetails(value: NullableOption[js.Array[DelegatedAdminServiceManagementDetail]]): Self = StObject.set(x, "serviceManagementDetails", value.asInstanceOf[js.Any])
    
    inline def setServiceManagementDetailsNull: Self = StObject.set(x, "serviceManagementDetails", null)
    
    inline def setServiceManagementDetailsUndefined: Self = StObject.set(x, "serviceManagementDetails", js.undefined)
    
    inline def setServiceManagementDetailsVarargs(value: DelegatedAdminServiceManagementDetail*): Self = StObject.set(x, "serviceManagementDetails", js.Array(value*))
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
