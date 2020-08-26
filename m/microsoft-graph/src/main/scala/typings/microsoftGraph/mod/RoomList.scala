package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomList extends Place {
  // The email address of the room list.
  var emailAddress: js.UndefOr[String] = js.native
  // Read-only. Nullable.
  var rooms: js.UndefOr[js.Array[Room]] = js.native
}

object RoomList {
  @scala.inline
  def apply(): RoomList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomList]
  }
  @scala.inline
  implicit class RoomListOps[Self <: RoomList] (val x: Self) extends AnyVal {
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
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    @scala.inline
    def setRoomsVarargs(value: Room*): Self = this.set("rooms", js.Array(value :_*))
    @scala.inline
    def setRooms(value: js.Array[Room]): Self = this.set("rooms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRooms: Self = this.set("rooms", js.undefined)
  }
  
}

