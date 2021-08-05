package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListBlockedByAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListBlockedByAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersListBlockedByAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersListBlockedByAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersListBlockedByAuthenticatedEndpoint
  
  var request: UsersListBlockedByAuthenticatedRequestOptions
  
  var response: OctokitResponse[UsersListBlockedByAuthenticatedResponseData]
}
object ParametersUsersListBlockedByAuthenticatedEndpoint {
  
  inline def apply(
    parameters: UsersListBlockedByAuthenticatedEndpoint,
    request: UsersListBlockedByAuthenticatedRequestOptions,
    response: OctokitResponse[UsersListBlockedByAuthenticatedResponseData]
  ): ParametersUsersListBlockedByAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListBlockedByAuthenticatedEndpoint]
  }
  
  extension [Self <: ParametersUsersListBlockedByAuthenticatedEndpoint](x: Self) {
    
    inline def setParameters(value: UsersListBlockedByAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: UsersListBlockedByAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[UsersListBlockedByAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
