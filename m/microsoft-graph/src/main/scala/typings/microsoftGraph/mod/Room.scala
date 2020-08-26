package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Room extends Place {
  // Specifies the name of the audio device in the room.
  var audioDeviceName: js.UndefOr[String] = js.native
  // Type of room. Possible values are standard, and reserved.
  var bookingType: js.UndefOr[BookingType] = js.native
  // Specifies the building name or building number that the room is in.
  var building: js.UndefOr[String] = js.native
  // Specifies the capacity of the room.
  var capacity: js.UndefOr[Double] = js.native
  // Specifies the name of the display device in the room.
  var displayDeviceName: js.UndefOr[String] = js.native
  // Email address of the room.
  var emailAddress: js.UndefOr[String] = js.native
  // Specifies a descriptive label for the floor, for example, P.
  var floorLabel: js.UndefOr[String] = js.native
  // Specifies the floor number that the room is on.
  var floorNumber: js.UndefOr[Double] = js.native
  var isWheelChairAccessible: js.UndefOr[Boolean] = js.native
  // Specifies a descriptive label for the room, for example, a number or name.
  var label: js.UndefOr[String] = js.native
  // Specifies a nickname for the room, for example, 'conf room'.
  var nickname: js.UndefOr[String] = js.native
  // Specifies additional features of the room, for example, details like the type of view or furniture type.
  var tags: js.UndefOr[js.Array[String]] = js.native
  // Specifies the name of the video device in the room.
  var videoDeviceName: js.UndefOr[String] = js.native
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
    def setAudioDeviceName(value: String): Self = this.set("audioDeviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioDeviceName: Self = this.set("audioDeviceName", js.undefined)
    @scala.inline
    def setBookingType(value: BookingType): Self = this.set("bookingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBookingType: Self = this.set("bookingType", js.undefined)
    @scala.inline
    def setBuilding(value: String): Self = this.set("building", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuilding: Self = this.set("building", js.undefined)
    @scala.inline
    def setCapacity(value: Double): Self = this.set("capacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacity: Self = this.set("capacity", js.undefined)
    @scala.inline
    def setDisplayDeviceName(value: String): Self = this.set("displayDeviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayDeviceName: Self = this.set("displayDeviceName", js.undefined)
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    @scala.inline
    def setFloorLabel(value: String): Self = this.set("floorLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloorLabel: Self = this.set("floorLabel", js.undefined)
    @scala.inline
    def setFloorNumber(value: Double): Self = this.set("floorNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloorNumber: Self = this.set("floorNumber", js.undefined)
    @scala.inline
    def setIsWheelChairAccessible(value: Boolean): Self = this.set("isWheelChairAccessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsWheelChairAccessible: Self = this.set("isWheelChairAccessible", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNickname: Self = this.set("nickname", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVideoDeviceName(value: String): Self = this.set("videoDeviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoDeviceName: Self = this.set("videoDeviceName", js.undefined)
  }
  
}

