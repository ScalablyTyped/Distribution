package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsCreateRemoveTokenForRepoEndpoint extends StObject {
  
  var parameters: ActionsCreateRemoveTokenForRepoEndpoint
  
  var request: ActionsCreateRemoveTokenForRepoRequestOptions
  
  var response: OctokitResponse[ActionsCreateRemoveTokenForRepoResponseData]
}
object ParametersActionsCreateRemoveTokenForRepoEndpoint {
  
  inline def apply(
    parameters: ActionsCreateRemoveTokenForRepoEndpoint,
    request: ActionsCreateRemoveTokenForRepoRequestOptions,
    response: OctokitResponse[ActionsCreateRemoveTokenForRepoResponseData]
  ): ParametersActionsCreateRemoveTokenForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateRemoveTokenForRepoEndpoint]
  }
  
  extension [Self <: ParametersActionsCreateRemoveTokenForRepoEndpoint](x: Self) {
    
    inline def setParameters(value: ActionsCreateRemoveTokenForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActionsCreateRemoveTokenForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ActionsCreateRemoveTokenForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
