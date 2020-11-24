package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetWorkflowUsageEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowUsageRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowUsageResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsGetWorkflowUsageEndpoint extends js.Object {
  
  var parameters: ActionsGetWorkflowUsageEndpoint = js.native
  
  var request: ActionsGetWorkflowUsageRequestOptions = js.native
  
  var response: OctokitResponse[ActionsGetWorkflowUsageResponseData] = js.native
}
object ParametersActionsGetWorkflowUsageEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsGetWorkflowUsageEndpoint,
    request: ActionsGetWorkflowUsageRequestOptions,
    response: OctokitResponse[ActionsGetWorkflowUsageResponseData]
  ): ParametersActionsGetWorkflowUsageEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetWorkflowUsageEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsGetWorkflowUsageEndpointOps[Self <: ParametersActionsGetWorkflowUsageEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsGetWorkflowUsageEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsGetWorkflowUsageRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetWorkflowUsageResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
