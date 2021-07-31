package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListOrgSecretsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListOrgSecretsRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListOrgSecretsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListOrgSecretsEndpoint extends StObject {
  
  var parameters: ActionsListOrgSecretsEndpoint
  
  var request: ActionsListOrgSecretsRequestOptions
  
  var response: OctokitResponse[ActionsListOrgSecretsResponseData]
}
object ParametersActionsListOrgSecretsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListOrgSecretsEndpoint,
    request: ActionsListOrgSecretsRequestOptions,
    response: OctokitResponse[ActionsListOrgSecretsResponseData]
  ): ParametersActionsListOrgSecretsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListOrgSecretsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListOrgSecretsEndpointMutableBuilder[Self <: ParametersActionsListOrgSecretsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListOrgSecretsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsListOrgSecretsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListOrgSecretsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
