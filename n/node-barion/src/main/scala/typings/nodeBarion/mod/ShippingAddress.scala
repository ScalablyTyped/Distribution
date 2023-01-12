package typings.nodeBarion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingAddress extends StObject {
  
  var City: js.UndefOr[String] = js.undefined
  
  var Country: js.UndefOr[String] = js.undefined
  
  var FullName: js.UndefOr[String] = js.undefined
  
  var Region: js.UndefOr[String] = js.undefined
  
  var Street: js.UndefOr[String] = js.undefined
  
  var Street2: js.UndefOr[String] = js.undefined
  
  var Street3: js.UndefOr[String] = js.undefined
  
  var Zip: js.UndefOr[String] = js.undefined
}
object ShippingAddress {
  
  inline def apply(): ShippingAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShippingAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShippingAddress] (val x: Self) extends AnyVal {
    
    inline def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    inline def setFullName(value: String): Self = StObject.set(x, "FullName", value.asInstanceOf[js.Any])
    
    inline def setFullNameUndefined: Self = StObject.set(x, "FullName", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setStreet(value: String): Self = StObject.set(x, "Street", value.asInstanceOf[js.Any])
    
    inline def setStreet2(value: String): Self = StObject.set(x, "Street2", value.asInstanceOf[js.Any])
    
    inline def setStreet2Undefined: Self = StObject.set(x, "Street2", js.undefined)
    
    inline def setStreet3(value: String): Self = StObject.set(x, "Street3", value.asInstanceOf[js.Any])
    
    inline def setStreet3Undefined: Self = StObject.set(x, "Street3", js.undefined)
    
    inline def setStreetUndefined: Self = StObject.set(x, "Street", js.undefined)
    
    inline def setZip(value: String): Self = StObject.set(x, "Zip", value.asInstanceOf[js.Any])
    
    inline def setZipUndefined: Self = StObject.set(x, "Zip", js.undefined)
  }
}
