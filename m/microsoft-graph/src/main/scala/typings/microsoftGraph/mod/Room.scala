package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Room extends Place {
  
  // Specifies the name of the audio device in the room.
  var audioDeviceName: js.UndefOr[NullableOption[String]] = js.native
  
  // Type of room. Possible values are standard, and reserved.
  var bookingType: js.UndefOr[NullableOption[BookingType]] = js.native
  
  // Specifies the building name or building number that the room is in.
  var building: js.UndefOr[NullableOption[String]] = js.native
  
  // Specifies the capacity of the room.
  var capacity: js.UndefOr[NullableOption[Double]] = js.native
  
  // Specifies the name of the display device in the room.
  var displayDeviceName: js.UndefOr[NullableOption[String]] = js.native
  
  // Email address of the room.
  var emailAddress: js.UndefOr[NullableOption[String]] = js.native
  
  // Specifies a descriptive label for the floor, for example, P.
  var floorLabel: js.UndefOr[NullableOption[String]] = js.native
  
  // Specifies the floor number that the room is on.
  var floorNumber: js.UndefOr[NullableOption[Double]] = js.native
  
  var isWheelChairAccessible: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Specifies a descriptive label for the room, for example, a number or name.
  var label: js.UndefOr[NullableOption[String]] = js.native
  
  // Specifies a nickname for the room, for example, 'conf room'.
  var nickname: js.UndefOr[String] = js.native
  
  // Specifies additional features of the room, for example, details like the type of view or furniture type.
  var tags: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // Specifies the name of the video device in the room.
  var videoDeviceName: js.UndefOr[NullableOption[String]] = js.native
}
object Room {
  
  @scala.inline
  def apply(): Room = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Room]
  }
  
  @scala.inline
  implicit class RoomMutableBuilder[Self <: Room] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioDeviceName(value: NullableOption[String]): Self = StObject.set(x, "audioDeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioDeviceNameNull: Self = StObject.set(x, "audioDeviceName", null)
    
    @scala.inline
    def setAudioDeviceNameUndefined: Self = StObject.set(x, "audioDeviceName", js.undefined)
    
    @scala.inline
    def setBookingType(value: NullableOption[BookingType]): Self = StObject.set(x, "bookingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookingTypeNull: Self = StObject.set(x, "bookingType", null)
    
    @scala.inline
    def setBookingTypeUndefined: Self = StObject.set(x, "bookingType", js.undefined)
    
    @scala.inline
    def setBuilding(value: NullableOption[String]): Self = StObject.set(x, "building", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildingNull: Self = StObject.set(x, "building", null)
    
    @scala.inline
    def setBuildingUndefined: Self = StObject.set(x, "building", js.undefined)
    
    @scala.inline
    def setCapacity(value: NullableOption[Double]): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityNull: Self = StObject.set(x, "capacity", null)
    
    @scala.inline
    def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    
    @scala.inline
    def setDisplayDeviceName(value: NullableOption[String]): Self = StObject.set(x, "displayDeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayDeviceNameNull: Self = StObject.set(x, "displayDeviceName", null)
    
    @scala.inline
    def setDisplayDeviceNameUndefined: Self = StObject.set(x, "displayDeviceName", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: NullableOption[String]): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    @scala.inline
    def setFloorLabel(value: NullableOption[String]): Self = StObject.set(x, "floorLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloorLabelNull: Self = StObject.set(x, "floorLabel", null)
    
    @scala.inline
    def setFloorLabelUndefined: Self = StObject.set(x, "floorLabel", js.undefined)
    
    @scala.inline
    def setFloorNumber(value: NullableOption[Double]): Self = StObject.set(x, "floorNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloorNumberNull: Self = StObject.set(x, "floorNumber", null)
    
    @scala.inline
    def setFloorNumberUndefined: Self = StObject.set(x, "floorNumber", js.undefined)
    
    @scala.inline
    def setIsWheelChairAccessible(value: NullableOption[Boolean]): Self = StObject.set(x, "isWheelChairAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWheelChairAccessibleNull: Self = StObject.set(x, "isWheelChairAccessible", null)
    
    @scala.inline
    def setIsWheelChairAccessibleUndefined: Self = StObject.set(x, "isWheelChairAccessible", js.undefined)
    
    @scala.inline
    def setLabel(value: NullableOption[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNull: Self = StObject.set(x, "label", null)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    @scala.inline
    def setTags(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsNull: Self = StObject.set(x, "tags", null)
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setVideoDeviceName(value: NullableOption[String]): Self = StObject.set(x, "videoDeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDeviceNameNull: Self = StObject.set(x, "videoDeviceName", null)
    
    @scala.inline
    def setVideoDeviceNameUndefined: Self = StObject.set(x, "videoDeviceName", js.undefined)
  }
}
