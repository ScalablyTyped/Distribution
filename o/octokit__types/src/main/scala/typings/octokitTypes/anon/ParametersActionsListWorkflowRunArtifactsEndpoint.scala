package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunArtifactsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunArtifactsRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunArtifactsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListWorkflowRunArtifactsEndpoint extends js.Object {
  var parameters: ActionsListWorkflowRunArtifactsEndpoint
  var request: ActionsListWorkflowRunArtifactsRequestOptions
  var response: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData]
}

object ParametersActionsListWorkflowRunArtifactsEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListWorkflowRunArtifactsEndpoint,
    request: ActionsListWorkflowRunArtifactsRequestOptions,
    response: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData]
  ): ParametersActionsListWorkflowRunArtifactsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListWorkflowRunArtifactsEndpoint]
  }
}

