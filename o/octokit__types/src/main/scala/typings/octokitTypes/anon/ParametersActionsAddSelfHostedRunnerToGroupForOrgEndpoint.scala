package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsAddSelfHostedRunnerToGroupForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsAddSelfHostedRunnerToGroupForOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsAddSelfHostedRunnerToGroupForOrgEndpoint extends StObject {
  
  var parameters: ActionsAddSelfHostedRunnerToGroupForOrgEndpoint
  
  var request: ActionsAddSelfHostedRunnerToGroupForOrgRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsAddSelfHostedRunnerToGroupForOrgEndpoint {
  
  inline def apply(
    parameters: ActionsAddSelfHostedRunnerToGroupForOrgEndpoint,
    request: ActionsAddSelfHostedRunnerToGroupForOrgRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsAddSelfHostedRunnerToGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsAddSelfHostedRunnerToGroupForOrgEndpoint]
  }
  
  extension [Self <: ParametersActionsAddSelfHostedRunnerToGroupForOrgEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsAddSelfHostedRunnerToGroupForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsAddSelfHostedRunnerToGroupForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
