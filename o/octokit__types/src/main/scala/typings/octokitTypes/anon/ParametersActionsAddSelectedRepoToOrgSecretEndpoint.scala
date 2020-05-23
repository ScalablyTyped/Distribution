package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsAddSelectedRepoToOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsAddSelectedRepoToOrgSecretRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsAddSelectedRepoToOrgSecretEndpoint extends js.Object {
  var parameters: ActionsAddSelectedRepoToOrgSecretEndpoint
  var request: ActionsAddSelectedRepoToOrgSecretRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActionsAddSelectedRepoToOrgSecretEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsAddSelectedRepoToOrgSecretEndpoint,
    request: ActionsAddSelectedRepoToOrgSecretRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsAddSelectedRepoToOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsAddSelectedRepoToOrgSecretEndpoint]
  }
}

