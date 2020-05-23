package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersDeleteEmailsEndpoint
import typings.octokitTypes.endpointsMod.UsersDeleteEmailsRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersDeleteEmailsEndpoint extends js.Object {
  var parameters: UsersDeleteEmailsEndpoint
  var request: UsersDeleteEmailsRequestOptions
  var response: OctokitResponse[_]
}

object ParametersUsersDeleteEmailsEndpoint {
  @scala.inline
  def apply(
    parameters: UsersDeleteEmailsEndpoint,
    request: UsersDeleteEmailsRequestOptions,
    response: OctokitResponse[_]
  ): ParametersUsersDeleteEmailsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersDeleteEmailsEndpoint]
  }
}

