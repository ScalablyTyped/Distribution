package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsCreateRemoveTokenForOrgEndpoint extends js.Object {
  var parameters: ActionsCreateRemoveTokenForOrgEndpoint
  var request: ActionsCreateRemoveTokenForOrgRequestOptions
  var response: OctokitResponse[ActionsCreateRemoveTokenForOrgResponseData]
}

object ParametersActionsCreateRemoveTokenForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsCreateRemoveTokenForOrgEndpoint,
    request: ActionsCreateRemoveTokenForOrgRequestOptions,
    response: OctokitResponse[ActionsCreateRemoveTokenForOrgResponseData]
  ): ParametersActionsCreateRemoveTokenForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateRemoveTokenForOrgEndpoint]
  }
}

