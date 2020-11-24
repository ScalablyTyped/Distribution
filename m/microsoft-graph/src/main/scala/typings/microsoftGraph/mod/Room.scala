package typings.microsoftGraph.mod

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
  implicit class RoomOps[Self <: Room] (val x: Self) extends AnyVal {
    
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
    def setAudioDeviceName(value: NullableOption[String]): Self = this.set("audioDeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioDeviceName: Self = this.set("audioDeviceName", js.undefined)
    
    @scala.inline
    def setAudioDeviceNameNull: Self = this.set("audioDeviceName", null)
    
    @scala.inline
    def setBookingType(value: NullableOption[BookingType]): Self = this.set("bookingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBookingType: Self = this.set("bookingType", js.undefined)
    
    @scala.inline
    def setBookingTypeNull: Self = this.set("bookingType", null)
    
    @scala.inline
    def setBuilding(value: NullableOption[String]): Self = this.set("building", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuilding: Self = this.set("building", js.undefined)
    
    @scala.inline
    def setBuildingNull: Self = this.set("building", null)
    
    @scala.inline
    def setCapacity(value: NullableOption[Double]): Self = this.set("capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacity: Self = this.set("capacity", js.undefined)
    
    @scala.inline
    def setCapacityNull: Self = this.set("capacity", null)
    
    @scala.inline
    def setDisplayDeviceName(value: NullableOption[String]): Self = this.set("displayDeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayDeviceName: Self = this.set("displayDeviceName", js.undefined)
    
    @scala.inline
    def setDisplayDeviceNameNull: Self = this.set("displayDeviceName", null)
    
    @scala.inline
    def setEmailAddress(value: NullableOption[String]): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    
    @scala.inline
    def setEmailAddressNull: Self = this.set("emailAddress", null)
    
    @scala.inline
    def setFloorLabel(value: NullableOption[String]): Self = this.set("floorLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloorLabel: Self = this.set("floorLabel", js.undefined)
    
    @scala.inline
    def setFloorLabelNull: Self = this.set("floorLabel", null)
    
    @scala.inline
    def setFloorNumber(value: NullableOption[Double]): Self = this.set("floorNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloorNumber: Self = this.set("floorNumber", js.undefined)
    
    @scala.inline
    def setFloorNumberNull: Self = this.set("floorNumber", null)
    
    @scala.inline
    def setIsWheelChairAccessible(value: NullableOption[Boolean]): Self = this.set("isWheelChairAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsWheelChairAccessible: Self = this.set("isWheelChairAccessible", js.undefined)
    
    @scala.inline
    def setIsWheelChairAccessibleNull: Self = this.set("isWheelChairAccessible", null)
    
    @scala.inline
    def setLabel(value: NullableOption[String]): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelNull: Self = this.set("label", null)
    
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNickname: Self = this.set("nickname", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: NullableOption[js.Array[String]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTagsNull: Self = this.set("tags", null)
    
    @scala.inline
    def setVideoDeviceName(value: NullableOption[String]): Self = this.set("videoDeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoDeviceName: Self = this.set("videoDeviceName", js.undefined)
    
    @scala.inline
    def setVideoDeviceNameNull: Self = this.set("videoDeviceName", null)
  }
}
