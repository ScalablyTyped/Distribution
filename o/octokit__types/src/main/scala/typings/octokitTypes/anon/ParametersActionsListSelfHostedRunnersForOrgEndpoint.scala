package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListSelfHostedRunnersForOrgEndpoint extends StObject {
  
  var parameters: ActionsListSelfHostedRunnersForOrgEndpoint
  
  var request: ActionsListSelfHostedRunnersForOrgRequestOptions
  
  var response: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData]
}
object ParametersActionsListSelfHostedRunnersForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListSelfHostedRunnersForOrgEndpoint,
    request: ActionsListSelfHostedRunnersForOrgRequestOptions,
    response: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData]
  ): ParametersActionsListSelfHostedRunnersForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelfHostedRunnersForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListSelfHostedRunnersForOrgEndpointMutableBuilder[Self <: ParametersActionsListSelfHostedRunnersForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListSelfHostedRunnersForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsListSelfHostedRunnersForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
