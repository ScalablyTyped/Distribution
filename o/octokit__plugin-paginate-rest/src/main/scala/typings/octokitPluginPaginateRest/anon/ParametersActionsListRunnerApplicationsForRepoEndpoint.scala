package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListRunnerApplicationsForRepoEndpoint extends StObject {
  
  var parameters: ActionsListRunnerApplicationsForRepoEndpoint
  
  var response: OctokitResponse[ActionsListRunnerApplicationsForRepoResponseData]
}
object ParametersActionsListRunnerApplicationsForRepoEndpoint {
  
  inline def apply(
    parameters: ActionsListRunnerApplicationsForRepoEndpoint,
    response: OctokitResponse[ActionsListRunnerApplicationsForRepoResponseData]
  ): ParametersActionsListRunnerApplicationsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRunnerApplicationsForRepoEndpoint]
  }
  
  extension [Self <: ParametersActionsListRunnerApplicationsForRepoEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsListRunnerApplicationsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsListRunnerApplicationsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
