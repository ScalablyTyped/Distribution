package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListSelectedReposForOrgSecretEndpoint extends js.Object {
  var parameters: ActionsListSelectedReposForOrgSecretEndpoint
  var request: ActionsListSelectedReposForOrgSecretRequestOptions
  var response: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData]
}

object ParametersActionsListSelectedReposForOrgSecretEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListSelectedReposForOrgSecretEndpoint,
    request: ActionsListSelectedReposForOrgSecretRequestOptions,
    response: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData]
  ): ParametersActionsListSelectedReposForOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelectedReposForOrgSecretEndpoint]
  }
}

