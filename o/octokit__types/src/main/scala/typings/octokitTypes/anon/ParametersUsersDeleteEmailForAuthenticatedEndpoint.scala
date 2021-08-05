package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersDeleteEmailForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersDeleteEmailForAuthenticatedRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersDeleteEmailForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersDeleteEmailForAuthenticatedEndpoint
  
  var request: UsersDeleteEmailForAuthenticatedRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersUsersDeleteEmailForAuthenticatedEndpoint {
  
  inline def apply(
    parameters: UsersDeleteEmailForAuthenticatedEndpoint,
    request: UsersDeleteEmailForAuthenticatedRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersUsersDeleteEmailForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersDeleteEmailForAuthenticatedEndpoint]
  }
  
  extension [Self <: ParametersUsersDeleteEmailForAuthenticatedEndpoint](x: Self) {
    
    inline def setParameters(value: UsersDeleteEmailForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: UsersDeleteEmailForAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
