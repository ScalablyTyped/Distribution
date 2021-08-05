package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsGetEndpoint
import typings.octokitTypes.endpointsMod.GistsGetRequestOptions
import typings.octokitTypes.endpointsMod.GistsGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGistsGetEndpoint extends StObject {
  
  var parameters: GistsGetEndpoint
  
  var request: GistsGetRequestOptions
  
  var response: OctokitResponse[GistsGetResponseData]
}
object ParametersGistsGetEndpoint {
  
  inline def apply(
    parameters: GistsGetEndpoint,
    request: GistsGetRequestOptions,
    response: OctokitResponse[GistsGetResponseData]
  ): ParametersGistsGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsGetEndpoint]
  }
  
  extension [Self <: ParametersGistsGetEndpoint](x: Self) {
    
    inline def setParameters(value: GistsGetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: GistsGetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GistsGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
