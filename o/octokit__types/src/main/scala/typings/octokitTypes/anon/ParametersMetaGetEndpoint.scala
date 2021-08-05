package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MetaGetEndpoint
import typings.octokitTypes.endpointsMod.MetaGetRequestOptions
import typings.octokitTypes.endpointsMod.MetaGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersMetaGetEndpoint extends StObject {
  
  var parameters: MetaGetEndpoint
  
  var request: MetaGetRequestOptions
  
  var response: OctokitResponse[MetaGetResponseData]
}
object ParametersMetaGetEndpoint {
  
  inline def apply(
    parameters: MetaGetEndpoint,
    request: MetaGetRequestOptions,
    response: OctokitResponse[MetaGetResponseData]
  ): ParametersMetaGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMetaGetEndpoint]
  }
  
  extension [Self <: ParametersMetaGetEndpoint](x: Self) {
    
    inline def setParameters(value: MetaGetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: MetaGetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[MetaGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
