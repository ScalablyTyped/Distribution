package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDeleteSelfHostedRunnerFromOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsDeleteSelfHostedRunnerFromOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsDeleteSelfHostedRunnerFromOrgEndpoint extends js.Object {
  var parameters: ActionsDeleteSelfHostedRunnerFromOrgEndpoint
  var request: ActionsDeleteSelfHostedRunnerFromOrgRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActionsDeleteSelfHostedRunnerFromOrgEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsDeleteSelfHostedRunnerFromOrgEndpoint,
    request: ActionsDeleteSelfHostedRunnerFromOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDeleteSelfHostedRunnerFromOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDeleteSelfHostedRunnerFromOrgEndpoint]
  }
}

