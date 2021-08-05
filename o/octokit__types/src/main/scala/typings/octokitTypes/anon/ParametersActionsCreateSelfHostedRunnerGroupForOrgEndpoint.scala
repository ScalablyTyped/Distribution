package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsCreateSelfHostedRunnerGroupForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateSelfHostedRunnerGroupForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ActionsCreateSelfHostedRunnerGroupForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsCreateSelfHostedRunnerGroupForOrgEndpoint extends StObject {
  
  var parameters: ActionsCreateSelfHostedRunnerGroupForOrgEndpoint
  
  var request: ActionsCreateSelfHostedRunnerGroupForOrgRequestOptions
  
  var response: OctokitResponse[ActionsCreateSelfHostedRunnerGroupForOrgResponseData]
}
object ParametersActionsCreateSelfHostedRunnerGroupForOrgEndpoint {
  
  inline def apply(
    parameters: ActionsCreateSelfHostedRunnerGroupForOrgEndpoint,
    request: ActionsCreateSelfHostedRunnerGroupForOrgRequestOptions,
    response: OctokitResponse[ActionsCreateSelfHostedRunnerGroupForOrgResponseData]
  ): ParametersActionsCreateSelfHostedRunnerGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateSelfHostedRunnerGroupForOrgEndpoint]
  }
  
  extension [Self <: ParametersActionsCreateSelfHostedRunnerGroupForOrgEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsCreateSelfHostedRunnerGroupForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsCreateSelfHostedRunnerGroupForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsCreateSelfHostedRunnerGroupForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
