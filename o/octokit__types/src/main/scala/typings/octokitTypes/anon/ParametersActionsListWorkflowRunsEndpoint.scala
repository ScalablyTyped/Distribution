package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListWorkflowRunsEndpoint extends js.Object {
  var parameters: ActionsListWorkflowRunsEndpoint
  var request: ActionsListWorkflowRunsRequestOptions
  var response: OctokitResponse[ActionsListWorkflowRunsResponseData]
}

object ParametersActionsListWorkflowRunsEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListWorkflowRunsEndpoint,
    request: ActionsListWorkflowRunsRequestOptions,
    response: OctokitResponse[ActionsListWorkflowRunsResponseData]
  ): ParametersActionsListWorkflowRunsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListWorkflowRunsEndpoint]
  }
}

