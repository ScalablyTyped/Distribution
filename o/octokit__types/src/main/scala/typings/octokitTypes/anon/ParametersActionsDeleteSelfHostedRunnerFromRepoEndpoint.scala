package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDeleteSelfHostedRunnerFromRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsDeleteSelfHostedRunnerFromRepoRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsDeleteSelfHostedRunnerFromRepoEndpoint extends js.Object {
  var parameters: ActionsDeleteSelfHostedRunnerFromRepoEndpoint
  var request: ActionsDeleteSelfHostedRunnerFromRepoRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActionsDeleteSelfHostedRunnerFromRepoEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsDeleteSelfHostedRunnerFromRepoEndpoint,
    request: ActionsDeleteSelfHostedRunnerFromRepoRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDeleteSelfHostedRunnerFromRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDeleteSelfHostedRunnerFromRepoEndpoint]
  }
}

