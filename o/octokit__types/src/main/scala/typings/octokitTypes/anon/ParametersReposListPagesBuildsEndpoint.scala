package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListPagesBuildsEndpoint
import typings.octokitTypes.endpointsMod.ReposListPagesBuildsRequestOptions
import typings.octokitTypes.endpointsMod.ReposListPagesBuildsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListPagesBuildsEndpoint extends js.Object {
  var parameters: ReposListPagesBuildsEndpoint
  var request: ReposListPagesBuildsRequestOptions
  var response: OctokitResponse[ReposListPagesBuildsResponseData]
}

object ParametersReposListPagesBuildsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListPagesBuildsEndpoint,
    request: ReposListPagesBuildsRequestOptions,
    response: OctokitResponse[ReposListPagesBuildsResponseData]
  ): ParametersReposListPagesBuildsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListPagesBuildsEndpoint]
  }
}

