package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListOrgSecretsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListOrgSecretsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListOrgSecretsEndpoint extends StObject {
  
  var parameters: ActionsListOrgSecretsEndpoint
  
  var response: OctokitResponse[ActionsListOrgSecretsResponseData] & `4`
}
object ParametersActionsListOrgSecretsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListOrgSecretsEndpoint,
    response: OctokitResponse[ActionsListOrgSecretsResponseData] & `4`
  ): ParametersActionsListOrgSecretsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListOrgSecretsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListOrgSecretsEndpointMutableBuilder[Self <: ParametersActionsListOrgSecretsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListOrgSecretsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListOrgSecretsResponseData] & `4`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
