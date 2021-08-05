package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.InteractionsGetRestrictionsForOrgEndpoint
import typings.octokitTypes.endpointsMod.InteractionsGetRestrictionsForOrgRequestOptions
import typings.octokitTypes.endpointsMod.InteractionsGetRestrictionsForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersInteractionsGetRestrictionsForOrgEndpoint extends StObject {
  
  var parameters: InteractionsGetRestrictionsForOrgEndpoint
  
  var request: InteractionsGetRestrictionsForOrgRequestOptions
  
  var response: OctokitResponse[InteractionsGetRestrictionsForOrgResponseData]
}
object ParametersInteractionsGetRestrictionsForOrgEndpoint {
  
  inline def apply(
    parameters: InteractionsGetRestrictionsForOrgEndpoint,
    request: InteractionsGetRestrictionsForOrgRequestOptions,
    response: OctokitResponse[InteractionsGetRestrictionsForOrgResponseData]
  ): ParametersInteractionsGetRestrictionsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsGetRestrictionsForOrgEndpoint]
  }
  
  extension [Self <: ParametersInteractionsGetRestrictionsForOrgEndpoint](x: Self) {
    
    inline def setParameters(value: InteractionsGetRestrictionsForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: InteractionsGetRestrictionsForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[InteractionsGetRestrictionsForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
