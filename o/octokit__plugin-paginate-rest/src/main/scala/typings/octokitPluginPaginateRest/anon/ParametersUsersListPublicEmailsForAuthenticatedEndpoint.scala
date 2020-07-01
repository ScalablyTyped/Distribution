package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.UsersListPublicEmailsForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListPublicEmailsForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersListPublicEmailsForAuthenticatedEndpoint extends js.Object {
  var parameters: UsersListPublicEmailsForAuthenticatedEndpoint
  var response: OctokitResponse[UsersListPublicEmailsForAuthenticatedResponseData]
}

object ParametersUsersListPublicEmailsForAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersListPublicEmailsForAuthenticatedEndpoint,
    response: OctokitResponse[UsersListPublicEmailsForAuthenticatedResponseData]
  ): ParametersUsersListPublicEmailsForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListPublicEmailsForAuthenticatedEndpoint]
  }
}

