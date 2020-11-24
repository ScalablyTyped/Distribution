package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteInvitationEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteInvitationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposDeleteInvitationEndpoint extends js.Object {
  
  var parameters: ReposDeleteInvitationEndpoint = js.native
  
  var request: ReposDeleteInvitationRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposDeleteInvitationEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDeleteInvitationEndpoint,
    request: ReposDeleteInvitationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteInvitationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteInvitationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDeleteInvitationEndpointOps[Self <: ParametersReposDeleteInvitationEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposDeleteInvitationEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDeleteInvitationRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
