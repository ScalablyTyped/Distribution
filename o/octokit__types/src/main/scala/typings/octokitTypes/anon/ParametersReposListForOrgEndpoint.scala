package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListForOrgEndpoint
import typings.octokitTypes.endpointsMod.ReposListForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ReposListForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListForOrgEndpoint extends StObject {
  
  var parameters: ReposListForOrgEndpoint
  
  var request: ReposListForOrgRequestOptions
  
  var response: OctokitResponse[ReposListForOrgResponseData]
}
object ParametersReposListForOrgEndpoint {
  
  inline def apply(
    parameters: ReposListForOrgEndpoint,
    request: ReposListForOrgRequestOptions,
    response: OctokitResponse[ReposListForOrgResponseData]
  ): ParametersReposListForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListForOrgEndpoint]
  }
  
  extension [Self <: ParametersReposListForOrgEndpoint](x: Self) {
    
    inline def setParameters(value: ReposListForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposListForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
