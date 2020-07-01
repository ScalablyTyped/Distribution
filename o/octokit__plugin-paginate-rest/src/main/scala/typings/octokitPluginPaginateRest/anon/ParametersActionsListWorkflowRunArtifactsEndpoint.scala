package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunArtifactsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListWorkflowRunArtifactsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListWorkflowRunArtifactsEndpoint extends js.Object {
  var parameters: ActionsListWorkflowRunArtifactsEndpoint
  var response: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData] with `4`
}

object ParametersActionsListWorkflowRunArtifactsEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListWorkflowRunArtifactsEndpoint,
    response: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData] with `4`
  ): ParametersActionsListWorkflowRunArtifactsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListWorkflowRunArtifactsEndpoint]
  }
}

