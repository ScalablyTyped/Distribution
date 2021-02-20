package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsRemoveSelfHostedRunnerFromGroupForOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint extends StObject {
  
  var parameters: ActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint = js.native
  
  var request: ActionsRemoveSelfHostedRunnerFromGroupForOrgRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint,
    request: ActionsRemoveSelfHostedRunnerFromGroupForOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsRemoveSelfHostedRunnerFromGroupForOrgEndpointMutableBuilder[Self <: ParametersActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsRemoveSelfHostedRunnerFromGroupForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
