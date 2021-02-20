package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseStatus extends StObject {
  
  // The response type. The possible values are: None, Organizer, TentativelyAccepted, Accepted, Declined, NotResponded.
  var response: js.UndefOr[NullableOption[ResponseType]] = js.native
  
  /**
    * The date and time that the response was returned. It uses ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var time: js.UndefOr[NullableOption[String]] = js.native
}
object ResponseStatus {
  
  @scala.inline
  def apply(): ResponseStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseStatus]
  }
  
  @scala.inline
  implicit class ResponseStatusMutableBuilder[Self <: ResponseStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponse(value: NullableOption[ResponseType]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseNull: Self = StObject.set(x, "response", null)
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setTime(value: NullableOption[String]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeNull: Self = StObject.set(x, "time", null)
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
