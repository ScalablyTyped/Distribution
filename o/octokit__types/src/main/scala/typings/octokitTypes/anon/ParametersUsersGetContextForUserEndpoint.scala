package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersGetContextForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersGetContextForUserRequestOptions
import typings.octokitTypes.endpointsMod.UsersGetContextForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersGetContextForUserEndpoint extends js.Object {
  var parameters: UsersGetContextForUserEndpoint
  var request: UsersGetContextForUserRequestOptions
  var response: OctokitResponse[UsersGetContextForUserResponseData]
}

object ParametersUsersGetContextForUserEndpoint {
  @scala.inline
  def apply(
    parameters: UsersGetContextForUserEndpoint,
    request: UsersGetContextForUserRequestOptions,
    response: OctokitResponse[UsersGetContextForUserResponseData]
  ): ParametersUsersGetContextForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersGetContextForUserEndpoint]
  }
}

