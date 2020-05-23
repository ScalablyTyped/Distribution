package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetReleaseAssetEndpoint
import typings.octokitTypes.endpointsMod.ReposGetReleaseAssetRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetReleaseAssetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetReleaseAssetEndpoint extends js.Object {
  var parameters: ReposGetReleaseAssetEndpoint
  var request: ReposGetReleaseAssetRequestOptions
  var response: OctokitResponse[ReposGetReleaseAssetResponseData]
}

object ParametersReposGetReleaseAssetEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetReleaseAssetEndpoint,
    request: ReposGetReleaseAssetRequestOptions,
    response: OctokitResponse[ReposGetReleaseAssetResponseData]
  ): ParametersReposGetReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetReleaseAssetEndpoint]
  }
}

