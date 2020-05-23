package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListSelfHostedRunnersForOrgEndpoint extends js.Object {
  var parameters: ActionsListSelfHostedRunnersForOrgEndpoint
  var request: ActionsListSelfHostedRunnersForOrgRequestOptions
  var response: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData]
}

object ParametersActionsListSelfHostedRunnersForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListSelfHostedRunnersForOrgEndpoint,
    request: ActionsListSelfHostedRunnersForOrgRequestOptions,
    response: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData]
  ): ParametersActionsListSelfHostedRunnersForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelfHostedRunnersForOrgEndpoint]
  }
}

