package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Place extends Entity {
  
  // The street address of the place.
  var address: js.UndefOr[NullableOption[PhysicalAddress]] = js.native
  
  // The name associated with the place.
  var displayName: js.UndefOr[String] = js.native
  
  // Specifies the place location in latitude, longitude and (optionally) altitude coordinates.
  var geoCoordinates: js.UndefOr[NullableOption[OutlookGeoCoordinates]] = js.native
  
  // The phone number of the place.
  var phone: js.UndefOr[NullableOption[String]] = js.native
}
object Place {
  
  @scala.inline
  def apply(): Place = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Place]
  }
  
  @scala.inline
  implicit class PlaceOps[Self <: Place] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: NullableOption[PhysicalAddress]): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setAddressNull: Self = this.set("address", null)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setGeoCoordinates(value: NullableOption[OutlookGeoCoordinates]): Self = this.set("geoCoordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoCoordinates: Self = this.set("geoCoordinates", js.undefined)
    
    @scala.inline
    def setGeoCoordinatesNull: Self = this.set("geoCoordinates", null)
    
    @scala.inline
    def setPhone(value: NullableOption[String]): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    
    @scala.inline
    def setPhoneNull: Self = this.set("phone", null)
  }
}
