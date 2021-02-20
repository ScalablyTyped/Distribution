package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerGroupForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerGroupForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerGroupForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsGetSelfHostedRunnerGroupForOrgEndpoint extends StObject {
  
  var parameters: ActionsGetSelfHostedRunnerGroupForOrgEndpoint = js.native
  
  var request: ActionsGetSelfHostedRunnerGroupForOrgRequestOptions = js.native
  
  var response: OctokitResponse[ActionsGetSelfHostedRunnerGroupForOrgResponseData] = js.native
}
object ParametersActionsGetSelfHostedRunnerGroupForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsGetSelfHostedRunnerGroupForOrgEndpoint,
    request: ActionsGetSelfHostedRunnerGroupForOrgRequestOptions,
    response: OctokitResponse[ActionsGetSelfHostedRunnerGroupForOrgResponseData]
  ): ParametersActionsGetSelfHostedRunnerGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetSelfHostedRunnerGroupForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsGetSelfHostedRunnerGroupForOrgEndpointMutableBuilder[Self <: ParametersActionsGetSelfHostedRunnerGroupForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsGetSelfHostedRunnerGroupForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsGetSelfHostedRunnerGroupForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetSelfHostedRunnerGroupForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
