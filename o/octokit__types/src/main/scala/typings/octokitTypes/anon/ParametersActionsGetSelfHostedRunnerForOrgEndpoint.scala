package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsGetSelfHostedRunnerForOrgEndpoint extends js.Object {
  var parameters: ActionsGetSelfHostedRunnerForOrgEndpoint
  var request: ActionsGetSelfHostedRunnerForOrgRequestOptions
  var response: OctokitResponse[ActionsGetSelfHostedRunnerForOrgResponseData]
}

object ParametersActionsGetSelfHostedRunnerForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsGetSelfHostedRunnerForOrgEndpoint,
    request: ActionsGetSelfHostedRunnerForOrgRequestOptions,
    response: OctokitResponse[ActionsGetSelfHostedRunnerForOrgResponseData]
  ): ParametersActionsGetSelfHostedRunnerForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetSelfHostedRunnerForOrgEndpoint]
  }
}

