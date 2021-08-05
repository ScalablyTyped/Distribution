package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListFollowersForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowersForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.UsersListFollowersForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersListFollowersForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: UsersListFollowersForAuthenticatedUserEndpoint
  
  var request: UsersListFollowersForAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[UsersListFollowersForAuthenticatedUserResponseData]
}
object ParametersUsersListFollowersForAuthenticatedUserEndpoint {
  
  inline def apply(
    parameters: UsersListFollowersForAuthenticatedUserEndpoint,
    request: UsersListFollowersForAuthenticatedUserRequestOptions,
    response: OctokitResponse[UsersListFollowersForAuthenticatedUserResponseData]
  ): ParametersUsersListFollowersForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListFollowersForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: ParametersUsersListFollowersForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setParameters(value: UsersListFollowersForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: UsersListFollowersForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[UsersListFollowersForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
