package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersListPublicEmailsEndpoint
import typings.octokitTypes.endpointsMod.UsersListPublicEmailsRequestOptions
import typings.octokitTypes.endpointsMod.UsersListPublicEmailsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersListPublicEmailsEndpoint extends js.Object {
  var parameters: UsersListPublicEmailsEndpoint
  var request: UsersListPublicEmailsRequestOptions
  var response: OctokitResponse[UsersListPublicEmailsResponseData]
}

object ParametersUsersListPublicEmailsEndpoint {
  @scala.inline
  def apply(
    parameters: UsersListPublicEmailsEndpoint,
    request: UsersListPublicEmailsRequestOptions,
    response: OctokitResponse[UsersListPublicEmailsResponseData]
  ): ParametersUsersListPublicEmailsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListPublicEmailsEndpoint]
  }
}

