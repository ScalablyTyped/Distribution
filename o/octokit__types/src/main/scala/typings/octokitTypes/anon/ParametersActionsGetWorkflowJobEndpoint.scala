package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetWorkflowJobEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowJobRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetWorkflowJobResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsGetWorkflowJobEndpoint extends js.Object {
  var parameters: ActionsGetWorkflowJobEndpoint
  var request: ActionsGetWorkflowJobRequestOptions
  var response: OctokitResponse[ActionsGetWorkflowJobResponseData]
}

object ParametersActionsGetWorkflowJobEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsGetWorkflowJobEndpoint,
    request: ActionsGetWorkflowJobRequestOptions,
    response: OctokitResponse[ActionsGetWorkflowJobResponseData]
  ): ParametersActionsGetWorkflowJobEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetWorkflowJobEndpoint]
  }
}

