package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsCreateRegistrationTokenForRepoEndpoint extends js.Object {
  var parameters: ActionsCreateRegistrationTokenForRepoEndpoint
  var request: ActionsCreateRegistrationTokenForRepoRequestOptions
  var response: OctokitResponse[ActionsCreateRegistrationTokenForRepoResponseData]
}

object ParametersActionsCreateRegistrationTokenForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsCreateRegistrationTokenForRepoEndpoint,
    request: ActionsCreateRegistrationTokenForRepoRequestOptions,
    response: OctokitResponse[ActionsCreateRegistrationTokenForRepoResponseData]
  ): ParametersActionsCreateRegistrationTokenForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateRegistrationTokenForRepoEndpoint]
  }
}

