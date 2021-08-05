package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetWorkflowUsageEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowUsageRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowUsageResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsGetWorkflowUsageEndpoint extends StObject {
  
  var parameters: ActionsGetWorkflowUsageEndpoint
  
  var request: ActionsGetWorkflowUsageRequestOptions
  
  var response: OctokitResponse[ActionsGetWorkflowUsageResponseData]
}
object ParametersActionsGetWorkflowUsageEndpoint {
  
  inline def apply(
    parameters: ActionsGetWorkflowUsageEndpoint,
    request: ActionsGetWorkflowUsageRequestOptions,
    response: OctokitResponse[ActionsGetWorkflowUsageResponseData]
  ): ParametersActionsGetWorkflowUsageEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetWorkflowUsageEndpoint]
  }
  
  extension [Self <: ParametersActionsGetWorkflowUsageEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsGetWorkflowUsageEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsGetWorkflowUsageRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsGetWorkflowUsageResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
