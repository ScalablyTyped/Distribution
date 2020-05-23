package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListFollowingForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowingForUserRequestOptions
import typings.octokitTypes.endpointsMod.UsersListFollowingForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersListFollowingForUserEndpoint extends js.Object {
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
}

