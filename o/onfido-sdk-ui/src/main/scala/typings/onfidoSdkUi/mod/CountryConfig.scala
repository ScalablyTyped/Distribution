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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CountryConfig] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
  }
}
