package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.UsersListFollowingForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowingForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersListFollowingForUserEndpoint extends StObject {
  
  var parameters: UsersListFollowingForUserEndpoint = js.native
  
  var response: OctokitResponse[UsersListFollowingForUserResponseData] = js.native
}
object ParametersUsersListFollowingForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersListFollowingForUserEndpoint,
    response: OctokitResponse[UsersListFollowingForUserResponseData]
  ): ParametersUsersListFollowingForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListFollowingForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersListFollowingForUserEndpointMutableBuilder[Self <: ParametersUsersListFollowingForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersListFollowingForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListFollowingForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
