package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsUpdateSelfHostedRunnerGroupForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsUpdateSelfHostedRunnerGroupForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ActionsUpdateSelfHostedRunnerGroupForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsUpdateSelfHostedRunnerGroupForOrgEndpoint extends StObject {
  
  var parameters: ActionsUpdateSelfHostedRunnerGroupForOrgEndpoint
  
  var request: ActionsUpdateSelfHostedRunnerGroupForOrgRequestOptions
  
  var response: OctokitResponse[ActionsUpdateSelfHostedRunnerGroupForOrgResponseData]
}
object ParametersActionsUpdateSelfHostedRunnerGroupForOrgEndpoint {
  
  inline def apply(
    parameters: ActionsUpdateSelfHostedRunnerGroupForOrgEndpoint,
    request: ActionsUpdateSelfHostedRunnerGroupForOrgRequestOptions,
    response: OctokitResponse[ActionsUpdateSelfHostedRunnerGroupForOrgResponseData]
  ): ParametersActionsUpdateSelfHostedRunnerGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsUpdateSelfHostedRunnerGroupForOrgEndpoint]
  }
  
  extension [Self <: ParametersActionsUpdateSelfHostedRunnerGroupForOrgEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsUpdateSelfHostedRunnerGroupForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsUpdateSelfHostedRunnerGroupForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsUpdateSelfHostedRunnerGroupForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
