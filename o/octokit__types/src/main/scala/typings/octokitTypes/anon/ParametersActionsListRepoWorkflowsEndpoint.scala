package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListRepoWorkflowsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRepoWorkflowsRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListRepoWorkflowsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListRepoWorkflowsEndpoint extends js.Object {
  var parameters: ActionsListRepoWorkflowsEndpoint
  var request: ActionsListRepoWorkflowsRequestOptions
  var response: OctokitResponse[ActionsListRepoWorkflowsResponseData]
}

object ParametersActionsListRepoWorkflowsEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListRepoWorkflowsEndpoint,
    request: ActionsListRepoWorkflowsRequestOptions,
    response: OctokitResponse[ActionsListRepoWorkflowsResponseData]
  ): ParametersActionsListRepoWorkflowsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRepoWorkflowsEndpoint]
  }
}

