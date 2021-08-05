package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListWorkflowRunsEndpoint extends StObject {
  
  var parameters: ActionsListWorkflowRunsEndpoint
  
  var request: ActionsListWorkflowRunsRequestOptions
  
  var response: OctokitResponse[ActionsListWorkflowRunsResponseData]
}
object ParametersActionsListWorkflowRunsEndpoint {
  
  inline def apply(
    parameters: ActionsListWorkflowRunsEndpoint,
    request: ActionsListWorkflowRunsRequestOptions,
    response: OctokitResponse[ActionsListWorkflowRunsResponseData]
  ): ParametersActionsListWorkflowRunsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListWorkflowRunsEndpoint]
  }
  
  extension [Self <: ParametersActionsListWorkflowRunsEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsListWorkflowRunsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsListWorkflowRunsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsListWorkflowRunsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
