package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClientEventRequest extends StObject {
  
  /** Required. Events issued when end user interacts with customer's application that uses Cloud Talent Solution. */
  var clientEvent: js.UndefOr[ClientEvent] = js.undefined
}
object CreateClientEventRequest {
  
  inline def apply(): CreateClientEventRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClientEventRequest]
  }
  
  extension [Self <: CreateClientEventRequest](x: Self) {
    
    inline def setClientEvent(value: ClientEvent): Self = StObject.set(x, "clientEvent", value.asInstanceOf[js.Any])
    
    inline def setClientEventUndefined: Self = StObject.set(x, "clientEvent", js.undefined)
  }
}
