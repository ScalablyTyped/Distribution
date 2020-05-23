package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetWorkflowRunUsageEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowRunUsageRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowRunUsageResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsGetWorkflowRunUsageEndpoint extends js.Object {
  var parameters: ActionsGetWorkflowRunUsageEndpoint
  var request: ActionsGetWorkflowRunUsageRequestOptions
  var response: OctokitResponse[ActionsGetWorkflowRunUsageResponseData]
}

object ParametersActionsGetWorkflowRunUsageEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsGetWorkflowRunUsageEndpoint,
    request: ActionsGetWorkflowRunUsageRequestOptions,
    response: OctokitResponse[ActionsGetWorkflowRunUsageResponseData]
  ): ParametersActionsGetWorkflowRunUsageEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetWorkflowRunUsageEndpoint]
  }
}

