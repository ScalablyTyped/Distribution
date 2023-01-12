package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookingCustomer
  extends StObject
     with Entity {
  
  /**
    * Addresses associated with the customer. The attribute type of physicalAddress is not supported in v1.0. Internally we
    * map the addresses to the type others.
    */
  var addresses: js.UndefOr[NullableOption[js.Array[PhysicalAddress]]] = js.undefined
  
  // The display name is suitable for human-readable interfaces.
  var displayName: js.UndefOr[String] = js.undefined
  
  // The SMTP address of the customer.
  var emailAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Phone numbers associated with the customer, including home, business and mobile numbers.
  var phones: js.UndefOr[NullableOption[js.Array[Phone]]] = js.undefined
}
object BookingCustomer {
  
  inline def apply(): BookingCustomer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookingCustomer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BookingCustomer] (val x: Self) extends AnyVal {
    
    inline def setAddresses(value: NullableOption[js.Array[PhysicalAddress]]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesNull: Self = StObject.set(x, "addresses", null)
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAddressesVarargs(value: PhysicalAddress*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmailAddress(value: NullableOption[String]): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setPhones(value: NullableOption[js.Array[Phone]]): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
    
    inline def setPhonesNull: Self = StObject.set(x, "phones", null)
    
    inline def setPhonesUndefined: Self = StObject.set(x, "phones", js.undefined)
    
    inline def setPhonesVarargs(value: Phone*): Self = StObject.set(x, "phones", js.Array(value*))
  }
}
