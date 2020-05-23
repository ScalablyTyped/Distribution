package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDownloadWorkflowRunLogsEndpoint
import typings.octokitTypes.endpointsMod.ActionsDownloadWorkflowRunLogsRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsDownloadWorkflowRunLogsEndpoint extends js.Object {
  var parameters: ActionsDownloadWorkflowRunLogsEndpoint
  var request: ActionsDownloadWorkflowRunLogsRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActionsDownloadWorkflowRunLogsEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsDownloadWorkflowRunLogsEndpoint,
    request: ActionsDownloadWorkflowRunLogsRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDownloadWorkflowRunLogsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDownloadWorkflowRunLogsEndpoint]
  }
}

