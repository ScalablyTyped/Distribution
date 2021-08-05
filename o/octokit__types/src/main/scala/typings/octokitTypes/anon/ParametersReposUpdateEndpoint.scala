package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposUpdateEndpoint extends StObject {
  
  var parameters: ReposUpdateEndpoint
  
  var request: ReposUpdateRequestOptions
  
  var response: OctokitResponse[ReposUpdateResponseData]
}
object ParametersReposUpdateEndpoint {
  
  inline def apply(
    parameters: ReposUpdateEndpoint,
    request: ReposUpdateRequestOptions,
    response: OctokitResponse[ReposUpdateResponseData]
  ): ParametersReposUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateEndpoint]
  }
  
  extension [Self <: ParametersReposUpdateEndpoint](x: Self) {
    
    inline def setParameters(value: ReposUpdateEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposUpdateRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposUpdateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
