package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeetingParticipants extends StObject {
  
  var attendees: js.UndefOr[NullableOption[js.Array[MeetingParticipantInfo]]] = js.undefined
  
  var organizer: js.UndefOr[NullableOption[MeetingParticipantInfo]] = js.undefined
}
object MeetingParticipants {
  
  inline def apply(): MeetingParticipants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingParticipants]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeetingParticipants] (val x: Self) extends AnyVal {
    
    inline def setAttendees(value: NullableOption[js.Array[MeetingParticipantInfo]]): Self = StObject.set(x, "attendees", value.asInstanceOf[js.Any])
    
    inline def setAttendeesNull: Self = StObject.set(x, "attendees", null)
    
    inline def setAttendeesUndefined: Self = StObject.set(x, "attendees", js.undefined)
    
    inline def setAttendeesVarargs(value: MeetingParticipantInfo*): Self = StObject.set(x, "attendees", js.Array(value*))
    
    inline def setOrganizer(value: NullableOption[MeetingParticipantInfo]): Self = StObject.set(x, "organizer", value.asInstanceOf[js.Any])
    
    inline def setOrganizerNull: Self = StObject.set(x, "organizer", null)
    
    inline def setOrganizerUndefined: Self = StObject.set(x, "organizer", js.undefined)
  }
}
