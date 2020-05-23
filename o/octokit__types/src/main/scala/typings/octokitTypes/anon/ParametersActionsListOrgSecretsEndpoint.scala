package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsListOrgSecretsEndpoint
import typings.octokitTypes.endpointsMod.ActionsListOrgSecretsRequestOptions
import typings.octokitTypes.endpointsMod.ActionsListOrgSecretsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsListOrgSecretsEndpoint extends js.Object {
  var parameters: ActionsListOrgSecretsEndpoint
  var request: ActionsListOrgSecretsRequestOptions
  var response: OctokitResponse[ActionsListOrgSecretsResponseData]
}

object ParametersActionsListOrgSecretsEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListOrgSecretsEndpoint,
    request: ActionsListOrgSecretsRequestOptions,
    response: OctokitResponse[ActionsListOrgSecretsResponseData]
  ): ParametersActionsListOrgSecretsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListOrgSecretsEndpoint]
  }
}

