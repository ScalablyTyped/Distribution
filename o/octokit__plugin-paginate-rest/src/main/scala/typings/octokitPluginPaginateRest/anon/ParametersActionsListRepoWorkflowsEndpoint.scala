package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListRepoWorkflowsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRepoWorkflowsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListRepoWorkflowsEndpoint extends js.Object {
  var parameters: ActionsListRepoWorkflowsEndpoint
  var response: OctokitResponse[ActionsListRepoWorkflowsResponseData] with `8`
}

object ParametersActionsListRepoWorkflowsEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListRepoWorkflowsEndpoint,
    response: OctokitResponse[ActionsListRepoWorkflowsResponseData] with `8`
  ): ParametersActionsListRepoWorkflowsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRepoWorkflowsEndpoint]
  }
}

