package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersDeletePublicKeyEndpoint
import typings.octokitTypes.endpointsMod.UsersDeletePublicKeyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersDeletePublicKeyEndpoint extends js.Object {
  var parameters: UsersDeletePublicKeyEndpoint
  var request: UsersDeletePublicKeyRequestOptions
  var response: OctokitResponse[_]
}

object ParametersUsersDeletePublicKeyEndpoint {
  @scala.inline
  def apply(
    parameters: UsersDeletePublicKeyEndpoint,
    request: UsersDeletePublicKeyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersUsersDeletePublicKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersDeletePublicKeyEndpoint]
  }
}

