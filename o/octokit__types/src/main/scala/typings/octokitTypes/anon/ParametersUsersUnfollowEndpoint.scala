package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersUnfollowEndpoint
import typings.octokitTypes.endpointsMod.UsersUnfollowRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersUnfollowEndpoint extends js.Object {
  var parameters: UsersUnfollowEndpoint
  var request: UsersUnfollowRequestOptions
  var response: OctokitResponse[_]
}

object ParametersUsersUnfollowEndpoint {
  @scala.inline
  def apply(
    parameters: UsersUnfollowEndpoint,
    request: UsersUnfollowRequestOptions,
    response: OctokitResponse[_]
  ): ParametersUsersUnfollowEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersUnfollowEndpoint]
  }
}

