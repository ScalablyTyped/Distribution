package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var city: String
  
  var country_code: String
  
  var line1: String
  
  var line2: js.UndefOr[String] = js.undefined
  
  val normalization_status: js.UndefOr[String] = js.undefined
  
  var phone: js.UndefOr[String] = js.undefined
  
  var postal_code: String
  
  var recipient_name: js.UndefOr[String] = js.undefined
  
  var state: String
  
  var `type`: js.UndefOr[String] = js.undefined
}
object Address {
  
  inline def apply(city: String, country_code: String, line1: String, postal_code: String, state: String): Address = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], line1 = line1.asInstanceOf[js.Any], postal_code = postal_code.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
    
    inline def setLine1(value: String): Self = StObject.set(x, "line1", value.asInstanceOf[js.Any])
    
    inline def setLine2(value: String): Self = StObject.set(x, "line2", value.asInstanceOf[js.Any])
    
    inline def setLine2Undefined: Self = StObject.set(x, "line2", js.undefined)
    
    inline def setNormalization_status(value: String): Self = StObject.set(x, "normalization_status", value.asInstanceOf[js.Any])
    
    inline def setNormalization_statusUndefined: Self = StObject.set(x, "normalization_status", js.undefined)
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
    
    inline def setRecipient_name(value: String): Self = StObject.set(x, "recipient_name", value.asInstanceOf[js.Any])
    
    inline def setRecipient_nameUndefined: Self = StObject.set(x, "recipient_name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
