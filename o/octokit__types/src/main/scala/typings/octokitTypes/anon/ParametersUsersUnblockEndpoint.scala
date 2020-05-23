package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersUnblockEndpoint
import typings.octokitTypes.endpointsMod.UsersUnblockRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersUnblockEndpoint extends js.Object {
  var parameters: UsersUnblockEndpoint
  var request: UsersUnblockRequestOptions
  var response: OctokitResponse[_]
}

object ParametersUsersUnblockEndpoint {
  @scala.inline
  def apply(
    parameters: UsersUnblockEndpoint,
    request: UsersUnblockRequestOptions,
    response: OctokitResponse[_]
  ): ParametersUsersUnblockEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersUnblockEndpoint]
  }
}

