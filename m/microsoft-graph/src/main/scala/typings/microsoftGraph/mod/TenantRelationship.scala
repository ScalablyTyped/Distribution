package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TenantRelationship extends StObject {
  
  // The customer who has a delegated admin relationship with a Microsoft partner.
  var delegatedAdminCustomers: js.UndefOr[NullableOption[js.Array[DelegatedAdminCustomer]]] = js.undefined
  
  // The details of the delegated administrative privileges that a Microsoft partner has in a customer tenant.
  var delegatedAdminRelationships: js.UndefOr[NullableOption[js.Array[DelegatedAdminRelationship]]] = js.undefined
}
object TenantRelationship {
  
  inline def apply(): TenantRelationship = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TenantRelationship]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TenantRelationship] (val x: Self) extends AnyVal {
    
    inline def setDelegatedAdminCustomers(value: NullableOption[js.Array[DelegatedAdminCustomer]]): Self = StObject.set(x, "delegatedAdminCustomers", value.asInstanceOf[js.Any])
    
    inline def setDelegatedAdminCustomersNull: Self = StObject.set(x, "delegatedAdminCustomers", null)
    
    inline def setDelegatedAdminCustomersUndefined: Self = StObject.set(x, "delegatedAdminCustomers", js.undefined)
    
    inline def setDelegatedAdminCustomersVarargs(value: DelegatedAdminCustomer*): Self = StObject.set(x, "delegatedAdminCustomers", js.Array(value*))
    
    inline def setDelegatedAdminRelationships(value: NullableOption[js.Array[DelegatedAdminRelationship]]): Self = StObject.set(x, "delegatedAdminRelationships", value.asInstanceOf[js.Any])
    
    inline def setDelegatedAdminRelationshipsNull: Self = StObject.set(x, "delegatedAdminRelationships", null)
    
    inline def setDelegatedAdminRelationshipsUndefined: Self = StObject.set(x, "delegatedAdminRelationships", js.undefined)
    
    inline def setDelegatedAdminRelationshipsVarargs(value: DelegatedAdminRelationship*): Self = StObject.set(x, "delegatedAdminRelationships", js.Array(value*))
  }
}
