package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposCreateDispatchEventEndpoint extends StObject {
  
  /**
    * JSON payload with extra information about the webhook event that your action or worklow may use.
    */
  var client_payload: js.UndefOr[ReposCreateDispatchEventParamsClientPayload] = js.native
  
  /**
    * **Required:** A custom webhook event name.
    */
  var event_type: String = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ReposCreateDispatchEventEndpoint {
  
  @scala.inline
  def apply(event_type: String, owner: String, repo: String): ReposCreateDispatchEventEndpoint = {
    val __obj = js.Dynamic.literal(event_type = event_type.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateDispatchEventEndpoint]
  }
  
  @scala.inline
  implicit class ReposCreateDispatchEventEndpointMutableBuilder[Self <: ReposCreateDispatchEventEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient_payload(value: ReposCreateDispatchEventParamsClientPayload): Self = StObject.set(x, "client_payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_payloadUndefined: Self = StObject.set(x, "client_payload", js.undefined)
    
    @scala.inline
    def setEvent_type(value: String): Self = StObject.set(x, "event_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
