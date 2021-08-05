package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.SearchCommitsEndpoint
import typings.octokitTypes.endpointsMod.SearchCommitsRequestOptions
import typings.octokitTypes.endpointsMod.SearchCommitsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersSearchCommitsEndpoint extends StObject {
  
  var parameters: SearchCommitsEndpoint
  
  var request: SearchCommitsRequestOptions
  
  var response: OctokitResponse[SearchCommitsResponseData]
}
object ParametersSearchCommitsEndpoint {
  
  inline def apply(
    parameters: SearchCommitsEndpoint,
    request: SearchCommitsRequestOptions,
    response: OctokitResponse[SearchCommitsResponseData]
  ): ParametersSearchCommitsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchCommitsEndpoint]
  }
  
  extension [Self <: ParametersSearchCommitsEndpoint](x: Self) {
    
    inline def setParameters(value: SearchCommitsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: SearchCommitsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[SearchCommitsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
