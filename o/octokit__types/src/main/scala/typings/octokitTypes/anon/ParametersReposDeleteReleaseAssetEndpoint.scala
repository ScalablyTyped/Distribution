package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteReleaseAssetEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteReleaseAssetRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposDeleteReleaseAssetEndpoint extends js.Object {
  var parameters: ReposDeleteReleaseAssetEndpoint
  var request: ReposDeleteReleaseAssetRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposDeleteReleaseAssetEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeleteReleaseAssetEndpoint,
    request: ReposDeleteReleaseAssetRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteReleaseAssetEndpoint]
  }
}

