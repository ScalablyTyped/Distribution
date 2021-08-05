package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDeleteWorkflowRunLogsEndpoint
import typings.octokitTypes.endpointsMod.ActionsDeleteWorkflowRunLogsRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsDeleteWorkflowRunLogsEndpoint extends StObject {
  
  var parameters: ActionsDeleteWorkflowRunLogsEndpoint
  
  var request: ActionsDeleteWorkflowRunLogsRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsDeleteWorkflowRunLogsEndpoint {
  
  inline def apply(
    parameters: ActionsDeleteWorkflowRunLogsEndpoint,
    request: ActionsDeleteWorkflowRunLogsRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsDeleteWorkflowRunLogsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDeleteWorkflowRunLogsEndpoint]
  }
  
  extension [Self <: ParametersActionsDeleteWorkflowRunLogsEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsDeleteWorkflowRunLogsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsDeleteWorkflowRunLogsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
