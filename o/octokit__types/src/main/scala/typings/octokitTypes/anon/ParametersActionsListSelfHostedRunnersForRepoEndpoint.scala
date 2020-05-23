package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListSelfHostedRunnersForRepoEndpoint extends js.Object {
  var parameters: ActionsListSelfHostedRunnersForRepoEndpoint
  var request: ActionsListSelfHostedRunnersForRepoRequestOptions
  var response: OctokitResponse[ActionsListSelfHostedRunnersForRepoResponseData]
}

object ParametersActionsListSelfHostedRunnersForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListSelfHostedRunnersForRepoEndpoint,
    request: ActionsListSelfHostedRunnersForRepoRequestOptions,
    response: OctokitResponse[ActionsListSelfHostedRunnersForRepoResponseData]
  ): ParametersActionsListSelfHostedRunnersForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelfHostedRunnersForRepoEndpoint]
  }
}

