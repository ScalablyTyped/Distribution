package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListFollowersForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowersForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.UsersListFollowersForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersListFollowersForAuthenticatedUserEndpoint extends js.Object {
  var parameters: UsersListFollowersForAuthenticatedUserEndpoint
  var request: UsersListFollowersForAuthenticatedUserRequestOptions
  var response: OctokitResponse[UsersListFollowersForAuthenticatedUserResponseData]
}

object ParametersUsersListFollowersForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: UsersListFollowersForAuthenticatedUserEndpoint,
    request: UsersListFollowersForAuthenticatedUserRequestOptions,
    response: OctokitResponse[UsersListFollowersForAuthenticatedUserResponseData]
  ): ParametersUsersListFollowersForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListFollowersForAuthenticatedUserEndpoint]
  }
}

