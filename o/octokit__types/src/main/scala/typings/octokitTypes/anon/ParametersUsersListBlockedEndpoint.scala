package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListBlockedEndpoint
import typings.octokitTypes.endpointsMod.UsersListBlockedRequestOptions
import typings.octokitTypes.endpointsMod.UsersListBlockedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersListBlockedEndpoint extends js.Object {
  var parameters: UsersListBlockedEndpoint
  var request: UsersListBlockedRequestOptions
  var response: OctokitResponse[UsersListBlockedResponseData]
}

object ParametersUsersListBlockedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersListBlockedEndpoint,
    request: UsersListBlockedRequestOptions,
    response: OctokitResponse[UsersListBlockedResponseData]
  ): ParametersUsersListBlockedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListBlockedEndpoint]
  }
}

