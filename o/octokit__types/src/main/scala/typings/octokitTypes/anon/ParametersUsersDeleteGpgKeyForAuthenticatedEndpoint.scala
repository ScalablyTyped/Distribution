package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersDeleteGpgKeyForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersDeleteGpgKeyForAuthenticatedRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersDeleteGpgKeyForAuthenticatedEndpoint extends js.Object {
  var parameters: UsersDeleteGpgKeyForAuthenticatedEndpoint
  var request: UsersDeleteGpgKeyForAuthenticatedRequestOptions
  var response: OctokitResponse[_]
}

object ParametersUsersDeleteGpgKeyForAuthenticatedEndpoint {
  @scala.inline
  def apply(
    parameters: UsersDeleteGpgKeyForAuthenticatedEndpoint,
    request: UsersDeleteGpgKeyForAuthenticatedRequestOptions,
    response: OctokitResponse[_]
  ): ParametersUsersDeleteGpgKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersDeleteGpgKeyForAuthenticatedEndpoint]
  }
}

