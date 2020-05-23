package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.UsersListFollowedByAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowedByAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersListFollowedByAuthenticatedEndpoint extends js.Object {
  var parameters: UsersListFollowedByAuthenticatedEndpoint
  var response: OctokitResponse[UsersListFollowedByAuthenticatedResponseData]
}

object ParametersUsersListFollowedByAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersListFollowedByAuthenticatedEndpoint,
    response: OctokitResponse[UsersListFollowedByAuthenticatedResponseData]
  ): ParametersUsersListFollowedByAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListFollowedByAuthenticatedEndpoint]
  }
}

