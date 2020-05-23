package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListPublicKeysEndpoint
import typings.octokitTypes.endpointsMod.UsersListPublicKeysRequestOptions
import typings.octokitTypes.endpointsMod.UsersListPublicKeysResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersListPublicKeysEndpoint extends js.Object {
  var parameters: UsersListPublicKeysEndpoint
  var request: UsersListPublicKeysRequestOptions
  var response: OctokitResponse[UsersListPublicKeysResponseData]
}

object ParametersUsersListPublicKeysEndpoint {
  @scala.inline
  def apply(
    parameters: UsersListPublicKeysEndpoint,
    request: UsersListPublicKeysRequestOptions,
    response: OctokitResponse[UsersListPublicKeysResponseData]
  ): ParametersUsersListPublicKeysEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListPublicKeysEndpoint]
  }
}

