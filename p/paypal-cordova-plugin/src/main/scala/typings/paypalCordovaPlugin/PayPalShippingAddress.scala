package typings.paypalCordovaPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayPalShippingAddress extends StObject {
  
  /**
    * City name. 50 characters max.
    */
  var city: String
  
  /**
    * 2-letter country code. 2 characters max.
    */
  var countryCode: String
  
  /**
    * Line 1 of the address (e.g., Number, street, etc). 100 characters max.
    */
  var line1: String
  
  /**
    * Line 2 of the address (e.g., Suite, apt #, etc). 100 characters max. Optional.
    */
  var line2: String
  
  /**
    * ZIP code or equivalent is usually required for countries that have them. 20 characters max. Required in certain countries.
    */
  var postalCode: String
  
  /**
    * Name of the recipient at this address. 50 characters max.
    */
  var recipientName: String
  
  /**
    * 2-letter code for US states, and the equivalent for other countries. 100 characters max. Required in certain countries.
    */
  var state: String
}
object PayPalShippingAddress {
  
  @scala.inline
  def apply(
    city: String,
    countryCode: String,
    line1: String,
    line2: String,
    postalCode: String,
    recipientName: String,
    state: String
  ): PayPalShippingAddress = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], line1 = line1.asInstanceOf[js.Any], line2 = line2.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], recipientName = recipientName.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalShippingAddress]
  }
  
  @scala.inline
  implicit class PayPalShippingAddressMutableBuilder[Self <: PayPalShippingAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine1(value: String): Self = StObject.set(x, "line1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine2(value: String): Self = StObject.set(x, "line2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientName(value: String): Self = StObject.set(x, "recipientName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
