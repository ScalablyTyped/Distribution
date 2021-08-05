package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsUpdateEndpoint
import typings.octokitTypes.endpointsMod.OrgsUpdateRequestOptions
import typings.octokitTypes.endpointsMod.OrgsUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsUpdateEndpoint extends StObject {
  
  var parameters: OrgsUpdateEndpoint
  
  var request: OrgsUpdateRequestOptions
  
  var response: OctokitResponse[OrgsUpdateResponseData]
}
object ParametersOrgsUpdateEndpoint {
  
  inline def apply(
    parameters: OrgsUpdateEndpoint,
    request: OrgsUpdateRequestOptions,
    response: OctokitResponse[OrgsUpdateResponseData]
  ): ParametersOrgsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsUpdateEndpoint]
  }
  
  extension [Self <: ParametersOrgsUpdateEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsUpdateEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OrgsUpdateRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OrgsUpdateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
