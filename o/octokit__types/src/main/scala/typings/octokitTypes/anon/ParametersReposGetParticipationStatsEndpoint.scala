package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetParticipationStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetParticipationStatsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetParticipationStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetParticipationStatsEndpoint extends js.Object {
  var parameters: ReposGetParticipationStatsEndpoint
  var request: ReposGetParticipationStatsRequestOptions
  var response: OctokitResponse[ReposGetParticipationStatsResponseData]
}

object ParametersReposGetParticipationStatsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetParticipationStatsEndpoint,
    request: ReposGetParticipationStatsRequestOptions,
    response: OctokitResponse[ReposGetParticipationStatsResponseData]
  ): ParametersReposGetParticipationStatsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetParticipationStatsEndpoint]
  }
}

