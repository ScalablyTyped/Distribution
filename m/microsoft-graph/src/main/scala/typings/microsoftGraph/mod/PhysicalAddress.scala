package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicalAddress extends StObject {
  
  // The city.
  var city: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The country or region. It's a free-format string value, for example, 'United States'.
  var countryOrRegion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The postal code.
  var postalCode: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The state.
  var state: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The street.
  var street: js.UndefOr[NullableOption[String]] = js.undefined
}
object PhysicalAddress {
  
  inline def apply(): PhysicalAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicalAddress]
  }
  
  extension [Self <: PhysicalAddress](x: Self) {
    
    inline def setCity(value: NullableOption[String]): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityNull: Self = StObject.set(x, "city", null)
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setCountryOrRegion(value: NullableOption[String]): Self = StObject.set(x, "countryOrRegion", value.asInstanceOf[js.Any])
    
    inline def setCountryOrRegionNull: Self = StObject.set(x, "countryOrRegion", null)
    
    inline def setCountryOrRegionUndefined: Self = StObject.set(x, "countryOrRegion", js.undefined)
    
    inline def setPostalCode(value: NullableOption[String]): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeNull: Self = StObject.set(x, "postalCode", null)
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setState(value: NullableOption[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStreet(value: NullableOption[String]): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    
    inline def setStreetNull: Self = StObject.set(x, "street", null)
    
    inline def setStreetUndefined: Self = StObject.set(x, "street", js.undefined)
  }
}
