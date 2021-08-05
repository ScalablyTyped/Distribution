package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetJobForWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetJobForWorkflowRunRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetJobForWorkflowRunResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsGetJobForWorkflowRunEndpoint extends StObject {
  
  var parameters: ActionsGetJobForWorkflowRunEndpoint
  
  var request: ActionsGetJobForWorkflowRunRequestOptions
  
  var response: OctokitResponse[ActionsGetJobForWorkflowRunResponseData]
}
object ParametersActionsGetJobForWorkflowRunEndpoint {
  
  inline def apply(
    parameters: ActionsGetJobForWorkflowRunEndpoint,
    request: ActionsGetJobForWorkflowRunRequestOptions,
    response: OctokitResponse[ActionsGetJobForWorkflowRunResponseData]
  ): ParametersActionsGetJobForWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetJobForWorkflowRunEndpoint]
  }
  
  extension [Self <: ParametersActionsGetJobForWorkflowRunEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsGetJobForWorkflowRunEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsGetJobForWorkflowRunRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsGetJobForWorkflowRunResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
