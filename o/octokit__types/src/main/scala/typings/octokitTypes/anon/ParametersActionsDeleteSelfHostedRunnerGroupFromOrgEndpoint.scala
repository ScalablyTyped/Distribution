package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDeleteSelfHostedRunnerGroupFromOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsDeleteSelfHostedRunnerGroupFromOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsDeleteSelfHostedRunnerGroupFromOrgEndpoint extends StObject {
  
  var parameters: ActionsDeleteSelfHostedRunnerGroupFromOrgEndpoint
  
  var request: ActionsDeleteSelfHostedRunnerGroupFromOrgRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsDeleteSelfHostedRunnerGroupFromOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsDeleteSelfHostedRunnerGroupFromOrgEndpoint,
    request: ActionsDeleteSelfHostedRunnerGroupFromOrgRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsDeleteSelfHostedRunnerGroupFromOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDeleteSelfHostedRunnerGroupFromOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsDeleteSelfHostedRunnerGroupFromOrgEndpointMutableBuilder[Self <: ParametersActionsDeleteSelfHostedRunnerGroupFromOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsDeleteSelfHostedRunnerGroupFromOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsDeleteSelfHostedRunnerGroupFromOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
