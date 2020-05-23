package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListGpgKeysForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListGpgKeysForUserRequestOptions
import typings.octokitTypes.endpointsMod.UsersListGpgKeysForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersListGpgKeysForUserEndpoint extends js.Object {
  var parameters: UsersListGpgKeysForUserEndpoint
  var request: UsersListGpgKeysForUserRequestOptions
  var response: OctokitResponse[UsersListGpgKeysForUserResponseData]
}

object ParametersUsersListGpgKeysForUserEndpoint {
  @scala.inline
  def apply(
    parameters: UsersListGpgKeysForUserEndpoint,
    request: UsersListGpgKeysForUserRequestOptions,
    response: OctokitResponse[UsersListGpgKeysForUserResponseData]
  ): ParametersUsersListGpgKeysForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListGpgKeysForUserEndpoint]
  }
}

