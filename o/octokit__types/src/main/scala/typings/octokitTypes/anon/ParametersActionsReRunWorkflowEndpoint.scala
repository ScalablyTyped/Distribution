package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsReRunWorkflowEndpoint
import typings.octokitTypes.endpointsMod.ActionsReRunWorkflowRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsReRunWorkflowEndpoint extends js.Object {
  var parameters: ActionsReRunWorkflowEndpoint
  var request: ActionsReRunWorkflowRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActionsReRunWorkflowEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsReRunWorkflowEndpoint,
    request: ActionsReRunWorkflowRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsReRunWorkflowEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsReRunWorkflowEndpoint]
  }
}

