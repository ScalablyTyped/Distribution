package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListReleaseAssetsEndpoint
import typings.octokitTypes.endpointsMod.ReposListReleaseAssetsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListReleaseAssetsEndpoint extends js.Object {
  var parameters: ReposListReleaseAssetsEndpoint
  var response: OctokitResponse[ReposListReleaseAssetsResponseData]
}

object ParametersReposListReleaseAssetsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListReleaseAssetsEndpoint,
    response: OctokitResponse[ReposListReleaseAssetsResponseData]
  ): ParametersReposListReleaseAssetsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListReleaseAssetsEndpoint]
  }
}

