package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersDeleteEmailForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersDeleteEmailForAuthenticatedRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersDeleteEmailForAuthenticatedEndpoint extends js.Object {
  var parameters: UsersDeleteEmailForAuthenticatedEndpoint
  var request: UsersDeleteEmailForAuthenticatedRequestOptions
  var response: OctokitResponse[_]
}

object ParametersUsersDeleteEmailForAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersDeleteEmailForAuthenticatedEndpoint,
    request: UsersDeleteEmailForAuthenticatedRequestOptions,
    response: OctokitResponse[_]
  ): ParametersUsersDeleteEmailForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersDeleteEmailForAuthenticatedEndpoint]
  }
}

