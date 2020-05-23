package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsGetRepoSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsGetRepoSecretRequestOptions
import typings.octokitTypes.endpointsMod.ActionsGetRepoSecretResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsGetRepoSecretEndpoint extends js.Object {
  var parameters: ActionsGetRepoSecretEndpoint
  var request: ActionsGetRepoSecretRequestOptions
  var response: OctokitResponse[ActionsGetRepoSecretResponseData]
}

object ParametersActionsGetRepoSecretEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsGetRepoSecretEndpoint,
    request: ActionsGetRepoSecretRequestOptions,
    response: OctokitResponse[ActionsGetRepoSecretResponseData]
  ): ParametersActionsGetRepoSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetRepoSecretEndpoint]
  }
}

