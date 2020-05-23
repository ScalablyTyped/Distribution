package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetPunchCardStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetPunchCardStatsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetPunchCardStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetPunchCardStatsEndpoint extends js.Object {
  var parameters: ReposGetPunchCardStatsEndpoint
  var request: ReposGetPunchCardStatsRequestOptions
  var response: OctokitResponse[ReposGetPunchCardStatsResponseData]
}

object ParametersReposGetPunchCardStatsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetPunchCardStatsEndpoint,
    request: ReposGetPunchCardStatsRequestOptions,
    response: OctokitResponse[ReposGetPunchCardStatsResponseData]
  ): ParametersReposGetPunchCardStatsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetPunchCardStatsEndpoint]
  }
}

