package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeetingTimeSuggestion extends StObject {
  
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
  implicit class MeetingTimeSuggestionMutableBuilder[Self <: MeetingTimeSuggestion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttendeeAvailability(value: NullableOption[js.Array[AttendeeAvailability]]): Self = StObject.set(x, "attendeeAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttendeeAvailabilityNull: Self = StObject.set(x, "attendeeAvailability", null)
    
    @scala.inline
    def setAttendeeAvailabilityUndefined: Self = StObject.set(x, "attendeeAvailability", js.undefined)
    
    @scala.inline
    def setAttendeeAvailabilityVarargs(value: AttendeeAvailability*): Self = StObject.set(x, "attendeeAvailability", js.Array(value :_*))
    
    @scala.inline
    def setConfidence(value: NullableOption[Double]): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setLocations(value: NullableOption[js.Array[Location]]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsNull: Self = StObject.set(x, "locations", null)
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setMeetingTimeSlot(value: NullableOption[TimeSlot]): Self = StObject.set(x, "meetingTimeSlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeetingTimeSlotNull: Self = StObject.set(x, "meetingTimeSlot", null)
    
    @scala.inline
    def setMeetingTimeSlotUndefined: Self = StObject.set(x, "meetingTimeSlot", js.undefined)
    
    @scala.inline
    def setOrder(value: NullableOption[Double]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderNull: Self = StObject.set(x, "order", null)
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setOrganizerAvailability(value: NullableOption[FreeBusyStatus]): Self = StObject.set(x, "organizerAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizerAvailabilityNull: Self = StObject.set(x, "organizerAvailability", null)
    
    @scala.inline
    def setOrganizerAvailabilityUndefined: Self = StObject.set(x, "organizerAvailability", js.undefined)
    
    @scala.inline
    def setSuggestionReason(value: NullableOption[String]): Self = StObject.set(x, "suggestionReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionReasonNull: Self = StObject.set(x, "suggestionReason", null)
    
    @scala.inline
    def setSuggestionReasonUndefined: Self = StObject.set(x, "suggestionReason", js.undefined)
  }
}
