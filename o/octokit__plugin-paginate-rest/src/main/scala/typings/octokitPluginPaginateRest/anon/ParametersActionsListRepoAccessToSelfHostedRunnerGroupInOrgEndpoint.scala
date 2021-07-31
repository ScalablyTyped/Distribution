package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRepoAccessToSelfHostedRunnerGroupInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint extends StObject {
  
  var parameters: ActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint
  
  var response: OctokitResponse[ActionsListRepoAccessToSelfHostedRunnerGroupInOrgResponseData] & `3`
}
object ParametersActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint,
    response: OctokitResponse[ActionsListRepoAccessToSelfHostedRunnerGroupInOrgResponseData] & `3`
  ): ParametersActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpointMutableBuilder[Self <: ParametersActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListRepoAccessToSelfHostedRunnerGroupInOrgResponseData] & `3`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
