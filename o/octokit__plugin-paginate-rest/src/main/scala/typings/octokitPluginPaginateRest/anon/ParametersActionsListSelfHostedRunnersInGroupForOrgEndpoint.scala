package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersInGroupForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersInGroupForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListSelfHostedRunnersInGroupForOrgEndpoint extends StObject {
  
  var parameters: ActionsListSelfHostedRunnersInGroupForOrgEndpoint
  
  var response: OctokitResponse[ActionsListSelfHostedRunnersInGroupForOrgResponseData] & `0`
}
object ParametersActionsListSelfHostedRunnersInGroupForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListSelfHostedRunnersInGroupForOrgEndpoint,
    response: OctokitResponse[ActionsListSelfHostedRunnersInGroupForOrgResponseData] & `0`
  ): ParametersActionsListSelfHostedRunnersInGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelfHostedRunnersInGroupForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListSelfHostedRunnersInGroupForOrgEndpointMutableBuilder[Self <: ParametersActionsListSelfHostedRunnersInGroupForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListSelfHostedRunnersInGroupForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListSelfHostedRunnersInGroupForOrgResponseData] & `0`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
