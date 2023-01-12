package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignInLocation extends StObject {
  
  /**
    * Provides the city where the sign-in originated. This is calculated using latitude/longitude information from the
    * sign-in activity.
    */
  var city: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Provides the country code info (2 letter code) where the sign-in originated. This is calculated using
    * latitude/longitude information from the sign-in activity.
    */
  var countryOrRegion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Provides the latitude, longitude and altitude where the sign-in originated.
  var geoCoordinates: js.UndefOr[NullableOption[GeoCoordinates]] = js.undefined
  
  /**
    * Provides the State where the sign-in originated. This is calculated using latitude/longitude information from the
    * sign-in activity.
    */
  var state: js.UndefOr[NullableOption[String]] = js.undefined
}
object SignInLocation {
  
  inline def apply(): SignInLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignInLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignInLocation] (val x: Self) extends AnyVal {
    
    inline def setCity(value: NullableOption[String]): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityNull: Self = StObject.set(x, "city", null)
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setCountryOrRegion(value: NullableOption[String]): Self = StObject.set(x, "countryOrRegion", value.asInstanceOf[js.Any])
    
    inline def setCountryOrRegionNull: Self = StObject.set(x, "countryOrRegion", null)
    
    inline def setCountryOrRegionUndefined: Self = StObject.set(x, "countryOrRegion", js.undefined)
    
    inline def setGeoCoordinates(value: NullableOption[GeoCoordinates]): Self = StObject.set(x, "geoCoordinates", value.asInstanceOf[js.Any])
    
    inline def setGeoCoordinatesNull: Self = StObject.set(x, "geoCoordinates", null)
    
    inline def setGeoCoordinatesUndefined: Self = StObject.set(x, "geoCoordinates", js.undefined)
    
    inline def setState(value: NullableOption[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
