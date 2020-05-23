package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersFollowEndpoint
import typings.octokitTypes.endpointsMod.UsersFollowRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersFollowEndpoint extends js.Object {
  var parameters: UsersFollowEndpoint
  var request: UsersFollowRequestOptions
  var response: OctokitResponse[_]
}

object ParametersUsersFollowEndpoint {
  @scala.inline
  def apply(parameters: UsersFollowEndpoint, request: UsersFollowRequestOptions, response: OctokitResponse[_]): ParametersUsersFollowEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersFollowEndpoint]
  }
}

