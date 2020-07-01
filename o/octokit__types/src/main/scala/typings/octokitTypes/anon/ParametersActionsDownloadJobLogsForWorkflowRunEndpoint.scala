package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDownloadJobLogsForWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsDownloadJobLogsForWorkflowRunRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsDownloadJobLogsForWorkflowRunEndpoint extends js.Object {
  var parameters: ActionsDownloadJobLogsForWorkflowRunEndpoint
  var request: ActionsDownloadJobLogsForWorkflowRunRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActionsDownloadJobLogsForWorkflowRunEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsDownloadJobLogsForWorkflowRunEndpoint,
    request: ActionsDownloadJobLogsForWorkflowRunRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDownloadJobLogsForWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDownloadJobLogsForWorkflowRunEndpoint]
  }
}

