package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersGetGpgKeyEndpoint
import typings.octokitTypes.endpointsMod.UsersGetGpgKeyRequestOptions
import typings.octokitTypes.endpointsMod.UsersGetGpgKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersGetGpgKeyEndpoint extends js.Object {
  var parameters: UsersGetGpgKeyEndpoint
  var request: UsersGetGpgKeyRequestOptions
  var response: OctokitResponse[UsersGetGpgKeyResponseData]
}

object ParametersUsersGetGpgKeyEndpoint {
  @scala.inline
  def apply(
    parameters: UsersGetGpgKeyEndpoint,
    request: UsersGetGpgKeyRequestOptions,
    response: OctokitResponse[UsersGetGpgKeyResponseData]
  ): ParametersUsersGetGpgKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersGetGpgKeyEndpoint]
  }
}

