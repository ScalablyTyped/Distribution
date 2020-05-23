package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListSelfHostedRunnersForOrgEndpoint extends js.Object {
  var parameters: ActionsListSelfHostedRunnersForOrgEndpoint
  var response: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData] with DataArray
}

object ParametersActionsListSelfHostedRunnersForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListSelfHostedRunnersForOrgEndpoint,
    response: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData] with DataArray
  ): ParametersActionsListSelfHostedRunnersForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelfHostedRunnersForOrgEndpoint]
  }
}

