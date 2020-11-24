package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsUpdateSelfHostedRunnerGroupForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsUpdateSelfHostedRunnerGroupForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ActionsUpdateSelfHostedRunnerGroupForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsUpdateSelfHostedRunnerGroupForOrgEndpoint extends js.Object {
  
  var parameters: ActionsUpdateSelfHostedRunnerGroupForOrgEndpoint = js.native
  
  var request: ActionsUpdateSelfHostedRunnerGroupForOrgRequestOptions = js.native
  
  var response: OctokitResponse[ActionsUpdateSelfHostedRunnerGroupForOrgResponseData] = js.native
}
object ParametersActionsUpdateSelfHostedRunnerGroupForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsUpdateSelfHostedRunnerGroupForOrgEndpoint,
    request: ActionsUpdateSelfHostedRunnerGroupForOrgRequestOptions,
    response: OctokitResponse[ActionsUpdateSelfHostedRunnerGroupForOrgResponseData]
  ): ParametersActionsUpdateSelfHostedRunnerGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsUpdateSelfHostedRunnerGroupForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsUpdateSelfHostedRunnerGroupForOrgEndpointOps[Self <: ParametersActionsUpdateSelfHostedRunnerGroupForOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsUpdateSelfHostedRunnerGroupForOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsUpdateSelfHostedRunnerGroupForOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsUpdateSelfHostedRunnerGroupForOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
