package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCompareCommitsEndpoint
import typings.octokitTypes.endpointsMod.ReposCompareCommitsRequestOptions
import typings.octokitTypes.endpointsMod.ReposCompareCommitsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposCompareCommitsEndpoint extends js.Object {
  var parameters: ReposCompareCommitsEndpoint
  var request: ReposCompareCommitsRequestOptions
  var response: OctokitResponse[ReposCompareCommitsResponseData]
}

object ParametersReposCompareCommitsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCompareCommitsEndpoint,
    request: ReposCompareCommitsRequestOptions,
    response: OctokitResponse[ReposCompareCommitsResponseData]
  ): ParametersReposCompareCommitsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCompareCommitsEndpoint]
  }
}

