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
  
  @scala.inline
  def apply(): SignInLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignInLocation]
  }
  
  @scala.inline
  implicit class SignInLocationMutableBuilder[Self <: SignInLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: NullableOption[String]): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityNull: Self = StObject.set(x, "city", null)
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    @scala.inline
    def setCountryOrRegion(value: NullableOption[String]): Self = StObject.set(x, "countryOrRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryOrRegionNull: Self = StObject.set(x, "countryOrRegion", null)
    
    @scala.inline
    def setCountryOrRegionUndefined: Self = StObject.set(x, "countryOrRegion", js.undefined)
    
    @scala.inline
    def setGeoCoordinates(value: NullableOption[GeoCoordinates]): Self = StObject.set(x, "geoCoordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoCoordinatesNull: Self = StObject.set(x, "geoCoordinates", null)
    
    @scala.inline
    def setGeoCoordinatesUndefined: Self = StObject.set(x, "geoCoordinates", js.undefined)
    
    @scala.inline
    def setState(value: NullableOption[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNull: Self = StObject.set(x, "state", null)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
