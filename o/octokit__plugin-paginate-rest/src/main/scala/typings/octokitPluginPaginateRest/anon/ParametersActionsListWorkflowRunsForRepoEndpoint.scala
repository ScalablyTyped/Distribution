package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListWorkflowRunsForRepoEndpoint extends js.Object {
  var parameters: ActionsListWorkflowRunsForRepoEndpoint
  var response: OctokitResponse[ActionsListWorkflowRunsForRepoResponseData] with `5`
}

object ParametersActionsListWorkflowRunsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListWorkflowRunsForRepoEndpoint,
    response: OctokitResponse[ActionsListWorkflowRunsForRepoResponseData] with `5`
  ): ParametersActionsListWorkflowRunsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListWorkflowRunsForRepoEndpoint]
  }
}

