package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetJobForWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetJobForWorkflowRunRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetJobForWorkflowRunResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsGetJobForWorkflowRunEndpoint extends js.Object {
  var parameters: ActionsGetJobForWorkflowRunEndpoint
  var request: ActionsGetJobForWorkflowRunRequestOptions
  var response: OctokitResponse[ActionsGetJobForWorkflowRunResponseData]
}

object ParametersActionsGetJobForWorkflowRunEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsGetJobForWorkflowRunEndpoint,
    request: ActionsGetJobForWorkflowRunRequestOptions,
    response: OctokitResponse[ActionsGetJobForWorkflowRunResponseData]
  ): ParametersActionsGetJobForWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetJobForWorkflowRunEndpoint]
  }
}

