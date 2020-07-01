package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListGpgKeysForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListGpgKeysForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersListGpgKeysForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersListGpgKeysForAuthenticatedEndpoint extends js.Object {
  var parameters: UsersListGpgKeysForAuthenticatedEndpoint
  var request: UsersListGpgKeysForAuthenticatedRequestOptions
  var response: OctokitResponse[UsersListGpgKeysForAuthenticatedResponseData]
}

object ParametersUsersListGpgKeysForAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersListGpgKeysForAuthenticatedEndpoint,
    request: UsersListGpgKeysForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersListGpgKeysForAuthenticatedResponseData]
  ): ParametersUsersListGpgKeysForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListGpgKeysForAuthenticatedEndpoint]
  }
}

