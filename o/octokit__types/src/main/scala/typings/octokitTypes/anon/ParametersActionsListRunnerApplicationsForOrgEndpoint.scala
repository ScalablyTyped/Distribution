package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListRunnerApplicationsForOrgEndpoint extends js.Object {
  var parameters: ActionsListRunnerApplicationsForOrgEndpoint
  var request: ActionsListRunnerApplicationsForOrgRequestOptions
  var response: OctokitResponse[ActionsListRunnerApplicationsForOrgResponseData]
}

object ParametersActionsListRunnerApplicationsForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListRunnerApplicationsForOrgEndpoint,
    request: ActionsListRunnerApplicationsForOrgRequestOptions,
    response: OctokitResponse[ActionsListRunnerApplicationsForOrgResponseData]
  ): ParametersActionsListRunnerApplicationsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRunnerApplicationsForOrgEndpoint]
  }
}

