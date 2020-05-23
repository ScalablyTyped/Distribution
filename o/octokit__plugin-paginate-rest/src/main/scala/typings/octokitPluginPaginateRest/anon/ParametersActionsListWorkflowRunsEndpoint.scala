package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListWorkflowRunsEndpoint extends js.Object {
  var parameters: ActionsListWorkflowRunsEndpoint
  var response: OctokitResponse[ActionsListWorkflowRunsResponseData] with `3`
}

object ParametersActionsListWorkflowRunsEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListWorkflowRunsEndpoint,
    response: OctokitResponse[ActionsListWorkflowRunsResponseData] with `3`
  ): ParametersActionsListWorkflowRunsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListWorkflowRunsEndpoint]
  }
}

