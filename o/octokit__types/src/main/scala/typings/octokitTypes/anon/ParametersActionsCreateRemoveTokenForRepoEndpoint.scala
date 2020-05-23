package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsCreateRemoveTokenForRepoEndpoint extends js.Object {
  var parameters: ActionsCreateRemoveTokenForRepoEndpoint
  var request: ActionsCreateRemoveTokenForRepoRequestOptions
  var response: OctokitResponse[ActionsCreateRemoveTokenForRepoResponseData]
}

object ParametersActionsCreateRemoveTokenForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsCreateRemoveTokenForRepoEndpoint,
    request: ActionsCreateRemoveTokenForRepoRequestOptions,
    response: OctokitResponse[ActionsCreateRemoveTokenForRepoResponseData]
  ): ParametersActionsCreateRemoveTokenForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateRemoveTokenForRepoEndpoint]
  }
}

