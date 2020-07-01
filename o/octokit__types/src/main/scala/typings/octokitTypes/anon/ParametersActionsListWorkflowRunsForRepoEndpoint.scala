package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListWorkflowRunsForRepoEndpoint extends js.Object {
  var parameters: ActionsListWorkflowRunsForRepoEndpoint
  var request: ActionsListWorkflowRunsForRepoRequestOptions
  var response: OctokitResponse[ActionsListWorkflowRunsForRepoResponseData]
}

object ParametersActionsListWorkflowRunsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListWorkflowRunsForRepoEndpoint,
    request: ActionsListWorkflowRunsForRepoRequestOptions,
    response: OctokitResponse[ActionsListWorkflowRunsForRepoResponseData]
  ): ParametersActionsListWorkflowRunsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListWorkflowRunsForRepoEndpoint]
  }
}

