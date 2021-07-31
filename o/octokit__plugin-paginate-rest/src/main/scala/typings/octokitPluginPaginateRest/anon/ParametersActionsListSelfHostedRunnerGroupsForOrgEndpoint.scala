package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnerGroupsForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnerGroupsForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint extends StObject {
  
  var parameters: ActionsListSelfHostedRunnerGroupsForOrgEndpoint
  
  var response: OctokitResponse[ActionsListSelfHostedRunnerGroupsForOrgResponseData] & `2`
}
object ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListSelfHostedRunnerGroupsForOrgEndpoint,
    response: OctokitResponse[ActionsListSelfHostedRunnerGroupsForOrgResponseData] & `2`
  ): ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListSelfHostedRunnerGroupsForOrgEndpointMutableBuilder[Self <: ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListSelfHostedRunnerGroupsForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListSelfHostedRunnerGroupsForOrgResponseData] & `2`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
