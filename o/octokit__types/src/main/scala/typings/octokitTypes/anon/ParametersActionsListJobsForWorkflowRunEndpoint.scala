package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListJobsForWorkflowRunEndpoint extends StObject {
  
  var parameters: ActionsListJobsForWorkflowRunEndpoint
  
  var request: ActionsListJobsForWorkflowRunRequestOptions
  
  var response: OctokitResponse[ActionsListJobsForWorkflowRunResponseData]
}
object ParametersActionsListJobsForWorkflowRunEndpoint {
  
  inline def apply(
    parameters: ActionsListJobsForWorkflowRunEndpoint,
    request: ActionsListJobsForWorkflowRunRequestOptions,
    response: OctokitResponse[ActionsListJobsForWorkflowRunResponseData]
  ): ParametersActionsListJobsForWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListJobsForWorkflowRunEndpoint]
  }
  
  extension [Self <: ParametersActionsListJobsForWorkflowRunEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsListJobsForWorkflowRunEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsListJobsForWorkflowRunRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsListJobsForWorkflowRunResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
