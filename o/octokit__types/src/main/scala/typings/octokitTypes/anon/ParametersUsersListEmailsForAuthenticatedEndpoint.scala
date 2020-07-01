package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListEmailsForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListEmailsForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersListEmailsForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersListEmailsForAuthenticatedEndpoint extends js.Object {
  var parameters: UsersListEmailsForAuthenticatedEndpoint
  var request: UsersListEmailsForAuthenticatedRequestOptions
  var response: OctokitResponse[UsersListEmailsForAuthenticatedResponseData]
}

object ParametersUsersListEmailsForAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersListEmailsForAuthenticatedEndpoint,
    request: UsersListEmailsForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersListEmailsForAuthenticatedResponseData]
  ): ParametersUsersListEmailsForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListEmailsForAuthenticatedEndpoint]
  }
}

