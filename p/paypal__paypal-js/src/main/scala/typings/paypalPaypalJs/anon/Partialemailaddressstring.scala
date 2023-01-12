package typings.paypalPaypalJs.anon

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  email_address :string,   payer_id :string,   name :std.Partial<{  given_name :string,   surname :string}>,   phone :std.Partial<{  phone_type :string,   phone_number :string}> | undefined,   shipping_address :std.Partial<{  name :{  full_name :string | undefined} | undefined,   type :string | undefined,   options :std.Array<{  id :string,   label :string,   type :@paypal/paypal-js.@paypal/paypal-js/types/apis/shipping.ShippingOptionType | undefined,   amount :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode | undefined,   selected :boolean}> | undefined,   address :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.Address}> | undefined,   payment_source :{  card :std.Partial<@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.Card> | undefined} | undefined}> */
trait Partialemailaddressstring extends StObject {
  
  var email_address: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[Partial[Givenname]] = js.undefined
  
  var payer_id: js.UndefOr[String] = js.undefined
  
  var payment_source: js.UndefOr[Card] = js.undefined
  
  var phone: js.UndefOr[Partial[Phonetype]] = js.undefined
  
  var shipping_address: js.UndefOr[Partial[Address]] = js.undefined
}
object Partialemailaddressstring {
  
  inline def apply(): Partialemailaddressstring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialemailaddressstring]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Partialemailaddressstring] (val x: Self) extends AnyVal {
    
    inline def setEmail_address(value: String): Self = StObject.set(x, "email_address", value.asInstanceOf[js.Any])
    
    inline def setEmail_addressUndefined: Self = StObject.set(x, "email_address", js.undefined)
    
    inline def setName(value: Partial[Givenname]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPayer_id(value: String): Self = StObject.set(x, "payer_id", value.asInstanceOf[js.Any])
    
    inline def setPayer_idUndefined: Self = StObject.set(x, "payer_id", js.undefined)
    
    inline def setPayment_source(value: Card): Self = StObject.set(x, "payment_source", value.asInstanceOf[js.Any])
    
    inline def setPayment_sourceUndefined: Self = StObject.set(x, "payment_source", js.undefined)
    
    inline def setPhone(value: Partial[Phonetype]): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setShipping_address(value: Partial[Address]): Self = StObject.set(x, "shipping_address", value.asInstanceOf[js.Any])
    
    inline def setShipping_addressUndefined: Self = StObject.set(x, "shipping_address", js.undefined)
  }
}
