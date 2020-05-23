package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetOrgPublicKeyEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetOrgPublicKeyRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetOrgPublicKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsGetOrgPublicKeyEndpoint extends js.Object {
  var parameters: ActionsGetOrgPublicKeyEndpoint
  var request: ActionsGetOrgPublicKeyRequestOptions
  var response: OctokitResponse[ActionsGetOrgPublicKeyResponseData]
}

object ParametersActionsGetOrgPublicKeyEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsGetOrgPublicKeyEndpoint,
    request: ActionsGetOrgPublicKeyRequestOptions,
    response: OctokitResponse[ActionsGetOrgPublicKeyResponseData]
  ): ParametersActionsGetOrgPublicKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetOrgPublicKeyEndpoint]
  }
}

