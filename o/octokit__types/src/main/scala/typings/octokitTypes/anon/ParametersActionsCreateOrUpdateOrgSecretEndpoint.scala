package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsCreateOrUpdateOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateOrUpdateOrgSecretRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsCreateOrUpdateOrgSecretEndpoint extends StObject {
  
  var parameters: ActionsCreateOrUpdateOrgSecretEndpoint
  
  var request: ActionsCreateOrUpdateOrgSecretRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsCreateOrUpdateOrgSecretEndpoint {
  
  inline def apply(
    parameters: ActionsCreateOrUpdateOrgSecretEndpoint,
    request: ActionsCreateOrUpdateOrgSecretRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsCreateOrUpdateOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateOrUpdateOrgSecretEndpoint]
  }
  
  extension [Self <: ParametersActionsCreateOrUpdateOrgSecretEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsCreateOrUpdateOrgSecretEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsCreateOrUpdateOrgSecretRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
