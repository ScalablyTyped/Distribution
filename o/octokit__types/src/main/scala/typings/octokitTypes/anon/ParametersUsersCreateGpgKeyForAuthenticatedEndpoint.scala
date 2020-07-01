package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersCreateGpgKeyForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersCreateGpgKeyForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersCreateGpgKeyForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersCreateGpgKeyForAuthenticatedEndpoint extends js.Object {
  var parameters: UsersCreateGpgKeyForAuthenticatedEndpoint
  var request: UsersCreateGpgKeyForAuthenticatedRequestOptions
  var response: OctokitResponse[UsersCreateGpgKeyForAuthenticatedResponseData]
}

object ParametersUsersCreateGpgKeyForAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersCreateGpgKeyForAuthenticatedEndpoint,
    request: UsersCreateGpgKeyForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersCreateGpgKeyForAuthenticatedResponseData]
  ): ParametersUsersCreateGpgKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersCreateGpgKeyForAuthenticatedEndpoint]
  }
}

