package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsRemoveSelfHostedRunnerFromGroupForOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint extends StObject {
  
  var parameters: ActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint
  
  var request: ActionsRemoveSelfHostedRunnerFromGroupForOrgRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint {
  
  inline def apply(
    parameters: ActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint,
    request: ActionsRemoveSelfHostedRunnerFromGroupForOrgRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint]
  }
  
  extension [Self <: ParametersActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsRemoveSelfHostedRunnerFromGroupForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
