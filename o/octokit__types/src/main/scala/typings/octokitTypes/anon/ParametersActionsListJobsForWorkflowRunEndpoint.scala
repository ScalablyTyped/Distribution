package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListJobsForWorkflowRunEndpoint extends js.Object {
  var parameters: ActionsListJobsForWorkflowRunEndpoint
  var request: ActionsListJobsForWorkflowRunRequestOptions
  var response: OctokitResponse[ActionsListJobsForWorkflowRunResponseData]
}

object ParametersActionsListJobsForWorkflowRunEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListJobsForWorkflowRunEndpoint,
    request: ActionsListJobsForWorkflowRunRequestOptions,
    response: OctokitResponse[ActionsListJobsForWorkflowRunResponseData]
  ): ParametersActionsListJobsForWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListJobsForWorkflowRunEndpoint]
  }
}

