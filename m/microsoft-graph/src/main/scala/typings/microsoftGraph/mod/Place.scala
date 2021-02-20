package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class PlaceMutableBuilder[Self <: Place] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: NullableOption[PhysicalAddress]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressNull: Self = StObject.set(x, "address", null)
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setGeoCoordinates(value: NullableOption[OutlookGeoCoordinates]): Self = StObject.set(x, "geoCoordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoCoordinatesNull: Self = StObject.set(x, "geoCoordinates", null)
    
    @scala.inline
    def setGeoCoordinatesUndefined: Self = StObject.set(x, "geoCoordinates", js.undefined)
    
    @scala.inline
    def setPhone(value: NullableOption[String]): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNull: Self = StObject.set(x, "phone", null)
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
  }
}
