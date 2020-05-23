package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetWorkflowUsageEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowUsageRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowUsageResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsGetWorkflowUsageEndpoint extends js.Object {
  var parameters: ActionsGetWorkflowUsageEndpoint
  var request: ActionsGetWorkflowUsageRequestOptions
  var response: OctokitResponse[ActionsGetWorkflowUsageResponseData]
}

object ParametersActionsGetWorkflowUsageEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsGetWorkflowUsageEndpoint,
    request: ActionsGetWorkflowUsageRequestOptions,
    response: OctokitResponse[ActionsGetWorkflowUsageResponseData]
  ): ParametersActionsGetWorkflowUsageEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetWorkflowUsageEndpoint]
  }
}

