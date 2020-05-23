package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.UsersListFollowingForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowingForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersListFollowingForUserEndpoint extends js.Object {
  var parameters: UsersListFollowingForUserEndpoint
  var response: OctokitResponse[UsersListFollowingForUserResponseData]
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
}

