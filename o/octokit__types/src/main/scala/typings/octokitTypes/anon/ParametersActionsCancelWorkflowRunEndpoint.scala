package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsCancelWorkflowRunEndpoint
import typings.octokitTypes.endpointsMod.ActionsCancelWorkflowRunRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsCancelWorkflowRunEndpoint extends js.Object {
  var parameters: ActionsCancelWorkflowRunEndpoint
  var request: ActionsCancelWorkflowRunRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActionsCancelWorkflowRunEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsCancelWorkflowRunEndpoint,
    request: ActionsCancelWorkflowRunRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsCancelWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCancelWorkflowRunEndpoint]
  }
}

