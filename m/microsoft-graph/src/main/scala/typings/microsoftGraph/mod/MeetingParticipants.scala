package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeetingParticipants extends js.Object {
  
  var attendees: js.UndefOr[NullableOption[js.Array[MeetingParticipantInfo]]] = js.native
  
  var organizer: js.UndefOr[NullableOption[MeetingParticipantInfo]] = js.native
}
object MeetingParticipants {
  
  @scala.inline
  def apply(): MeetingParticipants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingParticipants]
  }
  
  @scala.inline
  implicit class MeetingParticipantsOps[Self <: MeetingParticipants] (val x: Self) extends AnyVal {
    
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
    def setAttendeesVarargs(value: MeetingParticipantInfo*): Self = this.set("attendees", js.Array(value :_*))
    
    @scala.inline
    def setAttendees(value: NullableOption[js.Array[MeetingParticipantInfo]]): Self = this.set("attendees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttendees: Self = this.set("attendees", js.undefined)
    
    @scala.inline
    def setAttendeesNull: Self = this.set("attendees", null)
    
    @scala.inline
    def setOrganizer(value: NullableOption[MeetingParticipantInfo]): Self = this.set("organizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizer: Self = this.set("organizer", js.undefined)
    
    @scala.inline
    def setOrganizerNull: Self = this.set("organizer", null)
  }
}
