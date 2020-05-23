package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDeleteRepoSecretEndpoint
import typings.octokitTypes.endpointsMod.ActionsDeleteRepoSecretRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersActionsDeleteRepoSecretEndpoint extends js.Object {
  var parameters: ActionsDeleteRepoSecretEndpoint
  var request: ActionsDeleteRepoSecretRequestOptions
  var response: OctokitResponse[_]
}

object ParametersActionsDeleteRepoSecretEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsDeleteRepoSecretEndpoint,
    request: ActionsDeleteRepoSecretRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDeleteRepoSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDeleteRepoSecretEndpoint]
  }
}

