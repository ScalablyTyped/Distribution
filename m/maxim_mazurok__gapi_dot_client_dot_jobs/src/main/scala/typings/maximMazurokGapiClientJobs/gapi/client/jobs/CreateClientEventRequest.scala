package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClientEventRequest extends StObject {
  
  /** Required. Events issued when end user interacts with customer's application that uses Cloud Talent Solution. */
  var clientEvent: js.UndefOr[ClientEvent] = js.native
}
object CreateClientEventRequest {
  
  @scala.inline
  def apply(): CreateClientEventRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClientEventRequest]
  }
  
  @scala.inline
  implicit class CreateClientEventRequestMutableBuilder[Self <: CreateClientEventRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientEvent(value: ClientEvent): Self = StObject.set(x, "clientEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientEventUndefined: Self = StObject.set(x, "clientEvent", js.undefined)
  }
}
