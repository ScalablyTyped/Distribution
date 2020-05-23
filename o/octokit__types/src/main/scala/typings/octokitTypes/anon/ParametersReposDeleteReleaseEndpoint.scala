package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteReleaseEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteReleaseRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposDeleteReleaseEndpoint extends js.Object {
  var parameters: ReposDeleteReleaseEndpoint
  var request: ReposDeleteReleaseRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposDeleteReleaseEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeleteReleaseEndpoint,
    request: ReposDeleteReleaseRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteReleaseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteReleaseEndpoint]
  }
}

