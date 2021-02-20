package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.UsersListFollowersForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowersForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersListFollowersForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: UsersListFollowersForAuthenticatedUserEndpoint = js.native
  
  var response: OctokitResponse[UsersListFollowersForAuthenticatedUserResponseData] = js.native
}
object ParametersUsersListFollowersForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersListFollowersForAuthenticatedUserEndpoint,
    response: OctokitResponse[UsersListFollowersForAuthenticatedUserResponseData]
  ): ParametersUsersListFollowersForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListFollowersForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersListFollowersForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersUsersListFollowersForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersListFollowersForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListFollowersForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
