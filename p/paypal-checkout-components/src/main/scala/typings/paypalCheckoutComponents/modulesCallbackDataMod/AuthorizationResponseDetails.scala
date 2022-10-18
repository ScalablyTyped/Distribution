package typings.paypalCheckoutComponents.modulesCallbackDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationResponseDetails extends StObject {
  
  /**
    * User's billing address details.
    */
  var billingAddress: js.UndefOr[Address] = js.undefined
  
  var countryCode: js.UndefOr[String] = js.undefined
  
  /**
    * This property will only be present when the customer pays with PayPal Credit.
    */
  var creditFinancingOffered: js.UndefOr[CreditFinancingOptions] = js.undefined
  
  var email: String
  
  var firstName: String
  
  var lastName: String
  
  var payerId: String
  
  var phone: js.UndefOr[String] = js.undefined
  
  /**
    * User's shipping address details, only available if shipping address is enabled.
    */
  var shippingAddress: js.UndefOr[Address] = js.undefined
}
object AuthorizationResponseDetails {
  
  inline def apply(email: String, firstName: String, lastName: String, payerId: String): AuthorizationResponseDetails = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], payerId = payerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationResponseDetails]
  }
  
  extension [Self <: AuthorizationResponseDetails](x: Self) {
    
    inline def setBillingAddress(value: Address): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setCreditFinancingOffered(value: CreditFinancingOptions): Self = StObject.set(x, "creditFinancingOffered", value.asInstanceOf[js.Any])
    
    inline def setCreditFinancingOfferedUndefined: Self = StObject.set(x, "creditFinancingOffered", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setPayerId(value: String): Self = StObject.set(x, "payerId", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setShippingAddress(value: Address): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressUndefined: Self = StObject.set(x, "shippingAddress", js.undefined)
  }
}
