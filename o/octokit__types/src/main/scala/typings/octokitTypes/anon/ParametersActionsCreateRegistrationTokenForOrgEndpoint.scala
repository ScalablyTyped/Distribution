package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsCreateRegistrationTokenForOrgEndpoint extends js.Object {
  var parameters: ActionsCreateRegistrationTokenForOrgEndpoint
  var request: ActionsCreateRegistrationTokenForOrgRequestOptions
  var response: OctokitResponse[ActionsCreateRegistrationTokenForOrgResponseData]
}

object ParametersActionsCreateRegistrationTokenForOrgEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsCreateRegistrationTokenForOrgEndpoint,
    request: ActionsCreateRegistrationTokenForOrgRequestOptions,
    response: OctokitResponse[ActionsCreateRegistrationTokenForOrgResponseData]
  ): ParametersActionsCreateRegistrationTokenForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateRegistrationTokenForOrgEndpoint]
  }
}

