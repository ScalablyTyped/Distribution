package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.UsersListFollowersForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowersForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersListFollowersForUserEndpoint extends StObject {
  
  var parameters: UsersListFollowersForUserEndpoint = js.native
  
  var response: OctokitResponse[UsersListFollowersForUserResponseData] = js.native
}
object ParametersUsersListFollowersForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersListFollowersForUserEndpoint,
    response: OctokitResponse[UsersListFollowersForUserResponseData]
  ): ParametersUsersListFollowersForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListFollowersForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersListFollowersForUserEndpointMutableBuilder[Self <: ParametersUsersListFollowersForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersListFollowersForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListFollowersForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
