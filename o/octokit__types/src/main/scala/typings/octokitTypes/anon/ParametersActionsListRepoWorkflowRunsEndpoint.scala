package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListRepoWorkflowRunsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRepoWorkflowRunsRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListRepoWorkflowRunsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListRepoWorkflowRunsEndpoint extends js.Object {
  var parameters: ActionsListRepoWorkflowRunsEndpoint
  var request: ActionsListRepoWorkflowRunsRequestOptions
  var response: OctokitResponse[ActionsListRepoWorkflowRunsResponseData]
}

object ParametersActionsListRepoWorkflowRunsEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListRepoWorkflowRunsEndpoint,
    request: ActionsListRepoWorkflowRunsRequestOptions,
    response: OctokitResponse[ActionsListRepoWorkflowRunsResponseData]
  ): ParametersActionsListRepoWorkflowRunsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRepoWorkflowRunsEndpoint]
  }
}

