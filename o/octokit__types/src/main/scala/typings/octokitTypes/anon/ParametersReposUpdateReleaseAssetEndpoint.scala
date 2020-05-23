package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateReleaseAssetEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateReleaseAssetRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateReleaseAssetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposUpdateReleaseAssetEndpoint extends js.Object {
  var parameters: ReposUpdateReleaseAssetEndpoint
  var request: ReposUpdateReleaseAssetRequestOptions
  var response: OctokitResponse[ReposUpdateReleaseAssetResponseData]
}

object ParametersReposUpdateReleaseAssetEndpoint {
  @scala.inline
  def apply(
    parameters: ReposUpdateReleaseAssetEndpoint,
    request: ReposUpdateReleaseAssetRequestOptions,
    response: OctokitResponse[ReposUpdateReleaseAssetResponseData]
  ): ParametersReposUpdateReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateReleaseAssetEndpoint]
  }
}

