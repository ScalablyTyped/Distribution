package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetCombinedStatusForRefEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCombinedStatusForRefRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetCombinedStatusForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetCombinedStatusForRefEndpoint extends StObject {
  
  var parameters: ReposGetCombinedStatusForRefEndpoint
  
  var request: ReposGetCombinedStatusForRefRequestOptions
  
  var response: OctokitResponse[ReposGetCombinedStatusForRefResponseData]
}
object ParametersReposGetCombinedStatusForRefEndpoint {
  
  inline def apply(
    parameters: ReposGetCombinedStatusForRefEndpoint,
    request: ReposGetCombinedStatusForRefRequestOptions,
    response: OctokitResponse[ReposGetCombinedStatusForRefResponseData]
  ): ParametersReposGetCombinedStatusForRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCombinedStatusForRefEndpoint]
  }
  
  extension [Self <: ParametersReposGetCombinedStatusForRefEndpoint](x: Self) {
    
    inline def setParameters(value: ReposGetCombinedStatusForRefEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposGetCombinedStatusForRefRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetCombinedStatusForRefResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
