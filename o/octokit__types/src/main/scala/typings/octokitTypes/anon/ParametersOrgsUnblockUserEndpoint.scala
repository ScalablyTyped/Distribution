package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsUnblockUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsUnblockUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsUnblockUserEndpoint extends StObject {
  
  var parameters: OrgsUnblockUserEndpoint
  
  var request: OrgsUnblockUserRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersOrgsUnblockUserEndpoint {
  
  inline def apply(
    parameters: OrgsUnblockUserEndpoint,
    request: OrgsUnblockUserRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersOrgsUnblockUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsUnblockUserEndpoint]
  }
  
  extension [Self <: ParametersOrgsUnblockUserEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsUnblockUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OrgsUnblockUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
