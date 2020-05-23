package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersCreateGpgKeyEndpoint
import typings.octokitTypes.endpointsMod.UsersCreateGpgKeyRequestOptions
import typings.octokitTypes.endpointsMod.UsersCreateGpgKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersCreateGpgKeyEndpoint extends js.Object {
  var parameters: UsersCreateGpgKeyEndpoint
  var request: UsersCreateGpgKeyRequestOptions
  var response: OctokitResponse[UsersCreateGpgKeyResponseData]
}

object ParametersUsersCreateGpgKeyEndpoint {
  @scala.inline
  def apply(
    parameters: UsersCreateGpgKeyEndpoint,
    request: UsersCreateGpgKeyRequestOptions,
    response: OctokitResponse[UsersCreateGpgKeyResponseData]
  ): ParametersUsersCreateGpgKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersCreateGpgKeyEndpoint]
  }
}

