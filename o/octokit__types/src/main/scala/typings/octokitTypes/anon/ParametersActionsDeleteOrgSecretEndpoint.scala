package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDeleteOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsDeleteOrgSecretRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsDeleteOrgSecretEndpoint extends js.Object {
  var parameters: ActionsDeleteOrgSecretEndpoint
  var request: ActionsDeleteOrgSecretRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActionsDeleteOrgSecretEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsDeleteOrgSecretEndpoint,
    request: ActionsDeleteOrgSecretRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDeleteOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDeleteOrgSecretEndpoint]
  }
}

