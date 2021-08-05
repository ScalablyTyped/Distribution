package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.SearchCodeEndpoint
import typings.octokitTypes.endpointsMod.SearchCodeRequestOptions
import typings.octokitTypes.endpointsMod.SearchCodeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersSearchCodeEndpoint extends StObject {
  
  var parameters: SearchCodeEndpoint
  
  var request: SearchCodeRequestOptions
  
  var response: OctokitResponse[SearchCodeResponseData]
}
object ParametersSearchCodeEndpoint {
  
  inline def apply(
    parameters: SearchCodeEndpoint,
    request: SearchCodeRequestOptions,
    response: OctokitResponse[SearchCodeResponseData]
  ): ParametersSearchCodeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchCodeEndpoint]
  }
  
  extension [Self <: ParametersSearchCodeEndpoint](x: Self) {
    
    inline def setParameters(value: SearchCodeEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: SearchCodeRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[SearchCodeResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
