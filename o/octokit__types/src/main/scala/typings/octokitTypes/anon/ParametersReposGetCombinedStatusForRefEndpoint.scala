package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetCombinedStatusForRefEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCombinedStatusForRefRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetCombinedStatusForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetCombinedStatusForRefEndpoint extends js.Object {
  var parameters: ReposGetCombinedStatusForRefEndpoint
  var request: ReposGetCombinedStatusForRefRequestOptions
  var response: OctokitResponse[ReposGetCombinedStatusForRefResponseData]
}

object ParametersReposGetCombinedStatusForRefEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetCombinedStatusForRefEndpoint,
    request: ReposGetCombinedStatusForRefRequestOptions,
    response: OctokitResponse[ReposGetCombinedStatusForRefResponseData]
  ): ParametersReposGetCombinedStatusForRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCombinedStatusForRefEndpoint]
  }
}

