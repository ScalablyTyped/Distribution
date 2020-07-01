package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListReleaseAssetsEndpoint
import typings.octokitTypes.endpointsMod.ReposListReleaseAssetsRequestOptions
import typings.octokitTypes.endpointsMod.ReposListReleaseAssetsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListReleaseAssetsEndpoint extends js.Object {
  var parameters: ReposListReleaseAssetsEndpoint
  var request: ReposListReleaseAssetsRequestOptions
  var response: OctokitResponse[ReposListReleaseAssetsResponseData]
}

object ParametersReposListReleaseAssetsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListReleaseAssetsEndpoint,
    request: ReposListReleaseAssetsRequestOptions,
    response: OctokitResponse[ReposListReleaseAssetsResponseData]
  ): ParametersReposListReleaseAssetsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListReleaseAssetsEndpoint]
  }
}

