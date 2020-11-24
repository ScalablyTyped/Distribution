package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposCreateDispatchEventEndpoint extends js.Object {
  
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
  implicit class ReposCreateDispatchEventEndpointOps[Self <: ReposCreateDispatchEventEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvent_type(value: String): Self = this.set("event_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_payload(value: ReposCreateDispatchEventParamsClientPayload): Self = this.set("client_payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient_payload: Self = this.set("client_payload", js.undefined)
  }
}
