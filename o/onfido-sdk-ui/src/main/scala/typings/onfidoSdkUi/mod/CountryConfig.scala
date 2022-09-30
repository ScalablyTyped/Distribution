package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountryConfig extends StObject {
  
  var country: String | Null
}
object CountryConfig {
  
  inline def apply(): CountryConfig = {
    val __obj = js.Dynamic.literal(country = null)
    __obj.asInstanceOf[CountryConfig]
  }
  
  extension [Self <: CountryConfig](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
  }
}
