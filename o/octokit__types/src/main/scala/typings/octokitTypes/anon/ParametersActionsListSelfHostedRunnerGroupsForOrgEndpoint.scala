package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnerGroupsForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnerGroupsForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnerGroupsForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint extends js.Object {
  
  var parameters: ActionsListSelfHostedRunnerGroupsForOrgEndpoint = js.native
  
  var request: ActionsListSelfHostedRunnerGroupsForOrgRequestOptions = js.native
  
  var response: OctokitResponse[ActionsListSelfHostedRunnerGroupsForOrgResponseData] = js.native
}
object ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListSelfHostedRunnerGroupsForOrgEndpoint,
    request: ActionsListSelfHostedRunnerGroupsForOrgRequestOptions,
    response: OctokitResponse[ActionsListSelfHostedRunnerGroupsForOrgResponseData]
  ): ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListSelfHostedRunnerGroupsForOrgEndpointOps[Self <: ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsListSelfHostedRunnerGroupsForOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsListSelfHostedRunnerGroupsForOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListSelfHostedRunnerGroupsForOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
