package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersDeleteGpgKeyEndpoint
import typings.octokitTypes.endpointsMod.UsersDeleteGpgKeyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersDeleteGpgKeyEndpoint extends js.Object {
  var parameters: UsersDeleteGpgKeyEndpoint
  var request: UsersDeleteGpgKeyRequestOptions
  var response: OctokitResponse[_]
}

object ParametersUsersDeleteGpgKeyEndpoint {
  @scala.inline
  def apply(
    parameters: UsersDeleteGpgKeyEndpoint,
    request: UsersDeleteGpgKeyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersUsersDeleteGpgKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersDeleteGpgKeyEndpoint]
  }
}

