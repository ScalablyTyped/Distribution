package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersUpdateAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersUpdateAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersUpdateAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersUpdateAuthenticatedEndpoint extends js.Object {
  var parameters: UsersUpdateAuthenticatedEndpoint
  var request: UsersUpdateAuthenticatedRequestOptions
  var response: OctokitResponse[UsersUpdateAuthenticatedResponseData]
}

object ParametersUsersUpdateAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersUpdateAuthenticatedEndpoint,
    request: UsersUpdateAuthenticatedRequestOptions,
    response: OctokitResponse[UsersUpdateAuthenticatedResponseData]
  ): ParametersUsersUpdateAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersUpdateAuthenticatedEndpoint]
  }
}

