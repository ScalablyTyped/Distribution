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
  
  @scala.inline
  def apply(
    parameters: ActionsListRunnerApplicationsForOrgEndpoint,
    response: OctokitResponse[ActionsListRunnerApplicationsForOrgResponseData]
  ): ParametersActionsListRunnerApplicationsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRunnerApplicationsForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListRunnerApplicationsForOrgEndpointMutableBuilder[Self <: ParametersActionsListRunnerApplicationsForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListRunnerApplicationsForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListRunnerApplicationsForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
