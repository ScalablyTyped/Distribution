package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Location extends js.Object {
  
  // The street address of the location.
  var address: js.UndefOr[NullableOption[PhysicalAddress]] = js.native
  
  // The geographic coordinates and elevation of the location.
  var coordinates: js.UndefOr[NullableOption[OutlookGeoCoordinates]] = js.native
  
  // The name associated with the location.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Optional email address of the location.
  var locationEmailAddress: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The type of location. The possible values are: default, conferenceRoom, homeAddress, businessAddress,geoCoordinates,
    * streetAddress, hotel, restaurant, localBusiness, postalAddress. Read-only.
    */
  var locationType: js.UndefOr[NullableOption[LocationType]] = js.native
  
  // Optional URI representing the location.
  var locationUri: js.UndefOr[NullableOption[String]] = js.native
  
  // For internal use only.
  var uniqueId: js.UndefOr[NullableOption[String]] = js.native
  
  // For internal use only.
  var uniqueIdType: js.UndefOr[NullableOption[LocationUniqueIdType]] = js.native
}
object Location {
  
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    
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
    def setCoordinates(value: NullableOption[OutlookGeoCoordinates]): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoordinates: Self = this.set("coordinates", js.undefined)
    
    @scala.inline
    def setCoordinatesNull: Self = this.set("coordinates", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setLocationEmailAddress(value: NullableOption[String]): Self = this.set("locationEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationEmailAddress: Self = this.set("locationEmailAddress", js.undefined)
    
    @scala.inline
    def setLocationEmailAddressNull: Self = this.set("locationEmailAddress", null)
    
    @scala.inline
    def setLocationType(value: NullableOption[LocationType]): Self = this.set("locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationType: Self = this.set("locationType", js.undefined)
    
    @scala.inline
    def setLocationTypeNull: Self = this.set("locationType", null)
    
    @scala.inline
    def setLocationUri(value: NullableOption[String]): Self = this.set("locationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationUri: Self = this.set("locationUri", js.undefined)
    
    @scala.inline
    def setLocationUriNull: Self = this.set("locationUri", null)
    
    @scala.inline
    def setUniqueId(value: NullableOption[String]): Self = this.set("uniqueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueId: Self = this.set("uniqueId", js.undefined)
    
    @scala.inline
    def setUniqueIdNull: Self = this.set("uniqueId", null)
    
    @scala.inline
    def setUniqueIdType(value: NullableOption[LocationUniqueIdType]): Self = this.set("uniqueIdType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueIdType: Self = this.set("uniqueIdType", js.undefined)
    
    @scala.inline
    def setUniqueIdTypeNull: Self = this.set("uniqueIdType", null)
  }
}
