package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignInLocation extends js.Object {
  
  /**
    * Provides the city where the sign-in originated. This is calculated using latitude/longitude information from the
    * sign-in activity.
    */
  var city: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Provides the country code info (2 letter code) where the sign-in originated. This is calculated using
    * latitude/longitude information from the sign-in activity.
    */
  var countryOrRegion: js.UndefOr[NullableOption[String]] = js.native
  
  // Provides the latitude, longitude and altitude where the sign-in originated.
  var geoCoordinates: js.UndefOr[NullableOption[GeoCoordinates]] = js.native
  
  /**
    * Provides the State where the sign-in originated. This is calculated using latitude/longitude information from the
    * sign-in activity.
    */
  var state: js.UndefOr[NullableOption[String]] = js.native
}
object SignInLocation {
  
  @scala.inline
  def apply(): SignInLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignInLocation]
  }
  
  @scala.inline
  implicit class SignInLocationOps[Self <: SignInLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCity(value: NullableOption[String]): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    
    @scala.inline
    def setCityNull: Self = this.set("city", null)
    
    @scala.inline
    def setCountryOrRegion(value: NullableOption[String]): Self = this.set("countryOrRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryOrRegion: Self = this.set("countryOrRegion", js.undefined)
    
    @scala.inline
    def setCountryOrRegionNull: Self = this.set("countryOrRegion", null)
    
    @scala.inline
    def setGeoCoordinates(value: NullableOption[GeoCoordinates]): Self = this.set("geoCoordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoCoordinates: Self = this.set("geoCoordinates", js.undefined)
    
    @scala.inline
    def setGeoCoordinatesNull: Self = this.set("geoCoordinates", null)
    
    @scala.inline
    def setState(value: NullableOption[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStateNull: Self = this.set("state", null)
  }
}
