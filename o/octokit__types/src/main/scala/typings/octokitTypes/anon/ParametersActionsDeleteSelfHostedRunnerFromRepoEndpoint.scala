package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDeleteSelfHostedRunnerFromRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsDeleteSelfHostedRunnerFromRepoRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsDeleteSelfHostedRunnerFromRepoEndpoint extends StObject {
  
  var parameters: ActionsDeleteSelfHostedRunnerFromRepoEndpoint = js.native
  
  var request: ActionsDeleteSelfHostedRunnerFromRepoRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsDeleteSelfHostedRunnerFromRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsDeleteSelfHostedRunnerFromRepoEndpoint,
    request: ActionsDeleteSelfHostedRunnerFromRepoRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDeleteSelfHostedRunnerFromRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDeleteSelfHostedRunnerFromRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsDeleteSelfHostedRunnerFromRepoEndpointMutableBuilder[Self <: ParametersActionsDeleteSelfHostedRunnerFromRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsDeleteSelfHostedRunnerFromRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsDeleteSelfHostedRunnerFromRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
