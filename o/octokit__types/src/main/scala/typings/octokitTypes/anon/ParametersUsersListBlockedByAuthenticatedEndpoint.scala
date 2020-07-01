package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListBlockedByAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListBlockedByAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersListBlockedByAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersListBlockedByAuthenticatedEndpoint extends js.Object {
  var parameters: UsersListBlockedByAuthenticatedEndpoint
  var request: UsersListBlockedByAuthenticatedRequestOptions
  var response: OctokitResponse[UsersListBlockedByAuthenticatedResponseData]
}

object ParametersUsersListBlockedByAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersListBlockedByAuthenticatedEndpoint,
    request: UsersListBlockedByAuthenticatedRequestOptions,
    response: OctokitResponse[UsersListBlockedByAuthenticatedResponseData]
  ): ParametersUsersListBlockedByAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListBlockedByAuthenticatedEndpoint]
  }
}

