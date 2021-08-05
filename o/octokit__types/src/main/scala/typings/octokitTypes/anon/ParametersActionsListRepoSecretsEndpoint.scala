package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListRepoSecretsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRepoSecretsRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListRepoSecretsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsListRepoSecretsEndpoint extends StObject {
  
  var parameters: ActionsListRepoSecretsEndpoint
  
  var request: ActionsListRepoSecretsRequestOptions
  
  var response: OctokitResponse[ActionsListRepoSecretsResponseData]
}
object ParametersActionsListRepoSecretsEndpoint {
  
  inline def apply(
    parameters: ActionsListRepoSecretsEndpoint,
    request: ActionsListRepoSecretsRequestOptions,
    response: OctokitResponse[ActionsListRepoSecretsResponseData]
  ): ParametersActionsListRepoSecretsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRepoSecretsEndpoint]
  }
  
  extension [Self <: ParametersActionsListRepoSecretsEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsListRepoSecretsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsListRepoSecretsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsListRepoSecretsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
