package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Countrycode extends StObject {
  
  var country_code: js.UndefOr[String] = js.undefined
  
  var language_code: js.UndefOr[String] = js.undefined
}
object Countrycode {
  
  inline def apply(): Countrycode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Countrycode]
  }
  
  extension [Self <: Countrycode](x: Self) {
    
    inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
    
    inline def setCountry_codeUndefined: Self = StObject.set(x, "country_code", js.undefined)
    
    inline def setLanguage_code(value: String): Self = StObject.set(x, "language_code", value.asInstanceOf[js.Any])
    
    inline def setLanguage_codeUndefined: Self = StObject.set(x, "language_code", js.undefined)
  }
}
