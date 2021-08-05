package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseStatus extends StObject {
  
  // The response type. The possible values are: None, Organizer, TentativelyAccepted, Accepted, Declined, NotResponded.
  var response: js.UndefOr[NullableOption[ResponseType]] = js.undefined
  
  /**
    * The date and time that the response was returned. It uses ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var time: js.UndefOr[NullableOption[String]] = js.undefined
}
object ResponseStatus {
  
  inline def apply(): ResponseStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseStatus]
  }
  
  extension [Self <: ResponseStatus](x: Self) {
    
    inline def setResponse(value: NullableOption[ResponseType]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseNull: Self = StObject.set(x, "response", null)
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setTime(value: NullableOption[String]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
