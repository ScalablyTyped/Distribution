package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.InteractionsGetRestrictionsForRepoEndpoint
import typings.octokitTypes.endpointsMod.InteractionsGetRestrictionsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.InteractionsGetRestrictionsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersInteractionsGetRestrictionsForRepoEndpoint extends StObject {
  
  var parameters: InteractionsGetRestrictionsForRepoEndpoint
  
  var request: InteractionsGetRestrictionsForRepoRequestOptions
  
  var response: OctokitResponse[InteractionsGetRestrictionsForRepoResponseData]
}
object ParametersInteractionsGetRestrictionsForRepoEndpoint {
  
  inline def apply(
    parameters: InteractionsGetRestrictionsForRepoEndpoint,
    request: InteractionsGetRestrictionsForRepoRequestOptions,
    response: OctokitResponse[InteractionsGetRestrictionsForRepoResponseData]
  ): ParametersInteractionsGetRestrictionsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsGetRestrictionsForRepoEndpoint]
  }
  
  extension [Self <: ParametersInteractionsGetRestrictionsForRepoEndpoint](x: Self) {
    
    inline def setParameters(value: InteractionsGetRestrictionsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: InteractionsGetRestrictionsForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[InteractionsGetRestrictionsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
