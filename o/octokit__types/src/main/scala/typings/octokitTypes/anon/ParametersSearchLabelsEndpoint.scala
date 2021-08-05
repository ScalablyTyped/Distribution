package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.SearchLabelsEndpoint
import typings.octokitTypes.endpointsMod.SearchLabelsRequestOptions
import typings.octokitTypes.endpointsMod.SearchLabelsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersSearchLabelsEndpoint extends StObject {
  
  var parameters: SearchLabelsEndpoint
  
  var request: SearchLabelsRequestOptions
  
  var response: OctokitResponse[SearchLabelsResponseData]
}
object ParametersSearchLabelsEndpoint {
  
  inline def apply(
    parameters: SearchLabelsEndpoint,
    request: SearchLabelsRequestOptions,
    response: OctokitResponse[SearchLabelsResponseData]
  ): ParametersSearchLabelsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchLabelsEndpoint]
  }
  
  extension [Self <: ParametersSearchLabelsEndpoint](x: Self) {
    
    inline def setParameters(value: SearchLabelsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: SearchLabelsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[SearchLabelsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
