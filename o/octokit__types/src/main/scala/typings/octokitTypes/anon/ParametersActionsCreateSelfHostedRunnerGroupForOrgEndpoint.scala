package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsCreateSelfHostedRunnerGroupForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateSelfHostedRunnerGroupForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ActionsCreateSelfHostedRunnerGroupForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsCreateSelfHostedRunnerGroupForOrgEndpoint extends StObject {
  
  var parameters: ActionsCreateSelfHostedRunnerGroupForOrgEndpoint = js.native
  
  var request: ActionsCreateSelfHostedRunnerGroupForOrgRequestOptions = js.native
  
  var response: OctokitResponse[ActionsCreateSelfHostedRunnerGroupForOrgResponseData] = js.native
}
object ParametersActionsCreateSelfHostedRunnerGroupForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsCreateSelfHostedRunnerGroupForOrgEndpoint,
    request: ActionsCreateSelfHostedRunnerGroupForOrgRequestOptions,
    response: OctokitResponse[ActionsCreateSelfHostedRunnerGroupForOrgResponseData]
  ): ParametersActionsCreateSelfHostedRunnerGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateSelfHostedRunnerGroupForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsCreateSelfHostedRunnerGroupForOrgEndpointMutableBuilder[Self <: ParametersActionsCreateSelfHostedRunnerGroupForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsCreateSelfHostedRunnerGroupForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsCreateSelfHostedRunnerGroupForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsCreateSelfHostedRunnerGroupForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
