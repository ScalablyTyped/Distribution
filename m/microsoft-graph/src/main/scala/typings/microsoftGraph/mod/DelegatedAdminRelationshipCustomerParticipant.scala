package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelegatedAdminRelationshipCustomerParticipant extends StObject {
  
  // The display name of the customer tenant as set by Azure AD. Read-only
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The Azure AD-assigned tenant ID of the customer tenant.
  var tenantId: js.UndefOr[String] = js.undefined
}
object DelegatedAdminRelationshipCustomerParticipant {
  
  inline def apply(): DelegatedAdminRelationshipCustomerParticipant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegatedAdminRelationshipCustomerParticipant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DelegatedAdminRelationshipCustomerParticipant] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
