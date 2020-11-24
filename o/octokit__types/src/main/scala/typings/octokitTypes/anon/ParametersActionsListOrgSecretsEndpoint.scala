package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListOrgSecretsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListOrgSecretsRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListOrgSecretsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListOrgSecretsEndpoint extends js.Object {
  
  var parameters: ActionsListOrgSecretsEndpoint = js.native
  
  var request: ActionsListOrgSecretsRequestOptions = js.native
  
  var response: OctokitResponse[ActionsListOrgSecretsResponseData] = js.native
}
object ParametersActionsListOrgSecretsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListOrgSecretsEndpoint,
    request: ActionsListOrgSecretsRequestOptions,
    response: OctokitResponse[ActionsListOrgSecretsResponseData]
  ): ParametersActionsListOrgSecretsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListOrgSecretsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListOrgSecretsEndpointOps[Self <: ParametersActionsListOrgSecretsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsListOrgSecretsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsListOrgSecretsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListOrgSecretsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
