package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.InteractionsRemoveRestrictionsForRepoEndpoint
import typings.octokitTypes.endpointsMod.InteractionsRemoveRestrictionsForRepoRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersInteractionsRemoveRestrictionsForRepoEndpoint extends StObject {
  
  var parameters: InteractionsRemoveRestrictionsForRepoEndpoint
  
  var request: InteractionsRemoveRestrictionsForRepoRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersInteractionsRemoveRestrictionsForRepoEndpoint {
  
  inline def apply(
    parameters: InteractionsRemoveRestrictionsForRepoEndpoint,
    request: InteractionsRemoveRestrictionsForRepoRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersInteractionsRemoveRestrictionsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsRemoveRestrictionsForRepoEndpoint]
  }
  
  extension [Self <: ParametersInteractionsRemoveRestrictionsForRepoEndpoint](x: Self) {
    
    inline def setParameters(value: InteractionsRemoveRestrictionsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: InteractionsRemoveRestrictionsForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
