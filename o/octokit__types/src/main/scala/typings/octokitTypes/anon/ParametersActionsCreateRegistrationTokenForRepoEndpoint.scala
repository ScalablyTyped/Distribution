package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsCreateRegistrationTokenForRepoEndpoint extends js.Object {
  
  var parameters: ActionsCreateRegistrationTokenForRepoEndpoint = js.native
  
  var request: ActionsCreateRegistrationTokenForRepoRequestOptions = js.native
  
  var response: OctokitResponse[ActionsCreateRegistrationTokenForRepoResponseData] = js.native
}
object ParametersActionsCreateRegistrationTokenForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsCreateRegistrationTokenForRepoEndpoint,
    request: ActionsCreateRegistrationTokenForRepoRequestOptions,
    response: OctokitResponse[ActionsCreateRegistrationTokenForRepoResponseData]
  ): ParametersActionsCreateRegistrationTokenForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateRegistrationTokenForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsCreateRegistrationTokenForRepoEndpointOps[Self <: ParametersActionsCreateRegistrationTokenForRepoEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsCreateRegistrationTokenForRepoEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsCreateRegistrationTokenForRepoRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsCreateRegistrationTokenForRepoResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
