package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListJobsForWorkflowRunEndpoint extends js.Object {
  var parameters: ActionsListJobsForWorkflowRunEndpoint
  var response: OctokitResponse[ActionsListJobsForWorkflowRunResponseData] with `6`
}

object ParametersActionsListJobsForWorkflowRunEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListJobsForWorkflowRunEndpoint,
    response: OctokitResponse[ActionsListJobsForWorkflowRunResponseData] with `6`
  ): ParametersActionsListJobsForWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListJobsForWorkflowRunEndpoint]
  }
}

