package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListFollowingForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowingForUserRequestOptions
import typings.octokitTypes.endpointsMod.UsersListFollowingForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersListFollowingForUserEndpoint extends StObject {
  
  var parameters: UsersListFollowingForUserEndpoint
  
  var request: UsersListFollowingForUserRequestOptions
  
  var response: OctokitResponse[UsersListFollowingForUserResponseData]
}
object ParametersUsersListFollowingForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersListFollowingForUserEndpoint,
    request: UsersListFollowingForUserRequestOptions,
    response: OctokitResponse[UsersListFollowingForUserResponseData]
  ): ParametersUsersListFollowingForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListFollowingForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersListFollowingForUserEndpointMutableBuilder[Self <: ParametersUsersListFollowingForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersListFollowingForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersListFollowingForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListFollowingForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
