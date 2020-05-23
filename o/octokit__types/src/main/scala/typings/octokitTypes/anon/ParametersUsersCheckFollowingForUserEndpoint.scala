package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersCheckFollowingForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersCheckFollowingForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersCheckFollowingForUserEndpoint extends js.Object {
  var parameters: UsersCheckFollowingForUserEndpoint
  var request: UsersCheckFollowingForUserRequestOptions
  var response: OctokitResponse[_]
}

object ParametersUsersCheckFollowingForUserEndpoint {
  @scala.inline
  def apply(
    parameters: UsersCheckFollowingForUserEndpoint,
    request: UsersCheckFollowingForUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersUsersCheckFollowingForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersCheckFollowingForUserEndpoint]
  }
}

