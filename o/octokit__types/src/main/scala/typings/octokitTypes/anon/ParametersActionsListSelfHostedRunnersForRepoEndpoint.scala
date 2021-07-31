package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListSelfHostedRunnersForRepoEndpoint extends StObject {
  
  var parameters: ActionsListSelfHostedRunnersForRepoEndpoint
  
  var request: ActionsListSelfHostedRunnersForRepoRequestOptions
  
  var response: OctokitResponse[ActionsListSelfHostedRunnersForRepoResponseData]
}
object ParametersActionsListSelfHostedRunnersForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListSelfHostedRunnersForRepoEndpoint,
    request: ActionsListSelfHostedRunnersForRepoRequestOptions,
    response: OctokitResponse[ActionsListSelfHostedRunnersForRepoResponseData]
  ): ParametersActionsListSelfHostedRunnersForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelfHostedRunnersForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListSelfHostedRunnersForRepoEndpointMutableBuilder[Self <: ParametersActionsListSelfHostedRunnersForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListSelfHostedRunnersForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsListSelfHostedRunnersForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListSelfHostedRunnersForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
