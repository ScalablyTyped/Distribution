package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsSetSelectedReposForOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsSetSelectedReposForOrgSecretRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsSetSelectedReposForOrgSecretEndpoint extends StObject {
  
  var parameters: ActionsSetSelectedReposForOrgSecretEndpoint
  
  var request: ActionsSetSelectedReposForOrgSecretRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActionsSetSelectedReposForOrgSecretEndpoint {
  
  inline def apply(
    parameters: ActionsSetSelectedReposForOrgSecretEndpoint,
    request: ActionsSetSelectedReposForOrgSecretRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActionsSetSelectedReposForOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsSetSelectedReposForOrgSecretEndpoint]
  }
  
  extension [Self <: ParametersActionsSetSelectedReposForOrgSecretEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsSetSelectedReposForOrgSecretEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsSetSelectedReposForOrgSecretRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
