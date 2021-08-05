package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteFileEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteFileRequestOptions
import typings.octokitTypes.endpointsMod.ReposDeleteFileResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposDeleteFileEndpoint extends StObject {
  
  var parameters: ReposDeleteFileEndpoint
  
  var request: ReposDeleteFileRequestOptions
  
  var response: OctokitResponse[ReposDeleteFileResponseData]
}
object ParametersReposDeleteFileEndpoint {
  
  inline def apply(
    parameters: ReposDeleteFileEndpoint,
    request: ReposDeleteFileRequestOptions,
    response: OctokitResponse[ReposDeleteFileResponseData]
  ): ParametersReposDeleteFileEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteFileEndpoint]
  }
  
  extension [Self <: ParametersReposDeleteFileEndpoint](x: Self) {
    
    inline def setParameters(value: ReposDeleteFileEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposDeleteFileRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposDeleteFileResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
