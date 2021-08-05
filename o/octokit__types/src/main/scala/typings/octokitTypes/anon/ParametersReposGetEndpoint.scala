package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetEndpoint
import typings.octokitTypes.endpointsMod.ReposGetRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetEndpoint extends StObject {
  
  var parameters: ReposGetEndpoint
  
  var request: ReposGetRequestOptions
  
  var response: OctokitResponse[ReposGetResponseData]
}
object ParametersReposGetEndpoint {
  
  inline def apply(
    parameters: ReposGetEndpoint,
    request: ReposGetRequestOptions,
    response: OctokitResponse[ReposGetResponseData]
  ): ParametersReposGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetEndpoint]
  }
  
  extension [Self <: ParametersReposGetEndpoint](x: Self) {
    
    inline def setParameters(value: ReposGetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposGetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
