package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListFollowersForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowersForUserRequestOptions
import typings.octokitTypes.endpointsMod.UsersListFollowersForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersListFollowersForUserEndpoint extends js.Object {
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
}

