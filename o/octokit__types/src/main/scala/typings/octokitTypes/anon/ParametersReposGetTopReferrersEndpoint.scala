package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetTopReferrersEndpoint
import typings.octokitTypes.endpointsMod.ReposGetTopReferrersRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetTopReferrersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetTopReferrersEndpoint extends js.Object {
  var parameters: ReposGetTopReferrersEndpoint
  var request: ReposGetTopReferrersRequestOptions
  var response: OctokitResponse[ReposGetTopReferrersResponseData]
}

object ParametersReposGetTopReferrersEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetTopReferrersEndpoint,
    request: ReposGetTopReferrersRequestOptions,
    response: OctokitResponse[ReposGetTopReferrersResponseData]
  ): ParametersReposGetTopReferrersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetTopReferrersEndpoint]
  }
}

