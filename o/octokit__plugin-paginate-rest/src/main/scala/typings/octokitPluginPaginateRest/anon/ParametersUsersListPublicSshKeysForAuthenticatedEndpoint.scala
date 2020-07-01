package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.UsersListPublicSshKeysForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListPublicSshKeysForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersListPublicSshKeysForAuthenticatedEndpoint extends js.Object {
  var parameters: UsersListPublicSshKeysForAuthenticatedEndpoint
  var response: OctokitResponse[UsersListPublicSshKeysForAuthenticatedResponseData]
}

object ParametersUsersListPublicSshKeysForAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersListPublicSshKeysForAuthenticatedEndpoint,
    response: OctokitResponse[UsersListPublicSshKeysForAuthenticatedResponseData]
  ): ParametersUsersListPublicSshKeysForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListPublicSshKeysForAuthenticatedEndpoint]
  }
}

