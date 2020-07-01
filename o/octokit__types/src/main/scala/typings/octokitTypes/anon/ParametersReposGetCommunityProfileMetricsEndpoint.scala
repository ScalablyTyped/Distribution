package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetCommunityProfileMetricsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCommunityProfileMetricsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetCommunityProfileMetricsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetCommunityProfileMetricsEndpoint extends js.Object {
  var parameters: ReposGetCommunityProfileMetricsEndpoint
  var request: ReposGetCommunityProfileMetricsRequestOptions
  var response: OctokitResponse[ReposGetCommunityProfileMetricsResponseData]
}

object ParametersReposGetCommunityProfileMetricsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetCommunityProfileMetricsEndpoint,
    request: ReposGetCommunityProfileMetricsRequestOptions,
    response: OctokitResponse[ReposGetCommunityProfileMetricsResponseData]
  ): ParametersReposGetCommunityProfileMetricsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCommunityProfileMetricsEndpoint]
  }
}

