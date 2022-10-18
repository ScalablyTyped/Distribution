package typings.paypalCheckoutServerSdk.libOrdersLibMod

import typings.paypalCheckoutServerSdk.anon.Addressline1
import typings.paypalCheckoutServerSdk.libPaymentsLibMod.CardBrand
import typings.paypalCheckoutServerSdk.libPaymentsLibMod.CardType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardResponse extends StObject {
  
  var authentication_result: AuthenticationResponse
  
  var billing_address: Addressline1
  
  var brand: CardBrand
  
  var last_digits: String
  
  var name: String
  
  var `type`: CardType
}
object CardResponse {
  
  inline def apply(
    authentication_result: AuthenticationResponse,
    billing_address: Addressline1,
    brand: CardBrand,
    last_digits: String,
    name: String,
    `type`: CardType
  ): CardResponse = {
    val __obj = js.Dynamic.literal(authentication_result = authentication_result.asInstanceOf[js.Any], billing_address = billing_address.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], last_digits = last_digits.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardResponse]
  }
  
  extension [Self <: CardResponse](x: Self) {
    
    inline def setAuthentication_result(value: AuthenticationResponse): Self = StObject.set(x, "authentication_result", value.asInstanceOf[js.Any])
    
    inline def setBilling_address(value: Addressline1): Self = StObject.set(x, "billing_address", value.asInstanceOf[js.Any])
    
    inline def setBrand(value: CardBrand): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setLast_digits(value: String): Self = StObject.set(x, "last_digits", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: CardType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
