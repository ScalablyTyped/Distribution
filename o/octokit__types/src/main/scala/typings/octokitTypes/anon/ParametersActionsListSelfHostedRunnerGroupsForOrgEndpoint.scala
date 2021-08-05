package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnerGroupsForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnerGroupsForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnerGroupsForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint extends StObject {
  
  var parameters: ActionsListSelfHostedRunnerGroupsForOrgEndpoint
  
  var request: ActionsListSelfHostedRunnerGroupsForOrgRequestOptions
  
  var response: OctokitResponse[ActionsListSelfHostedRunnerGroupsForOrgResponseData]
}
object ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint {
  
  inline def apply(
    parameters: ActionsListSelfHostedRunnerGroupsForOrgEndpoint,
    request: ActionsListSelfHostedRunnerGroupsForOrgRequestOptions,
    response: OctokitResponse[ActionsListSelfHostedRunnerGroupsForOrgResponseData]
  ): ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint]
  }
  
  extension [Self <: ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsListSelfHostedRunnerGroupsForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsListSelfHostedRunnerGroupsForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsListSelfHostedRunnerGroupsForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
