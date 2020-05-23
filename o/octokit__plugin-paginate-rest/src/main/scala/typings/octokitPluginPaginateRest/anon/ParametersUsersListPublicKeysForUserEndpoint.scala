package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.UsersListPublicKeysForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListPublicKeysForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersListPublicKeysForUserEndpoint extends js.Object {
  var parameters: UsersListPublicKeysForUserEndpoint
  var response: OctokitResponse[UsersListPublicKeysForUserResponseData]
}

object ParametersUsersListPublicKeysForUserEndpoint {
  @scala.inline
  def apply(
    parameters: UsersListPublicKeysForUserEndpoint,
    response: OctokitResponse[UsersListPublicKeysForUserResponseData]
  ): ParametersUsersListPublicKeysForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListPublicKeysForUserEndpoint]
  }
}

