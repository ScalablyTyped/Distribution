package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsCreateOrUpdateOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateOrUpdateOrgSecretRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsCreateOrUpdateOrgSecretEndpoint extends js.Object {
  var parameters: ActionsCreateOrUpdateOrgSecretEndpoint
  var request: ActionsCreateOrUpdateOrgSecretRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActionsCreateOrUpdateOrgSecretEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsCreateOrUpdateOrgSecretEndpoint,
    request: ActionsCreateOrUpdateOrgSecretRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsCreateOrUpdateOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateOrUpdateOrgSecretEndpoint]
  }
}

