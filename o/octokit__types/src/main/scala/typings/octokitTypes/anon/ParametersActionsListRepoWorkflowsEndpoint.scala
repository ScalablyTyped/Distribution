package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListRepoWorkflowsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRepoWorkflowsRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListRepoWorkflowsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListRepoWorkflowsEndpoint extends StObject {
  
  var parameters: ActionsListRepoWorkflowsEndpoint
  
  var request: ActionsListRepoWorkflowsRequestOptions
  
  var response: OctokitResponse[ActionsListRepoWorkflowsResponseData]
}
object ParametersActionsListRepoWorkflowsEndpoint {
  
  inline def apply(
    parameters: ActionsListRepoWorkflowsEndpoint,
    request: ActionsListRepoWorkflowsRequestOptions,
    response: OctokitResponse[ActionsListRepoWorkflowsResponseData]
  ): ParametersActionsListRepoWorkflowsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRepoWorkflowsEndpoint]
  }
  
  extension [Self <: ParametersActionsListRepoWorkflowsEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsListRepoWorkflowsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsListRepoWorkflowsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsListRepoWorkflowsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
