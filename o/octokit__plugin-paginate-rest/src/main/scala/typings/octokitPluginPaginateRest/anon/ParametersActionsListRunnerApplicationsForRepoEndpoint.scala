package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListRunnerApplicationsForRepoEndpoint extends js.Object {
  var parameters: ActionsListRunnerApplicationsForRepoEndpoint
  var response: OctokitResponse[ActionsListRunnerApplicationsForRepoResponseData]
}

object ParametersActionsListRunnerApplicationsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListRunnerApplicationsForRepoEndpoint,
    response: OctokitResponse[ActionsListRunnerApplicationsForRepoResponseData]
  ): ParametersActionsListRunnerApplicationsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRunnerApplicationsForRepoEndpoint]
  }
}

