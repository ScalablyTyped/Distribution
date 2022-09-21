package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contract
  extends StObject
     with DirectoryObject {
  
  /**
    * Type of contract. Possible values are: SyndicationPartner, BreadthPartner, ResellerPartner. See more in the table
    * below.
    */
  var contractType: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The unique identifier for the customer tenant referenced by this partnership. Corresponds to the id property of the
    * customer tenant's organization resource.
    */
  var customerId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * A copy of the customer tenant's default domain name. The copy is made when the partnership with the customer is
    * established. It is not automatically updated if the customer tenant's default domain name changes.
    */
  var defaultDomainName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * A copy of the customer tenant's display name. The copy is made when the partnership with the customer is established.
    * It is not automatically updated if the customer tenant's display name changes.
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
}
object Contract {
  
  inline def apply(): Contract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contract]
  }
  
  extension [Self <: Contract](x: Self) {
    
    inline def setContractType(value: NullableOption[String]): Self = StObject.set(x, "contractType", value.asInstanceOf[js.Any])
    
    inline def setContractTypeNull: Self = StObject.set(x, "contractType", null)
    
    inline def setContractTypeUndefined: Self = StObject.set(x, "contractType", js.undefined)
    
    inline def setCustomerId(value: NullableOption[String]): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdNull: Self = StObject.set(x, "customerId", null)
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setDefaultDomainName(value: NullableOption[String]): Self = StObject.set(x, "defaultDomainName", value.asInstanceOf[js.Any])
    
    inline def setDefaultDomainNameNull: Self = StObject.set(x, "defaultDomainName", null)
    
    inline def setDefaultDomainNameUndefined: Self = StObject.set(x, "defaultDomainName", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
