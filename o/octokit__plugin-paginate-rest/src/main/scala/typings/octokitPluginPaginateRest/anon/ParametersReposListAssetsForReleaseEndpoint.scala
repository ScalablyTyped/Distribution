package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListAssetsForReleaseEndpoint
import typings.octokitTypes.endpointsMod.ReposListAssetsForReleaseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListAssetsForReleaseEndpoint extends js.Object {
  var parameters: ReposListAssetsForReleaseEndpoint
  var response: OctokitResponse[ReposListAssetsForReleaseResponseData]
}

object ParametersReposListAssetsForReleaseEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListAssetsForReleaseEndpoint,
    response: OctokitResponse[ReposListAssetsForReleaseResponseData]
  ): ParametersReposListAssetsForReleaseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListAssetsForReleaseEndpoint]
  }
}

