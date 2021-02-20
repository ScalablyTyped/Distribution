package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsGetSelfHostedRunnerForOrgEndpoint extends StObject {
  
  var parameters: ActionsGetSelfHostedRunnerForOrgEndpoint = js.native
  
  var request: ActionsGetSelfHostedRunnerForOrgRequestOptions = js.native
  
  var response: OctokitResponse[ActionsGetSelfHostedRunnerForOrgResponseData] = js.native
}
object ParametersActionsGetSelfHostedRunnerForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsGetSelfHostedRunnerForOrgEndpoint,
    request: ActionsGetSelfHostedRunnerForOrgRequestOptions,
    response: OctokitResponse[ActionsGetSelfHostedRunnerForOrgResponseData]
  ): ParametersActionsGetSelfHostedRunnerForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetSelfHostedRunnerForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsGetSelfHostedRunnerForOrgEndpointMutableBuilder[Self <: ParametersActionsGetSelfHostedRunnerForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsGetSelfHostedRunnerForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsGetSelfHostedRunnerForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetSelfHostedRunnerForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
