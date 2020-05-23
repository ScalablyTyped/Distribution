package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListDeployKeysEndpoint
import typings.octokitTypes.endpointsMod.ReposListDeployKeysResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListDeployKeysEndpoint extends js.Object {
  var parameters: ReposListDeployKeysEndpoint
  var response: OctokitResponse[ReposListDeployKeysResponseData]
}

object ParametersReposListDeployKeysEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListDeployKeysEndpoint,
    response: OctokitResponse[ReposListDeployKeysResponseData]
  ): ParametersReposListDeployKeysEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListDeployKeysEndpoint]
  }
}

