package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsAddSelfHostedRunnerToGroupForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsAddSelfHostedRunnerToGroupForOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsAddSelfHostedRunnerToGroupForOrgEndpoint extends StObject {
  
  var parameters: ActionsAddSelfHostedRunnerToGroupForOrgEndpoint = js.native
  
  var request: ActionsAddSelfHostedRunnerToGroupForOrgRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsAddSelfHostedRunnerToGroupForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsAddSelfHostedRunnerToGroupForOrgEndpoint,
    request: ActionsAddSelfHostedRunnerToGroupForOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsAddSelfHostedRunnerToGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsAddSelfHostedRunnerToGroupForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsAddSelfHostedRunnerToGroupForOrgEndpointMutableBuilder[Self <: ParametersActionsAddSelfHostedRunnerToGroupForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsAddSelfHostedRunnerToGroupForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsAddSelfHostedRunnerToGroupForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
