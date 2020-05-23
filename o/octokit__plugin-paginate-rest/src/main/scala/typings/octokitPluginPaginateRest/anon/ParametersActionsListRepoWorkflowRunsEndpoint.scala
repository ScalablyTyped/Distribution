package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListRepoWorkflowRunsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRepoWorkflowRunsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListRepoWorkflowRunsEndpoint extends js.Object {
  var parameters: ActionsListRepoWorkflowRunsEndpoint
  var response: OctokitResponse[ActionsListRepoWorkflowRunsResponseData] with `3`
}

object ParametersActionsListRepoWorkflowRunsEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListRepoWorkflowRunsEndpoint,
    response: OctokitResponse[ActionsListRepoWorkflowRunsResponseData] with `3`
  ): ParametersActionsListRepoWorkflowRunsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRepoWorkflowRunsEndpoint]
  }
}

