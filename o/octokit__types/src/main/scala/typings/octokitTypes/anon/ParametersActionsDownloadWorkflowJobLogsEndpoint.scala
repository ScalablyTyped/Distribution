package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDownloadWorkflowJobLogsEndpoint
import typings.octokitTypes.endpointsMod.ActionsDownloadWorkflowJobLogsRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsDownloadWorkflowJobLogsEndpoint extends js.Object {
  var parameters: ActionsDownloadWorkflowJobLogsEndpoint
  var request: ActionsDownloadWorkflowJobLogsRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActionsDownloadWorkflowJobLogsEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsDownloadWorkflowJobLogsEndpoint,
    request: ActionsDownloadWorkflowJobLogsRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDownloadWorkflowJobLogsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDownloadWorkflowJobLogsEndpoint]
  }
}

