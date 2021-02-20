package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsGetSelfHostedRunnerForRepoEndpoint extends StObject {
  
  var parameters: ActionsGetSelfHostedRunnerForRepoEndpoint = js.native
  
  var request: ActionsGetSelfHostedRunnerForRepoRequestOptions = js.native
  
  var response: OctokitResponse[ActionsGetSelfHostedRunnerForRepoResponseData] = js.native
}
object ParametersActionsGetSelfHostedRunnerForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsGetSelfHostedRunnerForRepoEndpoint,
    request: ActionsGetSelfHostedRunnerForRepoRequestOptions,
    response: OctokitResponse[ActionsGetSelfHostedRunnerForRepoResponseData]
  ): ParametersActionsGetSelfHostedRunnerForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetSelfHostedRunnerForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsGetSelfHostedRunnerForRepoEndpointMutableBuilder[Self <: ParametersActionsGetSelfHostedRunnerForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsGetSelfHostedRunnerForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsGetSelfHostedRunnerForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetSelfHostedRunnerForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
