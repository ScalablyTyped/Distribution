package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseStatus extends StObject {
  
  /**
    * The response type. Possible values are: none, organizer, tentativelyAccepted, accepted, declined, notResponded.To
    * differentiate between none and notResponded: none – from organizer's perspective. This value is used when the status of
    * an attendee/participant is reported to the organizer of a meeting. notResponded – from attendde's perspective.
    * Indicates the attendee has not responded to the meeting request. Clients can treat notResponded == none. As an example,
    * if attendee Alex hasn't responded to a meeting request, getting Alex' response status for that event in Alex' calendar
    * returns notResponded. Getting Alex' response from the calendar of any other attendee or the organizer's returns none.
    * Getting the organizer's response for the event in anybody's calendar also returns none.
    */
  var response: js.UndefOr[NullableOption[ResponseType]] = js.undefined
  
  /**
    * The date and time that the response was returned. It uses ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var time: js.UndefOr[NullableOption[String]] = js.undefined
}
object ResponseStatus {
  
  inline def apply(): ResponseStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseStatus] (val x: Self) extends AnyVal {
    
    inline def setResponse(value: NullableOption[ResponseType]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseNull: Self = StObject.set(x, "response", null)
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setTime(value: NullableOption[String]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
