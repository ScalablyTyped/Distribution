package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListRunnerApplicationsForRepoEndpoint extends js.Object {
  var parameters: ActionsListRunnerApplicationsForRepoEndpoint
  var request: ActionsListRunnerApplicationsForRepoRequestOptions
  var response: OctokitResponse[ActionsListRunnerApplicationsForRepoResponseData]
}

object ParametersActionsListRunnerApplicationsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListRunnerApplicationsForRepoEndpoint,
    request: ActionsListRunnerApplicationsForRepoRequestOptions,
    response: OctokitResponse[ActionsListRunnerApplicationsForRepoResponseData]
  ): ParametersActionsListRunnerApplicationsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRunnerApplicationsForRepoEndpoint]
  }
}

