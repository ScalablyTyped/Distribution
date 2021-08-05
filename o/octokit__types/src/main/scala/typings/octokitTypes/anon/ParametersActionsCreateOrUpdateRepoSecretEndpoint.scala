package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsCreateOrUpdateRepoSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateOrUpdateRepoSecretRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsCreateOrUpdateRepoSecretEndpoint extends StObject {
  
  var parameters: ActionsCreateOrUpdateRepoSecretEndpoint
  
  var request: ActionsCreateOrUpdateRepoSecretRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsCreateOrUpdateRepoSecretEndpoint {
  
  inline def apply(
    parameters: ActionsCreateOrUpdateRepoSecretEndpoint,
    request: ActionsCreateOrUpdateRepoSecretRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsCreateOrUpdateRepoSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateOrUpdateRepoSecretEndpoint]
  }
  
  extension [Self <: ParametersActionsCreateOrUpdateRepoSecretEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsCreateOrUpdateRepoSecretEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsCreateOrUpdateRepoSecretRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
