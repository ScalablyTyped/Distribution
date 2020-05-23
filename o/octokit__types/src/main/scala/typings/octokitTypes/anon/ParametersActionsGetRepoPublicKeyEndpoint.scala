package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetRepoPublicKeyEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetRepoPublicKeyRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetRepoPublicKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsGetRepoPublicKeyEndpoint extends js.Object {
  var parameters: ActionsGetRepoPublicKeyEndpoint
  var request: ActionsGetRepoPublicKeyRequestOptions
  var response: OctokitResponse[ActionsGetRepoPublicKeyResponseData]
}

object ParametersActionsGetRepoPublicKeyEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsGetRepoPublicKeyEndpoint,
    request: ActionsGetRepoPublicKeyRequestOptions,
    response: OctokitResponse[ActionsGetRepoPublicKeyResponseData]
  ): ParametersActionsGetRepoPublicKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetRepoPublicKeyEndpoint]
  }
}

