package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetRepoSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetRepoSecretRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetRepoSecretResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsGetRepoSecretEndpoint extends StObject {
  
  var parameters: ActionsGetRepoSecretEndpoint
  
  var request: ActionsGetRepoSecretRequestOptions
  
  var response: OctokitResponse[ActionsGetRepoSecretResponseData]
}
object ParametersActionsGetRepoSecretEndpoint {
  
  inline def apply(
    parameters: ActionsGetRepoSecretEndpoint,
    request: ActionsGetRepoSecretRequestOptions,
    response: OctokitResponse[ActionsGetRepoSecretResponseData]
  ): ParametersActionsGetRepoSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetRepoSecretEndpoint]
  }
  
  extension [Self <: ParametersActionsGetRepoSecretEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsGetRepoSecretEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsGetRepoSecretRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsGetRepoSecretResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
