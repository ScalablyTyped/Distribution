package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetWorkflowEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsGetWorkflowEndpoint extends js.Object {
  var parameters: ActionsGetWorkflowEndpoint
  var request: ActionsGetWorkflowRequestOptions
  var response: OctokitResponse[ActionsGetWorkflowResponseData]
}

object ParametersActionsGetWorkflowEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsGetWorkflowEndpoint,
    request: ActionsGetWorkflowRequestOptions,
    response: OctokitResponse[ActionsGetWorkflowResponseData]
  ): ParametersActionsGetWorkflowEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetWorkflowEndpoint]
  }
}

