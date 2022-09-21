package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrinterLocation extends StObject {
  
  // The altitude, in meters, that the printer is located at.
  var altitudeInMeters: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The building that the printer is located in.
  var building: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The city that the printer is located in.
  var city: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The country or region that the printer is located in.
  var countryOrRegion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The floor that the printer is located on. Only numerical values are supported right now.
  var floor: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The description of the floor that the printer is located on.
  var floorDescription: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The latitude that the printer is located at.
  var latitude: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The longitude that the printer is located at.
  var longitude: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The organizational hierarchy that the printer belongs to. The elements should be in hierarchical order.
  var organization: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // The postal code that the printer is located in.
  var postalCode: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The description of the room that the printer is located in.
  var roomDescription: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The room that the printer is located in. Only numerical values are supported right now.
  var roomName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The site that the printer is located in.
  var site: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The state or province that the printer is located in.
  var stateOrProvince: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The street address where the printer is located.
  var streetAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The subdivision that the printer is located in. The elements should be in hierarchical order.
  var subdivision: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var subunit: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object PrinterLocation {
  
  inline def apply(): PrinterLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterLocation]
  }
  
  extension [Self <: PrinterLocation](x: Self) {
    
    inline def setAltitudeInMeters(value: NullableOption[Double]): Self = StObject.set(x, "altitudeInMeters", value.asInstanceOf[js.Any])
    
    inline def setAltitudeInMetersNull: Self = StObject.set(x, "altitudeInMeters", null)
    
    inline def setAltitudeInMetersUndefined: Self = StObject.set(x, "altitudeInMeters", js.undefined)
    
    inline def setBuilding(value: NullableOption[String]): Self = StObject.set(x, "building", value.asInstanceOf[js.Any])
    
    inline def setBuildingNull: Self = StObject.set(x, "building", null)
    
    inline def setBuildingUndefined: Self = StObject.set(x, "building", js.undefined)
    
    inline def setCity(value: NullableOption[String]): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityNull: Self = StObject.set(x, "city", null)
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setCountryOrRegion(value: NullableOption[String]): Self = StObject.set(x, "countryOrRegion", value.asInstanceOf[js.Any])
    
    inline def setCountryOrRegionNull: Self = StObject.set(x, "countryOrRegion", null)
    
    inline def setCountryOrRegionUndefined: Self = StObject.set(x, "countryOrRegion", js.undefined)
    
    inline def setFloor(value: NullableOption[String]): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
    
    inline def setFloorDescription(value: NullableOption[String]): Self = StObject.set(x, "floorDescription", value.asInstanceOf[js.Any])
    
    inline def setFloorDescriptionNull: Self = StObject.set(x, "floorDescription", null)
    
    inline def setFloorDescriptionUndefined: Self = StObject.set(x, "floorDescription", js.undefined)
    
    inline def setFloorNull: Self = StObject.set(x, "floor", null)
    
    inline def setFloorUndefined: Self = StObject.set(x, "floor", js.undefined)
    
    inline def setLatitude(value: NullableOption[Double]): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeNull: Self = StObject.set(x, "latitude", null)
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: NullableOption[Double]): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeNull: Self = StObject.set(x, "longitude", null)
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    inline def setOrganization(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationNull: Self = StObject.set(x, "organization", null)
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setOrganizationVarargs(value: String*): Self = StObject.set(x, "organization", js.Array(value*))
    
    inline def setPostalCode(value: NullableOption[String]): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeNull: Self = StObject.set(x, "postalCode", null)
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setRoomDescription(value: NullableOption[String]): Self = StObject.set(x, "roomDescription", value.asInstanceOf[js.Any])
    
    inline def setRoomDescriptionNull: Self = StObject.set(x, "roomDescription", null)
    
    inline def setRoomDescriptionUndefined: Self = StObject.set(x, "roomDescription", js.undefined)
    
    inline def setRoomName(value: NullableOption[String]): Self = StObject.set(x, "roomName", value.asInstanceOf[js.Any])
    
    inline def setRoomNameNull: Self = StObject.set(x, "roomName", null)
    
    inline def setRoomNameUndefined: Self = StObject.set(x, "roomName", js.undefined)
    
    inline def setSite(value: NullableOption[String]): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteNull: Self = StObject.set(x, "site", null)
    
    inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    
    inline def setStateOrProvince(value: NullableOption[String]): Self = StObject.set(x, "stateOrProvince", value.asInstanceOf[js.Any])
    
    inline def setStateOrProvinceNull: Self = StObject.set(x, "stateOrProvince", null)
    
    inline def setStateOrProvinceUndefined: Self = StObject.set(x, "stateOrProvince", js.undefined)
    
    inline def setStreetAddress(value: NullableOption[String]): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    
    inline def setStreetAddressNull: Self = StObject.set(x, "streetAddress", null)
    
    inline def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
    
    inline def setSubdivision(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "subdivision", value.asInstanceOf[js.Any])
    
    inline def setSubdivisionNull: Self = StObject.set(x, "subdivision", null)
    
    inline def setSubdivisionUndefined: Self = StObject.set(x, "subdivision", js.undefined)
    
    inline def setSubdivisionVarargs(value: String*): Self = StObject.set(x, "subdivision", js.Array(value*))
    
    inline def setSubunit(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "subunit", value.asInstanceOf[js.Any])
    
    inline def setSubunitNull: Self = StObject.set(x, "subunit", null)
    
    inline def setSubunitUndefined: Self = StObject.set(x, "subunit", js.undefined)
    
    inline def setSubunitVarargs(value: String*): Self = StObject.set(x, "subunit", js.Array(value*))
  }
}
