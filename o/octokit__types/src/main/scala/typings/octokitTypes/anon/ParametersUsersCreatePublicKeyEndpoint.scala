package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.UsersCreatePublicKeyEndpoint
import typings.octokitTypes.endpointsMod.UsersCreatePublicKeyRequestOptions
import typings.octokitTypes.endpointsMod.UsersCreatePublicKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersUsersCreatePublicKeyEndpoint extends js.Object {
  var parameters: UsersCreatePublicKeyEndpoint
  var request: UsersCreatePublicKeyRequestOptions
  var response: OctokitResponse[UsersCreatePublicKeyResponseData]
}

object ParametersUsersCreatePublicKeyEndpoint {
  @scala.inline
  def apply(
    parameters: UsersCreatePublicKeyEndpoint,
    request: UsersCreatePublicKeyRequestOptions,
    response: OctokitResponse[UsersCreatePublicKeyResponseData]
  ): ParametersUsersCreatePublicKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersCreatePublicKeyEndpoint]
  }
}

