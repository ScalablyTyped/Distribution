package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint extends StObject {
  
  var parameters: ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint
  
  var request: ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint {
  
  inline def apply(
    parameters: ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint,
    request: ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint]
  }
  
  extension [Self <: ParametersActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
