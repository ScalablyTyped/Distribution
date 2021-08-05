package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListSelectedReposForOrgSecretEndpoint extends StObject {
  
  var parameters: ActionsListSelectedReposForOrgSecretEndpoint
  
  var request: ActionsListSelectedReposForOrgSecretRequestOptions
  
  var response: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData]
}
object ParametersActionsListSelectedReposForOrgSecretEndpoint {
  
  inline def apply(
    parameters: ActionsListSelectedReposForOrgSecretEndpoint,
    request: ActionsListSelectedReposForOrgSecretRequestOptions,
    response: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData]
  ): ParametersActionsListSelectedReposForOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelectedReposForOrgSecretEndpoint]
  }
  
  extension [Self <: ParametersActionsListSelectedReposForOrgSecretEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsListSelectedReposForOrgSecretEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsListSelectedReposForOrgSecretRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
