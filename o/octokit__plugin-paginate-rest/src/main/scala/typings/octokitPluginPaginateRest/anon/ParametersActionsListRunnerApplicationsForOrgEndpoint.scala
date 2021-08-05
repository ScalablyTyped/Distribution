package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListRunnerApplicationsForOrgEndpoint extends StObject {
  
  var parameters: ActionsListRunnerApplicationsForOrgEndpoint
  
  var response: OctokitResponse[ActionsListRunnerApplicationsForOrgResponseData]
}
object ParametersActionsListRunnerApplicationsForOrgEndpoint {
  
  inline def apply(
    parameters: ActionsListRunnerApplicationsForOrgEndpoint,
    response: OctokitResponse[ActionsListRunnerApplicationsForOrgResponseData]
  ): ParametersActionsListRunnerApplicationsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRunnerApplicationsForOrgEndpoint]
  }
  
  extension [Self <: ParametersActionsListRunnerApplicationsForOrgEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsListRunnerApplicationsForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsListRunnerApplicationsForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
