package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeetingTimeSuggestion extends js.Object {
  
  // An array that shows the availability status of each attendee for this meeting suggestion.
  var attendeeAvailability: js.UndefOr[NullableOption[js.Array[AttendeeAvailability]]] = js.native
  
  // A percentage that represents the likelhood of all the attendees attending.
  var confidence: js.UndefOr[NullableOption[Double]] = js.native
  
  // An array that specifies the name and geographic location of each meeting location for this meeting suggestion.
  var locations: js.UndefOr[NullableOption[js.Array[Location]]] = js.native
  
  // A time period suggested for the meeting.
  var meetingTimeSlot: js.UndefOr[NullableOption[TimeSlot]] = js.native
  
  /**
    * Order of meeting time suggestions sorted by their computed confidence value from high to low, then by chronology if
    * there are suggestions with the same confidence.
    */
  var order: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Availability of the meeting organizer for this meeting suggestion. The possible values are: free, tentative, busy, oof,
    * workingElsewhere, unknown.
    */
  var organizerAvailability: js.UndefOr[NullableOption[FreeBusyStatus]] = js.native
  
  // Reason for suggesting the meeting time.
  var suggestionReason: js.UndefOr[NullableOption[String]] = js.native
}
object MeetingTimeSuggestion {
  
  @scala.inline
  def apply(): MeetingTimeSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingTimeSuggestion]
  }
  
  @scala.inline
  implicit class MeetingTimeSuggestionOps[Self <: MeetingTimeSuggestion] (val x: Self) extends AnyVal {
    
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
    def setAttendeeAvailabilityVarargs(value: AttendeeAvailability*): Self = this.set("attendeeAvailability", js.Array(value :_*))
    
    @scala.inline
    def setAttendeeAvailability(value: NullableOption[js.Array[AttendeeAvailability]]): Self = this.set("attendeeAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttendeeAvailability: Self = this.set("attendeeAvailability", js.undefined)
    
    @scala.inline
    def setAttendeeAvailabilityNull: Self = this.set("attendeeAvailability", null)
    
    @scala.inline
    def setConfidence(value: NullableOption[Double]): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    
    @scala.inline
    def setConfidenceNull: Self = this.set("confidence", null)
    
    @scala.inline
    def setLocationsVarargs(value: Location*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: NullableOption[js.Array[Location]]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    
    @scala.inline
    def setLocationsNull: Self = this.set("locations", null)
    
    @scala.inline
    def setMeetingTimeSlot(value: NullableOption[TimeSlot]): Self = this.set("meetingTimeSlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeetingTimeSlot: Self = this.set("meetingTimeSlot", js.undefined)
    
    @scala.inline
    def setMeetingTimeSlotNull: Self = this.set("meetingTimeSlot", null)
    
    @scala.inline
    def setOrder(value: NullableOption[Double]): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setOrderNull: Self = this.set("order", null)
    
    @scala.inline
    def setOrganizerAvailability(value: NullableOption[FreeBusyStatus]): Self = this.set("organizerAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizerAvailability: Self = this.set("organizerAvailability", js.undefined)
    
    @scala.inline
    def setOrganizerAvailabilityNull: Self = this.set("organizerAvailability", null)
    
    @scala.inline
    def setSuggestionReason(value: NullableOption[String]): Self = this.set("suggestionReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestionReason: Self = this.set("suggestionReason", js.undefined)
    
    @scala.inline
    def setSuggestionReasonNull: Self = this.set("suggestionReason", null)
  }
}
