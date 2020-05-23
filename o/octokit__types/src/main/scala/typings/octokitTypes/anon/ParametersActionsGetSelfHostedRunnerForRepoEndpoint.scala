package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsGetSelfHostedRunnerForRepoEndpoint extends js.Object {
  var parameters: ActionsGetSelfHostedRunnerForRepoEndpoint
  var request: ActionsGetSelfHostedRunnerForRepoRequestOptions
  var response: OctokitResponse[ActionsGetSelfHostedRunnerForRepoResponseData]
}

object ParametersActionsGetSelfHostedRunnerForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsGetSelfHostedRunnerForRepoEndpoint,
    request: ActionsGetSelfHostedRunnerForRepoRequestOptions,
    response: OctokitResponse[ActionsGetSelfHostedRunnerForRepoResponseData]
  ): ParametersActionsGetSelfHostedRunnerForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetSelfHostedRunnerForRepoEndpoint]
  }
}

