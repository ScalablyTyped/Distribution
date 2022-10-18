package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import typings.paypalCheckoutServerSdk.anon.Addressline1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Card extends StObject {
  
  var billing_address: js.UndefOr[Addressline1] = js.undefined
  
  var brand: js.UndefOr[CardBrand] = js.undefined
  
  var card_type: js.UndefOr[CardBrand] = js.undefined
  
  var expiry: String
  
  var id: js.UndefOr[String] = js.undefined
  
  var last_digits: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var number: String
  
  var security_code: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[CardType] = js.undefined
}
object Card {
  
  inline def apply(expiry: String, number: String): Card = {
    val __obj = js.Dynamic.literal(expiry = expiry.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Card]
  }
  
  extension [Self <: Card](x: Self) {
    
    inline def setBilling_address(value: Addressline1): Self = StObject.set(x, "billing_address", value.asInstanceOf[js.Any])
    
    inline def setBilling_addressUndefined: Self = StObject.set(x, "billing_address", js.undefined)
    
    inline def setBrand(value: CardBrand): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setCard_type(value: CardBrand): Self = StObject.set(x, "card_type", value.asInstanceOf[js.Any])
    
    inline def setCard_typeUndefined: Self = StObject.set(x, "card_type", js.undefined)
    
    inline def setExpiry(value: String): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLast_digits(value: String): Self = StObject.set(x, "last_digits", value.asInstanceOf[js.Any])
    
    inline def setLast_digitsUndefined: Self = StObject.set(x, "last_digits", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setSecurity_code(value: String): Self = StObject.set(x, "security_code", value.asInstanceOf[js.Any])
    
    inline def setSecurity_codeUndefined: Self = StObject.set(x, "security_code", js.undefined)
    
    inline def setType(value: CardType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
