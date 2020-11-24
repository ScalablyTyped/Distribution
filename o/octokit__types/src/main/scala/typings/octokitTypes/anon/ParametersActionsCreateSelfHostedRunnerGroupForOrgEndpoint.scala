package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsCreateSelfHostedRunnerGroupForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateSelfHostedRunnerGroupForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ActionsCreateSelfHostedRunnerGroupForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsCreateSelfHostedRunnerGroupForOrgEndpoint extends js.Object {
  
  var parameters: ActionsCreateSelfHostedRunnerGroupForOrgEndpoint = js.native
  
  var request: ActionsCreateSelfHostedRunnerGroupForOrgRequestOptions = js.native
  
  var response: OctokitResponse[ActionsCreateSelfHostedRunnerGroupForOrgResponseData] = js.native
}
object ParametersActionsCreateSelfHostedRunnerGroupForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsCreateSelfHostedRunnerGroupForOrgEndpoint,
    request: ActionsCreateSelfHostedRunnerGroupForOrgRequestOptions,
    response: OctokitResponse[ActionsCreateSelfHostedRunnerGroupForOrgResponseData]
  ): ParametersActionsCreateSelfHostedRunnerGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateSelfHostedRunnerGroupForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsCreateSelfHostedRunnerGroupForOrgEndpointOps[Self <: ParametersActionsCreateSelfHostedRunnerGroupForOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsCreateSelfHostedRunnerGroupForOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsCreateSelfHostedRunnerGroupForOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsCreateSelfHostedRunnerGroupForOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
