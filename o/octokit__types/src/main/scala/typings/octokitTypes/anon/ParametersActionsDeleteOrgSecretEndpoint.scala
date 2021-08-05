package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDeleteOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsDeleteOrgSecretRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsDeleteOrgSecretEndpoint extends StObject {
  
  var parameters: ActionsDeleteOrgSecretEndpoint
  
  var request: ActionsDeleteOrgSecretRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsDeleteOrgSecretEndpoint {
  
  inline def apply(
    parameters: ActionsDeleteOrgSecretEndpoint,
    request: ActionsDeleteOrgSecretRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsDeleteOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDeleteOrgSecretEndpoint]
  }
  
  extension [Self <: ParametersActionsDeleteOrgSecretEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsDeleteOrgSecretEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsDeleteOrgSecretRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
