package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.InteractionsSetRestrictionsForOrgEndpoint
import typings.octokitTypes.endpointsMod.InteractionsSetRestrictionsForOrgRequestOptions
import typings.octokitTypes.endpointsMod.InteractionsSetRestrictionsForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersInteractionsSetRestrictionsForOrgEndpoint extends StObject {
  
  var parameters: InteractionsSetRestrictionsForOrgEndpoint
  
  var request: InteractionsSetRestrictionsForOrgRequestOptions
  
  var response: OctokitResponse[InteractionsSetRestrictionsForOrgResponseData]
}
object ParametersInteractionsSetRestrictionsForOrgEndpoint {
  
  inline def apply(
    parameters: InteractionsSetRestrictionsForOrgEndpoint,
    request: InteractionsSetRestrictionsForOrgRequestOptions,
    response: OctokitResponse[InteractionsSetRestrictionsForOrgResponseData]
  ): ParametersInteractionsSetRestrictionsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsSetRestrictionsForOrgEndpoint]
  }
  
  extension [Self <: ParametersInteractionsSetRestrictionsForOrgEndpoint](x: Self) {
    
    inline def setParameters(value: InteractionsSetRestrictionsForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: InteractionsSetRestrictionsForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[InteractionsSetRestrictionsForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
