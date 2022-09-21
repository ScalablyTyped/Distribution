package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeetingTimeSuggestionsResult extends StObject {
  
  /**
    * A reason for not returning any meeting suggestions. The possible values are: attendeesUnavailable,
    * attendeesUnavailableOrUnknown, locationsUnavailable, organizerUnavailable, or unknown. This property is an empty string
    * if the meetingTimeSuggestions property does include any meeting suggestions.
    */
  var emptySuggestionsReason: js.UndefOr[NullableOption[String]] = js.undefined
  
  // An array of meeting suggestions.
  var meetingTimeSuggestions: js.UndefOr[NullableOption[js.Array[MeetingTimeSuggestion]]] = js.undefined
}
object MeetingTimeSuggestionsResult {
  
  inline def apply(): MeetingTimeSuggestionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingTimeSuggestionsResult]
  }
  
  extension [Self <: MeetingTimeSuggestionsResult](x: Self) {
    
    inline def setEmptySuggestionsReason(value: NullableOption[String]): Self = StObject.set(x, "emptySuggestionsReason", value.asInstanceOf[js.Any])
    
    inline def setEmptySuggestionsReasonNull: Self = StObject.set(x, "emptySuggestionsReason", null)
    
    inline def setEmptySuggestionsReasonUndefined: Self = StObject.set(x, "emptySuggestionsReason", js.undefined)
    
    inline def setMeetingTimeSuggestions(value: NullableOption[js.Array[MeetingTimeSuggestion]]): Self = StObject.set(x, "meetingTimeSuggestions", value.asInstanceOf[js.Any])
    
    inline def setMeetingTimeSuggestionsNull: Self = StObject.set(x, "meetingTimeSuggestions", null)
    
    inline def setMeetingTimeSuggestionsUndefined: Self = StObject.set(x, "meetingTimeSuggestions", js.undefined)
    
    inline def setMeetingTimeSuggestionsVarargs(value: MeetingTimeSuggestion*): Self = StObject.set(x, "meetingTimeSuggestions", js.Array(value*))
  }
}
