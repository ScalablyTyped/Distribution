package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRetrieveCommunityProfileMetricsEndpoint
import typings.octokitTypes.endpointsMod.ReposRetrieveCommunityProfileMetricsRequestOptions
import typings.octokitTypes.endpointsMod.ReposRetrieveCommunityProfileMetricsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposRetrieveCommunityProfileMetricsEndpoint extends js.Object {
  var parameters: ReposRetrieveCommunityProfileMetricsEndpoint
  var request: ReposRetrieveCommunityProfileMetricsRequestOptions
  var response: OctokitResponse[ReposRetrieveCommunityProfileMetricsResponseData]
}

object ParametersReposRetrieveCommunityProfileMetricsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRetrieveCommunityProfileMetricsEndpoint,
    request: ReposRetrieveCommunityProfileMetricsRequestOptions,
    response: OctokitResponse[ReposRetrieveCommunityProfileMetricsResponseData]
  ): ParametersReposRetrieveCommunityProfileMetricsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRetrieveCommunityProfileMetricsEndpoint]
  }
}

