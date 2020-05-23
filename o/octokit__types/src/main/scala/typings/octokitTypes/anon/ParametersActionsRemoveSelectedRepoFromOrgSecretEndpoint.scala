package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsRemoveSelectedRepoFromOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsRemoveSelectedRepoFromOrgSecretRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsRemoveSelectedRepoFromOrgSecretEndpoint extends js.Object {
  var parameters: ActionsRemoveSelectedRepoFromOrgSecretEndpoint
  var request: ActionsRemoveSelectedRepoFromOrgSecretRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActionsRemoveSelectedRepoFromOrgSecretEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsRemoveSelectedRepoFromOrgSecretEndpoint,
    request: ActionsRemoveSelectedRepoFromOrgSecretRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsRemoveSelectedRepoFromOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsRemoveSelectedRepoFromOrgSecretEndpoint]
  }
}

