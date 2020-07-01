package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersGetGpgKeyForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersGetGpgKeyForAuthenticatedRequestOptions
import typings.octokitTypes.endpointsMod.UsersGetGpgKeyForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersGetGpgKeyForAuthenticatedEndpoint extends js.Object {
  var parameters: UsersGetGpgKeyForAuthenticatedEndpoint
  var request: UsersGetGpgKeyForAuthenticatedRequestOptions
  var response: OctokitResponse[UsersGetGpgKeyForAuthenticatedResponseData]
}

object ParametersUsersGetGpgKeyForAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersGetGpgKeyForAuthenticatedEndpoint,
    request: UsersGetGpgKeyForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersGetGpgKeyForAuthenticatedResponseData]
  ): ParametersUsersGetGpgKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersGetGpgKeyForAuthenticatedEndpoint]
  }
}

