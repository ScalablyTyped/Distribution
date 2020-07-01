package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListSelectedReposForOrgSecretEndpoint extends js.Object {
  var parameters: ActionsListSelectedReposForOrgSecretEndpoint
  var response: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData] with `1`
}

object ParametersActionsListSelectedReposForOrgSecretEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListSelectedReposForOrgSecretEndpoint,
    response: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData] with `1`
  ): ParametersActionsListSelectedReposForOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelectedReposForOrgSecretEndpoint]
  }
}

