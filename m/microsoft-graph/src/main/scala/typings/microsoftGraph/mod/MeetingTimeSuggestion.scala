package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeetingTimeSuggestion extends StObject {
  
  // An array that shows the availability status of each attendee for this meeting suggestion.
  var attendeeAvailability: js.UndefOr[NullableOption[js.Array[AttendeeAvailability]]] = js.undefined
  
  // A percentage that represents the likelhood of all the attendees attending.
  var confidence: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // An array that specifies the name and geographic location of each meeting location for this meeting suggestion.
  var locations: js.UndefOr[NullableOption[js.Array[Location]]] = js.undefined
  
  // A time period suggested for the meeting.
  var meetingTimeSlot: js.UndefOr[NullableOption[TimeSlot]] = js.undefined
  
  /**
    * Order of meeting time suggestions sorted by their computed confidence value from high to low, then by chronology if
    * there are suggestions with the same confidence.
    */
  var order: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Availability of the meeting organizer for this meeting suggestion. The possible values are: free, tentative, busy, oof,
    * workingElsewhere, unknown.
    */
  var organizerAvailability: js.UndefOr[NullableOption[FreeBusyStatus]] = js.undefined
  
  // Reason for suggesting the meeting time.
  var suggestionReason: js.UndefOr[NullableOption[String]] = js.undefined
}
object MeetingTimeSuggestion {
  
  inline def apply(): MeetingTimeSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingTimeSuggestion]
  }
  
  extension [Self <: MeetingTimeSuggestion](x: Self) {
    
    inline def setAttendeeAvailability(value: NullableOption[js.Array[AttendeeAvailability]]): Self = StObject.set(x, "attendeeAvailability", value.asInstanceOf[js.Any])
    
    inline def setAttendeeAvailabilityNull: Self = StObject.set(x, "attendeeAvailability", null)
    
    inline def setAttendeeAvailabilityUndefined: Self = StObject.set(x, "attendeeAvailability", js.undefined)
    
    inline def setAttendeeAvailabilityVarargs(value: AttendeeAvailability*): Self = StObject.set(x, "attendeeAvailability", js.Array(value*))
    
    inline def setConfidence(value: NullableOption[Double]): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setLocations(value: NullableOption[js.Array[Location]]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsNull: Self = StObject.set(x, "locations", null)
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value*))
    
    inline def setMeetingTimeSlot(value: NullableOption[TimeSlot]): Self = StObject.set(x, "meetingTimeSlot", value.asInstanceOf[js.Any])
    
    inline def setMeetingTimeSlotNull: Self = StObject.set(x, "meetingTimeSlot", null)
    
    inline def setMeetingTimeSlotUndefined: Self = StObject.set(x, "meetingTimeSlot", js.undefined)
    
    inline def setOrder(value: NullableOption[Double]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrganizerAvailability(value: NullableOption[FreeBusyStatus]): Self = StObject.set(x, "organizerAvailability", value.asInstanceOf[js.Any])
    
    inline def setOrganizerAvailabilityNull: Self = StObject.set(x, "organizerAvailability", null)
    
    inline def setOrganizerAvailabilityUndefined: Self = StObject.set(x, "organizerAvailability", js.undefined)
    
    inline def setSuggestionReason(value: NullableOption[String]): Self = StObject.set(x, "suggestionReason", value.asInstanceOf[js.Any])
    
    inline def setSuggestionReasonNull: Self = StObject.set(x, "suggestionReason", null)
    
    inline def setSuggestionReasonUndefined: Self = StObject.set(x, "suggestionReason", js.undefined)
  }
}
