package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersGetPublicKeyEndpoint
import typings.octokitTypes.endpointsMod.UsersGetPublicKeyRequestOptions
import typings.octokitTypes.endpointsMod.UsersGetPublicKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersGetPublicKeyEndpoint extends js.Object {
  var parameters: UsersGetPublicKeyEndpoint
  var request: UsersGetPublicKeyRequestOptions
  var response: OctokitResponse[UsersGetPublicKeyResponseData]
}

object ParametersUsersGetPublicKeyEndpoint {
  @scala.inline
  def apply(
    parameters: UsersGetPublicKeyEndpoint,
    request: UsersGetPublicKeyRequestOptions,
    response: OctokitResponse[UsersGetPublicKeyResponseData]
  ): ParametersUsersGetPublicKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersGetPublicKeyEndpoint]
  }
}

