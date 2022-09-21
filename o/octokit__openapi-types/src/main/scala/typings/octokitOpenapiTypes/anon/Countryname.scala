package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Countryname extends StObject {
  
  var country_name: js.UndefOr[String] = js.undefined
}
object Countryname {
  
  inline def apply(): Countryname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Countryname]
  }
  
  extension [Self <: Countryname](x: Self) {
    
    inline def setCountry_name(value: String): Self = StObject.set(x, "country_name", value.asInstanceOf[js.Any])
    
    inline def setCountry_nameUndefined: Self = StObject.set(x, "country_name", js.undefined)
  }
}
