package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetContentEndpoint
import typings.octokitTypes.endpointsMod.ReposGetContentRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetContentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetContentEndpoint extends StObject {
  
  var parameters: ReposGetContentEndpoint
  
  var request: ReposGetContentRequestOptions
  
  var response: OctokitResponse[ReposGetContentResponseData]
}
object ParametersReposGetContentEndpoint {
  
  inline def apply(
    parameters: ReposGetContentEndpoint,
    request: ReposGetContentRequestOptions,
    response: OctokitResponse[ReposGetContentResponseData]
  ): ParametersReposGetContentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetContentEndpoint]
  }
  
  extension [Self <: ParametersReposGetContentEndpoint](x: Self) {
    
    inline def setParameters(value: ReposGetContentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposGetContentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetContentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
