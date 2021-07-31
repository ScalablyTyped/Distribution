package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListFollowersForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowersForUserRequestOptions
import typings.octokitTypes.endpointsMod.UsersListFollowersForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersListFollowersForUserEndpoint extends StObject {
  
  var parameters: UsersListFollowersForUserEndpoint
  
  var request: UsersListFollowersForUserRequestOptions
  
  var response: OctokitResponse[UsersListFollowersForUserResponseData]
}
object ParametersUsersListFollowersForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersListFollowersForUserEndpoint,
    request: UsersListFollowersForUserRequestOptions,
    response: OctokitResponse[UsersListFollowersForUserResponseData]
  ): ParametersUsersListFollowersForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListFollowersForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersListFollowersForUserEndpointMutableBuilder[Self <: ParametersUsersListFollowersForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersListFollowersForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersListFollowersForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListFollowersForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
