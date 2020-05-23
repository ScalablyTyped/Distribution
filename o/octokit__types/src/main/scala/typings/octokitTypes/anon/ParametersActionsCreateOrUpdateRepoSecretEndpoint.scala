package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsCreateOrUpdateRepoSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateOrUpdateRepoSecretRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsCreateOrUpdateRepoSecretEndpoint extends js.Object {
  var parameters: ActionsCreateOrUpdateRepoSecretEndpoint
  var request: ActionsCreateOrUpdateRepoSecretRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActionsCreateOrUpdateRepoSecretEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsCreateOrUpdateRepoSecretEndpoint,
    request: ActionsCreateOrUpdateRepoSecretRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsCreateOrUpdateRepoSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateOrUpdateRepoSecretEndpoint]
  }
}

