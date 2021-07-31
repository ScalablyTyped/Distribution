package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListSelfHostedRunnersForOrgEndpoint extends StObject {
  
  var parameters: ActionsListSelfHostedRunnersForOrgEndpoint
  
  var response: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData] & `0`
}
object ParametersActionsListSelfHostedRunnersForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListSelfHostedRunnersForOrgEndpoint,
    response: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData] & `0`
  ): ParametersActionsListSelfHostedRunnersForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelfHostedRunnersForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListSelfHostedRunnersForOrgEndpointMutableBuilder[Self <: ParametersActionsListSelfHostedRunnersForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListSelfHostedRunnersForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData] & `0`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
