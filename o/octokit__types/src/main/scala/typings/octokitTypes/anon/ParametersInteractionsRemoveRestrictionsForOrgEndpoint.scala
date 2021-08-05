package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.InteractionsRemoveRestrictionsForOrgEndpoint
import typings.octokitTypes.endpointsMod.InteractionsRemoveRestrictionsForOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersInteractionsRemoveRestrictionsForOrgEndpoint extends StObject {
  
  var parameters: InteractionsRemoveRestrictionsForOrgEndpoint
  
  var request: InteractionsRemoveRestrictionsForOrgRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersInteractionsRemoveRestrictionsForOrgEndpoint {
  
  inline def apply(
    parameters: InteractionsRemoveRestrictionsForOrgEndpoint,
    request: InteractionsRemoveRestrictionsForOrgRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersInteractionsRemoveRestrictionsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsRemoveRestrictionsForOrgEndpoint]
  }
  
  extension [Self <: ParametersInteractionsRemoveRestrictionsForOrgEndpoint](x: Self) {
    
    inline def setParameters(value: InteractionsRemoveRestrictionsForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: InteractionsRemoveRestrictionsForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
