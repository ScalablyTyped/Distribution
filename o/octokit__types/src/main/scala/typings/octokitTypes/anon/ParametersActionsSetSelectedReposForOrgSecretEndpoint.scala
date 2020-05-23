package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsSetSelectedReposForOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsSetSelectedReposForOrgSecretRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsSetSelectedReposForOrgSecretEndpoint extends js.Object {
  var parameters: ActionsSetSelectedReposForOrgSecretEndpoint
  var request: ActionsSetSelectedReposForOrgSecretRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActionsSetSelectedReposForOrgSecretEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsSetSelectedReposForOrgSecretEndpoint,
    request: ActionsSetSelectedReposForOrgSecretRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsSetSelectedReposForOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsSetSelectedReposForOrgSecretEndpoint]
  }
}

