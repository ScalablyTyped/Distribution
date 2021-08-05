package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsRemoveRepoAccessToSelfHostedRunnerGroupInOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsRemoveRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsRemoveRepoAccessToSelfHostedRunnerGroupInOrgEndpoint extends StObject {
  
  var parameters: ActionsRemoveRepoAccessToSelfHostedRunnerGroupInOrgEndpoint
  
  var request: ActionsRemoveRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsRemoveRepoAccessToSelfHostedRunnerGroupInOrgEndpoint {
  
  inline def apply(
    parameters: ActionsRemoveRepoAccessToSelfHostedRunnerGroupInOrgEndpoint,
    request: ActionsRemoveRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsRemoveRepoAccessToSelfHostedRunnerGroupInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsRemoveRepoAccessToSelfHostedRunnerGroupInOrgEndpoint]
  }
  
  extension [Self <: ParametersActionsRemoveRepoAccessToSelfHostedRunnerGroupInOrgEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsRemoveRepoAccessToSelfHostedRunnerGroupInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsRemoveRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
