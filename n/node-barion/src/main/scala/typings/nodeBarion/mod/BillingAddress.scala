package typings.nodeBarion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingAddress extends StObject {
  
  var City: js.UndefOr[String] = js.undefined
  
  var Country: js.UndefOr[String] = js.undefined
  
  var Region: js.UndefOr[String] = js.undefined
  
  var Street: js.UndefOr[String] = js.undefined
  
  var Street2: js.UndefOr[String] = js.undefined
  
  var Street3: js.UndefOr[String] = js.undefined
  
  var Zip: js.UndefOr[String] = js.undefined
}
object BillingAddress {
  
  inline def apply(): BillingAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingAddress]
  }
  
  extension [Self <: BillingAddress](x: Self) {
    
    inline def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
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
