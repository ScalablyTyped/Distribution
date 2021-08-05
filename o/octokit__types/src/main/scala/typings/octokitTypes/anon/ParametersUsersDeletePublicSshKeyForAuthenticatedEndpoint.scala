package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersDeletePublicSshKeyForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersDeletePublicSshKeyForAuthenticatedRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersDeletePublicSshKeyForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersDeletePublicSshKeyForAuthenticatedEndpoint
  
  var request: UsersDeletePublicSshKeyForAuthenticatedRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersUsersDeletePublicSshKeyForAuthenticatedEndpoint {
  
  inline def apply(
    parameters: UsersDeletePublicSshKeyForAuthenticatedEndpoint,
    request: UsersDeletePublicSshKeyForAuthenticatedRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersUsersDeletePublicSshKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersDeletePublicSshKeyForAuthenticatedEndpoint]
  }
  
  extension [Self <: ParametersUsersDeletePublicSshKeyForAuthenticatedEndpoint](x: Self) {
    
    inline def setParameters(value: UsersDeletePublicSshKeyForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: UsersDeletePublicSshKeyForAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
