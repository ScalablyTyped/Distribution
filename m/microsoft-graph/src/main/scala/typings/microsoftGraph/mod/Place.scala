package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Place
  extends StObject
     with Entity {
  
  // The street address of the place.
  var address: js.UndefOr[NullableOption[PhysicalAddress]] = js.undefined
  
  // The name associated with the place.
  var displayName: js.UndefOr[String] = js.undefined
  
  // Specifies the place location in latitude, longitude and (optionally) altitude coordinates.
  var geoCoordinates: js.UndefOr[NullableOption[OutlookGeoCoordinates]] = js.undefined
  
  // The phone number of the place.
  var phone: js.UndefOr[NullableOption[String]] = js.undefined
}
object Place {
  
  inline def apply(): Place = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Place]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Place] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: NullableOption[PhysicalAddress]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGeoCoordinates(value: NullableOption[OutlookGeoCoordinates]): Self = StObject.set(x, "geoCoordinates", value.asInstanceOf[js.Any])
    
    inline def setGeoCoordinatesNull: Self = StObject.set(x, "geoCoordinates", null)
    
    inline def setGeoCoordinatesUndefined: Self = StObject.set(x, "geoCoordinates", js.undefined)
    
    inline def setPhone(value: NullableOption[String]): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneNull: Self = StObject.set(x, "phone", null)
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
  }
}
