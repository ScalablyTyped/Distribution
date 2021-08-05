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
  
  inline def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  
  extension [Self <: Location](x: Self) {
    
    inline def setAddress(value: NullableOption[PhysicalAddress]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setCoordinates(value: NullableOption[OutlookGeoCoordinates]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesNull: Self = StObject.set(x, "coordinates", null)
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLocationEmailAddress(value: NullableOption[String]): Self = StObject.set(x, "locationEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setLocationEmailAddressNull: Self = StObject.set(x, "locationEmailAddress", null)
    
    inline def setLocationEmailAddressUndefined: Self = StObject.set(x, "locationEmailAddress", js.undefined)
    
    inline def setLocationType(value: NullableOption[LocationType]): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    inline def setLocationTypeNull: Self = StObject.set(x, "locationType", null)
    
    inline def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    inline def setLocationUri(value: NullableOption[String]): Self = StObject.set(x, "locationUri", value.asInstanceOf[js.Any])
    
    inline def setLocationUriNull: Self = StObject.set(x, "locationUri", null)
    
    inline def setLocationUriUndefined: Self = StObject.set(x, "locationUri", js.undefined)
    
    inline def setUniqueId(value: NullableOption[String]): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    
    inline def setUniqueIdNull: Self = StObject.set(x, "uniqueId", null)
    
    inline def setUniqueIdType(value: NullableOption[LocationUniqueIdType]): Self = StObject.set(x, "uniqueIdType", value.asInstanceOf[js.Any])
    
    inline def setUniqueIdTypeNull: Self = StObject.set(x, "uniqueIdType", null)
    
    inline def setUniqueIdTypeUndefined: Self = StObject.set(x, "uniqueIdType", js.undefined)
    
    inline def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
  }
}
