package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateReleaseEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateReleaseRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateReleaseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposUpdateReleaseEndpoint extends js.Object {
  var parameters: ReposUpdateReleaseEndpoint
  var request: ReposUpdateReleaseRequestOptions
  var response: OctokitResponse[ReposUpdateReleaseResponseData]
}

object ParametersReposUpdateReleaseEndpoint {
  @scala.inline
  def apply(
    parameters: ReposUpdateReleaseEndpoint,
    request: ReposUpdateReleaseRequestOptions,
    response: OctokitResponse[ReposUpdateReleaseResponseData]
  ): ParametersReposUpdateReleaseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateReleaseEndpoint]
  }
}

