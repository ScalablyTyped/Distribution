package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetAllStatusCheckContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetAllStatusCheckContextsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetAllStatusCheckContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetAllStatusCheckContextsEndpoint extends StObject {
  
  var parameters: ReposGetAllStatusCheckContextsEndpoint
  
  var request: ReposGetAllStatusCheckContextsRequestOptions
  
  var response: OctokitResponse[ReposGetAllStatusCheckContextsResponseData]
}
object ParametersReposGetAllStatusCheckContextsEndpoint {
  
  inline def apply(
    parameters: ReposGetAllStatusCheckContextsEndpoint,
    request: ReposGetAllStatusCheckContextsRequestOptions,
    response: OctokitResponse[ReposGetAllStatusCheckContextsResponseData]
  ): ParametersReposGetAllStatusCheckContextsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetAllStatusCheckContextsEndpoint]
  }
  
  extension [Self <: ParametersReposGetAllStatusCheckContextsEndpoint](x: Self) {
    
    inline def setParameters(value: ReposGetAllStatusCheckContextsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposGetAllStatusCheckContextsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetAllStatusCheckContextsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
