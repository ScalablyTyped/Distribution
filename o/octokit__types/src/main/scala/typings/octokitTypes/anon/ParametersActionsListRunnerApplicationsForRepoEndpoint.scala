package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListRunnerApplicationsForRepoEndpoint extends StObject {
  
  var parameters: ActionsListRunnerApplicationsForRepoEndpoint
  
  var request: ActionsListRunnerApplicationsForRepoRequestOptions
  
  var response: OctokitResponse[ActionsListRunnerApplicationsForRepoResponseData]
}
object ParametersActionsListRunnerApplicationsForRepoEndpoint {
  
  inline def apply(
    parameters: ActionsListRunnerApplicationsForRepoEndpoint,
    request: ActionsListRunnerApplicationsForRepoRequestOptions,
    response: OctokitResponse[ActionsListRunnerApplicationsForRepoResponseData]
  ): ParametersActionsListRunnerApplicationsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRunnerApplicationsForRepoEndpoint]
  }
  
  extension [Self <: ParametersActionsListRunnerApplicationsForRepoEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsListRunnerApplicationsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsListRunnerApplicationsForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsListRunnerApplicationsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
