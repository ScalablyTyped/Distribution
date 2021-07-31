package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsAddRepoAccessToSelfHostedRunnerGroupInOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsAddRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsAddRepoAccessToSelfHostedRunnerGroupInOrgEndpoint extends StObject {
  
  var parameters: ActionsAddRepoAccessToSelfHostedRunnerGroupInOrgEndpoint
  
  var request: ActionsAddRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsAddRepoAccessToSelfHostedRunnerGroupInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsAddRepoAccessToSelfHostedRunnerGroupInOrgEndpoint,
    request: ActionsAddRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsAddRepoAccessToSelfHostedRunnerGroupInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsAddRepoAccessToSelfHostedRunnerGroupInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsAddRepoAccessToSelfHostedRunnerGroupInOrgEndpointMutableBuilder[Self <: ParametersActionsAddRepoAccessToSelfHostedRunnerGroupInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsAddRepoAccessToSelfHostedRunnerGroupInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsAddRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
