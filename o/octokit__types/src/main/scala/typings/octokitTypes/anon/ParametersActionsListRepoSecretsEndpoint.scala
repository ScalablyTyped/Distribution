package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListRepoSecretsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRepoSecretsRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListRepoSecretsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListRepoSecretsEndpoint extends js.Object {
  var parameters: ActionsListRepoSecretsEndpoint
  var request: ActionsListRepoSecretsRequestOptions
  var response: OctokitResponse[ActionsListRepoSecretsResponseData]
}

object ParametersActionsListRepoSecretsEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListRepoSecretsEndpoint,
    request: ActionsListRepoSecretsRequestOptions,
    response: OctokitResponse[ActionsListRepoSecretsResponseData]
  ): ParametersActionsListRepoSecretsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRepoSecretsEndpoint]
  }
}

