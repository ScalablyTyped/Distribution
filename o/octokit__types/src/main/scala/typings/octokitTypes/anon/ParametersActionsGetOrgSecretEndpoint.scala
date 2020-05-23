package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetOrgSecretRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetOrgSecretResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsGetOrgSecretEndpoint extends js.Object {
  var parameters: ActionsGetOrgSecretEndpoint
  var request: ActionsGetOrgSecretRequestOptions
  var response: OctokitResponse[ActionsGetOrgSecretResponseData]
}

object ParametersActionsGetOrgSecretEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsGetOrgSecretEndpoint,
    request: ActionsGetOrgSecretRequestOptions,
    response: OctokitResponse[ActionsGetOrgSecretResponseData]
  ): ParametersActionsGetOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetOrgSecretEndpoint]
  }
}

