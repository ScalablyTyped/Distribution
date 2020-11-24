package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsAddSelfHostedRunnerToGroupForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsAddSelfHostedRunnerToGroupForOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsAddSelfHostedRunnerToGroupForOrgEndpoint extends js.Object {
  
  var parameters: ActionsAddSelfHostedRunnerToGroupForOrgEndpoint = js.native
  
  var request: ActionsAddSelfHostedRunnerToGroupForOrgRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsAddSelfHostedRunnerToGroupForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsAddSelfHostedRunnerToGroupForOrgEndpoint,
    request: ActionsAddSelfHostedRunnerToGroupForOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsAddSelfHostedRunnerToGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsAddSelfHostedRunnerToGroupForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsAddSelfHostedRunnerToGroupForOrgEndpointOps[Self <: ParametersActionsAddSelfHostedRunnerToGroupForOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsAddSelfHostedRunnerToGroupForOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsAddSelfHostedRunnerToGroupForOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
