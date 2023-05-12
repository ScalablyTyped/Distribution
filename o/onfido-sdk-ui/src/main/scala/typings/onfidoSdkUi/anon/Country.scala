package typings.onfidoSdkUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Country extends StObject {
  
  var country: js.UndefOr[String] = js.undefined
  
  var line1: js.UndefOr[String] = js.undefined
  
  var line2: js.UndefOr[String] = js.undefined
  
  var line3: js.UndefOr[String] = js.undefined
  
  var postcode: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
  
  var town: js.UndefOr[String] = js.undefined
}
object Country {
  
  inline def apply(): Country = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Country]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Country] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setLine1(value: String): Self = StObject.set(x, "line1", value.asInstanceOf[js.Any])
    
    inline def setLine1Undefined: Self = StObject.set(x, "line1", js.undefined)
    
    inline def setLine2(value: String): Self = StObject.set(x, "line2", value.asInstanceOf[js.Any])
    
    inline def setLine2Undefined: Self = StObject.set(x, "line2", js.undefined)
    
    inline def setLine3(value: String): Self = StObject.set(x, "line3", value.asInstanceOf[js.Any])
    
    inline def setLine3Undefined: Self = StObject.set(x, "line3", js.undefined)
    
    inline def setPostcode(value: String): Self = StObject.set(x, "postcode", value.asInstanceOf[js.Any])
    
    inline def setPostcodeUndefined: Self = StObject.set(x, "postcode", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTown(value: String): Self = StObject.set(x, "town", value.asInstanceOf[js.Any])
    
    inline def setTownUndefined: Self = StObject.set(x, "town", js.undefined)
  }
}
