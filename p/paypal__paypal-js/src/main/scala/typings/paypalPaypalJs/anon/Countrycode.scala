package typings.paypalPaypalJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Countrycode extends StObject {
  
  /** The country calling code (CC), in its canonical international */
  var country_code: String
  
  /**
    * The extension number.
    * @minLength 1
    * @maxLength 15
    */
  var extension_number: js.UndefOr[String] = js.undefined
  
  /**
    * The national number, in its canonical international.
    * @minLength 1
    * @maxLength 14
    */
  var national_number: String
}
object Countrycode {
  
  inline def apply(country_code: String, national_number: String): Countrycode = {
    val __obj = js.Dynamic.literal(country_code = country_code.asInstanceOf[js.Any], national_number = national_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Countrycode]
  }
  
  extension [Self <: Countrycode](x: Self) {
    
    inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
    
    inline def setExtension_number(value: String): Self = StObject.set(x, "extension_number", value.asInstanceOf[js.Any])
    
    inline def setExtension_numberUndefined: Self = StObject.set(x, "extension_number", js.undefined)
    
    inline def setNational_number(value: String): Self = StObject.set(x, "national_number", value.asInstanceOf[js.Any])
  }
}
