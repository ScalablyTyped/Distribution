package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phone extends StObject {
  
  var country_code: String
  
  var extension_number: js.UndefOr[String] = js.undefined
  
  var national_number: String
}
object Phone {
  
  inline def apply(country_code: String, national_number: String): Phone = {
    val __obj = js.Dynamic.literal(country_code = country_code.asInstanceOf[js.Any], national_number = national_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Phone] (val x: Self) extends AnyVal {
    
    inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
    
    inline def setExtension_number(value: String): Self = StObject.set(x, "extension_number", value.asInstanceOf[js.Any])
    
    inline def setExtension_numberUndefined: Self = StObject.set(x, "extension_number", js.undefined)
    
    inline def setNational_number(value: String): Self = StObject.set(x, "national_number", value.asInstanceOf[js.Any])
  }
}
