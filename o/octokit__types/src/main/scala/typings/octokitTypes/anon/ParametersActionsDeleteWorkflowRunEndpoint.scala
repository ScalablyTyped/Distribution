package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDeleteWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsDeleteWorkflowRunRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsDeleteWorkflowRunEndpoint extends StObject {
  
  var parameters: ActionsDeleteWorkflowRunEndpoint
  
  var request: ActionsDeleteWorkflowRunRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsDeleteWorkflowRunEndpoint {
  
  inline def apply(
    parameters: ActionsDeleteWorkflowRunEndpoint,
    request: ActionsDeleteWorkflowRunRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsDeleteWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDeleteWorkflowRunEndpoint]
  }
  
  extension [Self <: ParametersActionsDeleteWorkflowRunEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsDeleteWorkflowRunEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsDeleteWorkflowRunRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
