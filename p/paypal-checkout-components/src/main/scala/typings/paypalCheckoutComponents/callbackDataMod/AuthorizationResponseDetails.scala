package typings.paypalCheckoutComponents.callbackDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationResponseDetails extends StObject {
  
  /**
    * User's billing address details.
    */
  var billingAddress: js.UndefOr[Address] = js.native
  
  var countryCode: js.UndefOr[String] = js.native
  
  /**
    * This property will only be present when the customer pays with PayPal Credit.
    */
  var creditFinancingOffered: js.UndefOr[CreditFinancingOptions] = js.native
  
  var email: String = js.native
  
  var firstName: String = js.native
  
  var lastName: String = js.native
  
  var payerId: String = js.native
  
  var phone: js.UndefOr[String] = js.native
  
  /**
    * User's shipping address details, only available if shipping address is enabled.
    */
  var shippingAddress: js.UndefOr[Address] = js.native
}
object AuthorizationResponseDetails {
  
  @scala.inline
  def apply(email: String, firstName: String, lastName: String, payerId: String): AuthorizationResponseDetails = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], payerId = payerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationResponseDetails]
  }
  
  @scala.inline
  implicit class AuthorizationResponseDetailsMutableBuilder[Self <: AuthorizationResponseDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingAddress(value: Address): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    @scala.inline
    def setCreditFinancingOffered(value: CreditFinancingOptions): Self = StObject.set(x, "creditFinancingOffered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditFinancingOfferedUndefined: Self = StObject.set(x, "creditFinancingOffered", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayerId(value: String): Self = StObject.set(x, "payerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    @scala.inline
    def setShippingAddress(value: Address): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingAddressUndefined: Self = StObject.set(x, "shippingAddress", js.undefined)
  }
}
