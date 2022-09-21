package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamworkOnlineMeetingInfo extends StObject {
  
  // The identifier of the calendar event associated with the meeting.
  var calendarEventId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The URL that users click to join or uniquely identify the meeting.
  var joinWebUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The organizer of the meeting.
  var organizer: js.UndefOr[NullableOption[TeamworkUserIdentity]] = js.undefined
}
object TeamworkOnlineMeetingInfo {
  
  inline def apply(): TeamworkOnlineMeetingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamworkOnlineMeetingInfo]
  }
  
  extension [Self <: TeamworkOnlineMeetingInfo](x: Self) {
    
    inline def setCalendarEventId(value: NullableOption[String]): Self = StObject.set(x, "calendarEventId", value.asInstanceOf[js.Any])
    
    inline def setCalendarEventIdNull: Self = StObject.set(x, "calendarEventId", null)
    
    inline def setCalendarEventIdUndefined: Self = StObject.set(x, "calendarEventId", js.undefined)
    
    inline def setJoinWebUrl(value: NullableOption[String]): Self = StObject.set(x, "joinWebUrl", value.asInstanceOf[js.Any])
    
    inline def setJoinWebUrlNull: Self = StObject.set(x, "joinWebUrl", null)
    
    inline def setJoinWebUrlUndefined: Self = StObject.set(x, "joinWebUrl", js.undefined)
    
    inline def setOrganizer(value: NullableOption[TeamworkUserIdentity]): Self = StObject.set(x, "organizer", value.asInstanceOf[js.Any])
    
    inline def setOrganizerNull: Self = StObject.set(x, "organizer", null)
    
    inline def setOrganizerUndefined: Self = StObject.set(x, "organizer", js.undefined)
  }
}
