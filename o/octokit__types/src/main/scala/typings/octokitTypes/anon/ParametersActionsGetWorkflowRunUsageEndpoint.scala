package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetWorkflowRunUsageEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowRunUsageRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowRunUsageResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsGetWorkflowRunUsageEndpoint extends StObject {
  
  var parameters: ActionsGetWorkflowRunUsageEndpoint
  
  var request: ActionsGetWorkflowRunUsageRequestOptions
  
  var response: OctokitResponse[ActionsGetWorkflowRunUsageResponseData]
}
object ParametersActionsGetWorkflowRunUsageEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsGetWorkflowRunUsageEndpoint,
    request: ActionsGetWorkflowRunUsageRequestOptions,
    response: OctokitResponse[ActionsGetWorkflowRunUsageResponseData]
  ): ParametersActionsGetWorkflowRunUsageEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetWorkflowRunUsageEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsGetWorkflowRunUsageEndpointMutableBuilder[Self <: ParametersActionsGetWorkflowRunUsageEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsGetWorkflowRunUsageEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsGetWorkflowRunUsageRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetWorkflowRunUsageResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
