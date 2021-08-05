package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsStarEndpoint
import typings.octokitTypes.endpointsMod.GistsStarRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGistsStarEndpoint extends StObject {
  
  var parameters: GistsStarEndpoint
  
  var request: GistsStarRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersGistsStarEndpoint {
  
  inline def apply(parameters: GistsStarEndpoint, request: GistsStarRequestOptions, response: OctokitResponse[js.Any]): ParametersGistsStarEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsStarEndpoint]
  }
  
  extension [Self <: ParametersGistsStarEndpoint](x: Self) {
    
    inline def setParameters(value: GistsStarEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: GistsStarRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
