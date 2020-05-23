package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetLatestReleaseEndpoint
import typings.octokitTypes.endpointsMod.ReposGetLatestReleaseRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetLatestReleaseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetLatestReleaseEndpoint extends js.Object {
  var parameters: ReposGetLatestReleaseEndpoint
  var request: ReposGetLatestReleaseRequestOptions
  var response: OctokitResponse[ReposGetLatestReleaseResponseData]
}

object ParametersReposGetLatestReleaseEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetLatestReleaseEndpoint,
    request: ReposGetLatestReleaseRequestOptions,
    response: OctokitResponse[ReposGetLatestReleaseResponseData]
  ): ParametersReposGetLatestReleaseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetLatestReleaseEndpoint]
  }
}

