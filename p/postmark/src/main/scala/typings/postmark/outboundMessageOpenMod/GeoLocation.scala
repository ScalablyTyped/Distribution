package typings.postmark.outboundMessageOpenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoLocation extends js.Object {
  
  var City: js.UndefOr[String] = js.native
  
  var Coords: js.UndefOr[String] = js.native
  
  var Country: js.UndefOr[String] = js.native
  
  var CountryISOCode: js.UndefOr[String] = js.native
  
  var IP: js.UndefOr[String] = js.native
  
  var Region: js.UndefOr[String] = js.native
  
  var RegionISOCode: js.UndefOr[String] = js.native
  
  var Zip: js.UndefOr[String] = js.native
}
object GeoLocation {
  
  @scala.inline
  def apply(): GeoLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoLocation]
  }
  
  @scala.inline
  implicit class GeoLocationOps[Self <: GeoLocation] (val x: Self) extends AnyVal {
    
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
    def setCity(value: String): Self = this.set("City", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("City", js.undefined)
    
    @scala.inline
    def setCoords(value: String): Self = this.set("Coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoords: Self = this.set("Coords", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("Country", js.undefined)
    
    @scala.inline
    def setCountryISOCode(value: String): Self = this.set("CountryISOCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryISOCode: Self = this.set("CountryISOCode", js.undefined)
    
    @scala.inline
    def setIP(value: String): Self = this.set("IP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIP: Self = this.set("IP", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    
    @scala.inline
    def setRegionISOCode(value: String): Self = this.set("RegionISOCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionISOCode: Self = this.set("RegionISOCode", js.undefined)
    
    @scala.inline
    def setZip(value: String): Self = this.set("Zip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZip: Self = this.set("Zip", js.undefined)
  }
}
