package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerGroupForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerGroupForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerGroupForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsGetSelfHostedRunnerGroupForOrgEndpoint extends js.Object {
  
  var parameters: ActionsGetSelfHostedRunnerGroupForOrgEndpoint = js.native
  
  var request: ActionsGetSelfHostedRunnerGroupForOrgRequestOptions = js.native
  
  var response: OctokitResponse[ActionsGetSelfHostedRunnerGroupForOrgResponseData] = js.native
}
object ParametersActionsGetSelfHostedRunnerGroupForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsGetSelfHostedRunnerGroupForOrgEndpoint,
    request: ActionsGetSelfHostedRunnerGroupForOrgRequestOptions,
    response: OctokitResponse[ActionsGetSelfHostedRunnerGroupForOrgResponseData]
  ): ParametersActionsGetSelfHostedRunnerGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetSelfHostedRunnerGroupForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsGetSelfHostedRunnerGroupForOrgEndpointOps[Self <: ParametersActionsGetSelfHostedRunnerGroupForOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsGetSelfHostedRunnerGroupForOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsGetSelfHostedRunnerGroupForOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetSelfHostedRunnerGroupForOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
