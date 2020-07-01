package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ActionsListOrgSecretsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListOrgSecretsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListOrgSecretsEndpoint extends js.Object {
  var parameters: ActionsListOrgSecretsEndpoint
  var response: OctokitResponse[ActionsListOrgSecretsResponseData] with `0`
}

object ParametersActionsListOrgSecretsEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListOrgSecretsEndpoint,
    response: OctokitResponse[ActionsListOrgSecretsResponseData] with `0`
  ): ParametersActionsListOrgSecretsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListOrgSecretsEndpoint]
  }
}

