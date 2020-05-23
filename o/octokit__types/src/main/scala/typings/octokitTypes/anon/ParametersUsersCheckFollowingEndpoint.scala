package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersCheckFollowingEndpoint
import typings.octokitTypes.endpointsMod.UsersCheckFollowingRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersCheckFollowingEndpoint extends js.Object {
  var parameters: UsersCheckFollowingEndpoint
  var request: UsersCheckFollowingRequestOptions
  var response: OctokitResponse[_]
}

object ParametersUsersCheckFollowingEndpoint {
  @scala.inline
  def apply(
    parameters: UsersCheckFollowingEndpoint,
    request: UsersCheckFollowingRequestOptions,
    response: OctokitResponse[_]
  ): ParametersUsersCheckFollowingEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersCheckFollowingEndpoint]
  }
}

