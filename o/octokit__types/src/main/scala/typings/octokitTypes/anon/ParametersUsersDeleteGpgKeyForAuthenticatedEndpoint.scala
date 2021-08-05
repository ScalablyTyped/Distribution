package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersDeleteGpgKeyForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersDeleteGpgKeyForAuthenticatedRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersDeleteGpgKeyForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersDeleteGpgKeyForAuthenticatedEndpoint
  
  var request: UsersDeleteGpgKeyForAuthenticatedRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersUsersDeleteGpgKeyForAuthenticatedEndpoint {
  
  inline def apply(
    parameters: UsersDeleteGpgKeyForAuthenticatedEndpoint,
    request: UsersDeleteGpgKeyForAuthenticatedRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersUsersDeleteGpgKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersDeleteGpgKeyForAuthenticatedEndpoint]
  }
  
  extension [Self <: ParametersUsersDeleteGpgKeyForAuthenticatedEndpoint](x: Self) {
    
    inline def setParameters(value: UsersDeleteGpgKeyForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: UsersDeleteGpgKeyForAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
