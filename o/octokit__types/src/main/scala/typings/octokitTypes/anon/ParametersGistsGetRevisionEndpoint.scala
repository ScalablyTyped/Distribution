package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsGetRevisionEndpoint
import typings.octokitTypes.endpointsMod.GistsGetRevisionRequestOptions
import typings.octokitTypes.endpointsMod.GistsGetRevisionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGistsGetRevisionEndpoint extends StObject {
  
  var parameters: GistsGetRevisionEndpoint
  
  var request: GistsGetRevisionRequestOptions
  
  var response: OctokitResponse[GistsGetRevisionResponseData]
}
object ParametersGistsGetRevisionEndpoint {
  
  inline def apply(
    parameters: GistsGetRevisionEndpoint,
    request: GistsGetRevisionRequestOptions,
    response: OctokitResponse[GistsGetRevisionResponseData]
  ): ParametersGistsGetRevisionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsGetRevisionEndpoint]
  }
  
  extension [Self <: ParametersGistsGetRevisionEndpoint](x: Self) {
    
    inline def setParameters(value: GistsGetRevisionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: GistsGetRevisionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GistsGetRevisionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
