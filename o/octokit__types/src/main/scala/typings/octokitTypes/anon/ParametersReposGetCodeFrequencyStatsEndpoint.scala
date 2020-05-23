package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetCodeFrequencyStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCodeFrequencyStatsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetCodeFrequencyStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetCodeFrequencyStatsEndpoint extends js.Object {
  var parameters: ReposGetCodeFrequencyStatsEndpoint
  var request: ReposGetCodeFrequencyStatsRequestOptions
  var response: OctokitResponse[ReposGetCodeFrequencyStatsResponseData]
}

object ParametersReposGetCodeFrequencyStatsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetCodeFrequencyStatsEndpoint,
    request: ReposGetCodeFrequencyStatsRequestOptions,
    response: OctokitResponse[ReposGetCodeFrequencyStatsResponseData]
  ): ParametersReposGetCodeFrequencyStatsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCodeFrequencyStatsEndpoint]
  }
}

