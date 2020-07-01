package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersDeletePublicSshKeyForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersDeletePublicSshKeyForAuthenticatedRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersDeletePublicSshKeyForAuthenticatedEndpoint extends js.Object {
  var parameters: UsersDeletePublicSshKeyForAuthenticatedEndpoint
  var request: UsersDeletePublicSshKeyForAuthenticatedRequestOptions
  var response: OctokitResponse[_]
}

object ParametersUsersDeletePublicSshKeyForAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersDeletePublicSshKeyForAuthenticatedEndpoint,
    request: UsersDeletePublicSshKeyForAuthenticatedRequestOptions,
    response: OctokitResponse[_]
  ): ParametersUsersDeletePublicSshKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersDeletePublicSshKeyForAuthenticatedEndpoint]
  }
}

