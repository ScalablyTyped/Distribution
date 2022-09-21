package typings.paypalPaypalJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brand extends StObject {
  
  var brand: String
  
  var card_type: String
  
  var last_digits: String
  
  var `type`: String
}
object Brand {
  
  inline def apply(brand: String, card_type: String, last_digits: String, `type`: String): Brand = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], card_type = card_type.asInstanceOf[js.Any], last_digits = last_digits.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brand]
  }
  
  extension [Self <: Brand](x: Self) {
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setCard_type(value: String): Self = StObject.set(x, "card_type", value.asInstanceOf[js.Any])
    
    inline def setLast_digits(value: String): Self = StObject.set(x, "last_digits", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
