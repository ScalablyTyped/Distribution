package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetContributorsStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetContributorsStatsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetContributorsStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetContributorsStatsEndpoint extends js.Object {
  var parameters: ReposGetContributorsStatsEndpoint
  var request: ReposGetContributorsStatsRequestOptions
  var response: OctokitResponse[ReposGetContributorsStatsResponseData]
}

object ParametersReposGetContributorsStatsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetContributorsStatsEndpoint,
    request: ReposGetContributorsStatsRequestOptions,
    response: OctokitResponse[ReposGetContributorsStatsResponseData]
  ): ParametersReposGetContributorsStatsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetContributorsStatsEndpoint]
  }
}

