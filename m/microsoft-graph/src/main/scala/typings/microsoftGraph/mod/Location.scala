package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  // The street address of the location.
  var address: js.UndefOr[NullableOption[PhysicalAddress]] = js.undefined
  
  // The geographic coordinates and elevation of the location.
  var coordinates: js.UndefOr[NullableOption[OutlookGeoCoordinates]] = js.undefined
  
  // The name associated with the location.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Optional email address of the location.
  var locationEmailAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The type of location. The possible values are: default, conferenceRoom, homeAddress, businessAddress,geoCoordinates,
    * streetAddress, hotel, restaurant, localBusiness, postalAddress. Read-only.
    */
  var locationType: js.UndefOr[NullableOption[LocationType]] = js.undefined
  
  // Optional URI representing the location.
  var locationUri: js.UndefOr[NullableOption[String]] = js.undefined
  
  // For internal use only.
  var uniqueId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // For internal use only.
  var uniqueIdType: js.UndefOr[NullableOption[LocationUniqueIdType]] = js.undefined
}
object Location {
  
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: NullableOption[PhysicalAddress]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressNull: Self = StObject.set(x, "address", null)
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setCoordinates(value: NullableOption[OutlookGeoCoordinates]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesNull: Self = StObject.set(x, "coordinates", null)
    
    @scala.inline
    def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLocationEmailAddress(value: NullableOption[String]): Self = StObject.set(x, "locationEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationEmailAddressNull: Self = StObject.set(x, "locationEmailAddress", null)
    
    @scala.inline
    def setLocationEmailAddressUndefined: Self = StObject.set(x, "locationEmailAddress", js.undefined)
    
    @scala.inline
    def setLocationType(value: NullableOption[LocationType]): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationTypeNull: Self = StObject.set(x, "locationType", null)
    
    @scala.inline
    def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    @scala.inline
    def setLocationUri(value: NullableOption[String]): Self = StObject.set(x, "locationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUriNull: Self = StObject.set(x, "locationUri", null)
    
    @scala.inline
    def setLocationUriUndefined: Self = StObject.set(x, "locationUri", js.undefined)
    
    @scala.inline
    def setUniqueId(value: NullableOption[String]): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueIdNull: Self = StObject.set(x, "uniqueId", null)
    
    @scala.inline
    def setUniqueIdType(value: NullableOption[LocationUniqueIdType]): Self = StObject.set(x, "uniqueIdType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueIdTypeNull: Self = StObject.set(x, "uniqueIdType", null)
    
    @scala.inline
    def setUniqueIdTypeUndefined: Self = StObject.set(x, "uniqueIdType", js.undefined)
    
    @scala.inline
    def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
  }
}
