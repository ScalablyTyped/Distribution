package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposCreateDispatchEventEndpoint extends StObject {
  
  /**
    * JSON payload with extra information about the webhook event that your action or worklow may use.
    */
  var client_payload: js.UndefOr[ReposCreateDispatchEventParamsClientPayload] = js.undefined
  
  /**
    * **Required:** A custom webhook event name.
    */
  var event_type: String
  
  var owner: String
  
  var repo: String
}
object ReposCreateDispatchEventEndpoint {
  
  inline def apply(event_type: String, owner: String, repo: String): ReposCreateDispatchEventEndpoint = {
    val __obj = js.Dynamic.literal(event_type = event_type.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateDispatchEventEndpoint]
  }
  
  extension [Self <: ReposCreateDispatchEventEndpoint](x: Self) {
    
    inline def setClient_payload(value: ReposCreateDispatchEventParamsClientPayload): Self = StObject.set(x, "client_payload", value.asInstanceOf[js.Any])
    
    inline def setClient_payloadUndefined: Self = StObject.set(x, "client_payload", js.undefined)
    
    inline def setEvent_type(value: String): Self = StObject.set(x, "event_type", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
