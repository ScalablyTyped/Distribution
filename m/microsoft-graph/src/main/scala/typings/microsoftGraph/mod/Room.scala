package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Room
  extends StObject
     with Place {
  
  // Specifies the name of the audio device in the room.
  var audioDeviceName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Type of room. Possible values are standard, and reserved.
  var bookingType: js.UndefOr[NullableOption[BookingType]] = js.undefined
  
  // Specifies the building name or building number that the room is in.
  var building: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specifies the capacity of the room.
  var capacity: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Specifies the name of the display device in the room.
  var displayDeviceName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Email address of the room.
  var emailAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specifies a descriptive label for the floor, for example, P.
  var floorLabel: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specifies the floor number that the room is on.
  var floorNumber: js.UndefOr[NullableOption[Double]] = js.undefined
  
  var isWheelChairAccessible: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Specifies a descriptive label for the room, for example, a number or name.
  var label: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specifies a nickname for the room, for example, 'conf room'.
  var nickname: js.UndefOr[String] = js.undefined
  
  // Specifies additional features of the room, for example, details like the type of view or furniture type.
  var tags: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // Specifies the name of the video device in the room.
  var videoDeviceName: js.UndefOr[NullableOption[String]] = js.undefined
}
object Room {
  
  inline def apply(): Room = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Room]
  }
  
  extension [Self <: Room](x: Self) {
    
    inline def setAudioDeviceName(value: NullableOption[String]): Self = StObject.set(x, "audioDeviceName", value.asInstanceOf[js.Any])
    
    inline def setAudioDeviceNameNull: Self = StObject.set(x, "audioDeviceName", null)
    
    inline def setAudioDeviceNameUndefined: Self = StObject.set(x, "audioDeviceName", js.undefined)
    
    inline def setBookingType(value: NullableOption[BookingType]): Self = StObject.set(x, "bookingType", value.asInstanceOf[js.Any])
    
    inline def setBookingTypeNull: Self = StObject.set(x, "bookingType", null)
    
    inline def setBookingTypeUndefined: Self = StObject.set(x, "bookingType", js.undefined)
    
    inline def setBuilding(value: NullableOption[String]): Self = StObject.set(x, "building", value.asInstanceOf[js.Any])
    
    inline def setBuildingNull: Self = StObject.set(x, "building", null)
    
    inline def setBuildingUndefined: Self = StObject.set(x, "building", js.undefined)
    
    inline def setCapacity(value: NullableOption[Double]): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityNull: Self = StObject.set(x, "capacity", null)
    
    inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    
    inline def setDisplayDeviceName(value: NullableOption[String]): Self = StObject.set(x, "displayDeviceName", value.asInstanceOf[js.Any])
    
    inline def setDisplayDeviceNameNull: Self = StObject.set(x, "displayDeviceName", null)
    
    inline def setDisplayDeviceNameUndefined: Self = StObject.set(x, "displayDeviceName", js.undefined)
    
    inline def setEmailAddress(value: NullableOption[String]): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setFloorLabel(value: NullableOption[String]): Self = StObject.set(x, "floorLabel", value.asInstanceOf[js.Any])
    
    inline def setFloorLabelNull: Self = StObject.set(x, "floorLabel", null)
    
    inline def setFloorLabelUndefined: Self = StObject.set(x, "floorLabel", js.undefined)
    
    inline def setFloorNumber(value: NullableOption[Double]): Self = StObject.set(x, "floorNumber", value.asInstanceOf[js.Any])
    
    inline def setFloorNumberNull: Self = StObject.set(x, "floorNumber", null)
    
    inline def setFloorNumberUndefined: Self = StObject.set(x, "floorNumber", js.undefined)
    
    inline def setIsWheelChairAccessible(value: NullableOption[Boolean]): Self = StObject.set(x, "isWheelChairAccessible", value.asInstanceOf[js.Any])
    
    inline def setIsWheelChairAccessibleNull: Self = StObject.set(x, "isWheelChairAccessible", null)
    
    inline def setIsWheelChairAccessibleUndefined: Self = StObject.set(x, "isWheelChairAccessible", js.undefined)
    
    inline def setLabel(value: NullableOption[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    inline def setTags(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setVideoDeviceName(value: NullableOption[String]): Self = StObject.set(x, "videoDeviceName", value.asInstanceOf[js.Any])
    
    inline def setVideoDeviceNameNull: Self = StObject.set(x, "videoDeviceName", null)
    
    inline def setVideoDeviceNameUndefined: Self = StObject.set(x, "videoDeviceName", js.undefined)
  }
}
