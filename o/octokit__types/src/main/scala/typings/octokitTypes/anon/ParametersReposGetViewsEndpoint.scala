package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetViewsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetViewsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetViewsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetViewsEndpoint extends StObject {
  
  var parameters: ReposGetViewsEndpoint
  
  var request: ReposGetViewsRequestOptions
  
  var response: OctokitResponse[ReposGetViewsResponseData]
}
object ParametersReposGetViewsEndpoint {
  
  inline def apply(
    parameters: ReposGetViewsEndpoint,
    request: ReposGetViewsRequestOptions,
    response: OctokitResponse[ReposGetViewsResponseData]
  ): ParametersReposGetViewsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetViewsEndpoint]
  }
  
  extension [Self <: ParametersReposGetViewsEndpoint](x: Self) {
    
    inline def setParameters(value: ReposGetViewsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposGetViewsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetViewsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
