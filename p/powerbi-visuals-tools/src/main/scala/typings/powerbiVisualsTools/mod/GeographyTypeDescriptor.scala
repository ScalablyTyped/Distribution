package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeographyTypeDescriptor extends StObject {
  
  val address: js.UndefOr[Boolean] = js.undefined
  
  val city: js.UndefOr[Boolean] = js.undefined
  
  val continent: js.UndefOr[Boolean] = js.undefined
  
  val country: js.UndefOr[Boolean] = js.undefined
  
  val county: js.UndefOr[Boolean] = js.undefined
  
  val latitude: js.UndefOr[Boolean] = js.undefined
  
  val longitude: js.UndefOr[Boolean] = js.undefined
  
  val place: js.UndefOr[Boolean] = js.undefined
  
  val postalCode: js.UndefOr[Boolean] = js.undefined
  
  val region: js.UndefOr[Boolean] = js.undefined
  
  val stateOrProvince: js.UndefOr[Boolean] = js.undefined
}
object GeographyTypeDescriptor {
  
  inline def apply(): GeographyTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeographyTypeDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeographyTypeDescriptor] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: Boolean): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setCity(value: Boolean): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setContinent(value: Boolean): Self = StObject.set(x, "continent", value.asInstanceOf[js.Any])
    
    inline def setContinentUndefined: Self = StObject.set(x, "continent", js.undefined)
    
    inline def setCountry(value: Boolean): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCounty(value: Boolean): Self = StObject.set(x, "county", value.asInstanceOf[js.Any])
    
    inline def setCountyUndefined: Self = StObject.set(x, "county", js.undefined)
    
    inline def setLatitude(value: Boolean): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Boolean): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    inline def setPlace(value: Boolean): Self = StObject.set(x, "place", value.asInstanceOf[js.Any])
    
    inline def setPlaceUndefined: Self = StObject.set(x, "place", js.undefined)
    
    inline def setPostalCode(value: Boolean): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setRegion(value: Boolean): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setStateOrProvince(value: Boolean): Self = StObject.set(x, "stateOrProvince", value.asInstanceOf[js.Any])
    
    inline def setStateOrProvinceUndefined: Self = StObject.set(x, "stateOrProvince", js.undefined)
  }
}
