package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetCommitActivityStatsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCommitActivityStatsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetCommitActivityStatsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetCommitActivityStatsEndpoint extends js.Object {
  var parameters: ReposGetCommitActivityStatsEndpoint
  var request: ReposGetCommitActivityStatsRequestOptions
  var response: OctokitResponse[ReposGetCommitActivityStatsResponseData]
}

object ParametersReposGetCommitActivityStatsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetCommitActivityStatsEndpoint,
    request: ReposGetCommitActivityStatsRequestOptions,
    response: OctokitResponse[ReposGetCommitActivityStatsResponseData]
  ): ParametersReposGetCommitActivityStatsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCommitActivityStatsEndpoint]
  }
}

