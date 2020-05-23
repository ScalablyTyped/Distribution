package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDeleteWorkflowRunLogsEndpoint
import typings.octokitTypes.endpointsMod.ActionsDeleteWorkflowRunLogsRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsDeleteWorkflowRunLogsEndpoint extends js.Object {
  var parameters: ActionsDeleteWorkflowRunLogsEndpoint
  var request: ActionsDeleteWorkflowRunLogsRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActionsDeleteWorkflowRunLogsEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsDeleteWorkflowRunLogsEndpoint,
    request: ActionsDeleteWorkflowRunLogsRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDeleteWorkflowRunLogsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDeleteWorkflowRunLogsEndpoint]
  }
}

