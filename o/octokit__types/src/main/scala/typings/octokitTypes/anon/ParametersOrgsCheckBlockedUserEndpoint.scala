package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsCheckBlockedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsCheckBlockedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsCheckBlockedUserEndpoint extends StObject {
  
  var parameters: OrgsCheckBlockedUserEndpoint
  
  var request: OrgsCheckBlockedUserRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersOrgsCheckBlockedUserEndpoint {
  
  inline def apply(
    parameters: OrgsCheckBlockedUserEndpoint,
    request: OrgsCheckBlockedUserRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersOrgsCheckBlockedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsCheckBlockedUserEndpoint]
  }
  
  extension [Self <: ParametersOrgsCheckBlockedUserEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsCheckBlockedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OrgsCheckBlockedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
