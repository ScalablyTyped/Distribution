package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListRepoSecretsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListRepoSecretsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListRepoSecretsEndpoint extends js.Object {
  var parameters: ActionsListRepoSecretsEndpoint
  var response: OctokitResponse[ActionsListRepoSecretsResponseData] with `7`
}

object ParametersActionsListRepoSecretsEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListRepoSecretsEndpoint,
    response: OctokitResponse[ActionsListRepoSecretsResponseData] with `7`
  ): ParametersActionsListRepoSecretsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRepoSecretsEndpoint]
  }
}

