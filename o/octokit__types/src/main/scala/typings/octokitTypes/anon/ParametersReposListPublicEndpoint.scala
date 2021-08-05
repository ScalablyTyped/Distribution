package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListPublicEndpoint
import typings.octokitTypes.endpointsMod.ReposListPublicRequestOptions
import typings.octokitTypes.endpointsMod.ReposListPublicResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListPublicEndpoint extends StObject {
  
  var parameters: ReposListPublicEndpoint
  
  var request: ReposListPublicRequestOptions
  
  var response: OctokitResponse[ReposListPublicResponseData]
}
object ParametersReposListPublicEndpoint {
  
  inline def apply(
    parameters: ReposListPublicEndpoint,
    request: ReposListPublicRequestOptions,
    response: OctokitResponse[ReposListPublicResponseData]
  ): ParametersReposListPublicEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListPublicEndpoint]
  }
  
  extension [Self <: ParametersReposListPublicEndpoint](x: Self) {
    
    inline def setParameters(value: ReposListPublicEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposListPublicRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListPublicResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
