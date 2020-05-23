package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersGetAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersGetAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersGetAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersGetAuthenticatedEndpoint extends js.Object {
  var parameters: UsersGetAuthenticatedEndpoint
  var request: UsersGetAuthenticatedRequestOptions
  var response: OctokitResponse[UsersGetAuthenticatedResponseData]
}

object ParametersUsersGetAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersGetAuthenticatedEndpoint,
    request: UsersGetAuthenticatedRequestOptions,
    response: OctokitResponse[UsersGetAuthenticatedResponseData]
  ): ParametersUsersGetAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersGetAuthenticatedEndpoint]
  }
}

