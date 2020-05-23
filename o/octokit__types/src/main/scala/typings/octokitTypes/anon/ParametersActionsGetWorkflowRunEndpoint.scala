package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowRunRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowRunResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsGetWorkflowRunEndpoint extends js.Object {
  var parameters: ActionsGetWorkflowRunEndpoint
  var request: ActionsGetWorkflowRunRequestOptions
  var response: OctokitResponse[ActionsGetWorkflowRunResponseData]
}

object ParametersActionsGetWorkflowRunEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsGetWorkflowRunEndpoint,
    request: ActionsGetWorkflowRunRequestOptions,
    response: OctokitResponse[ActionsGetWorkflowRunResponseData]
  ): ParametersActionsGetWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetWorkflowRunEndpoint]
  }
}

