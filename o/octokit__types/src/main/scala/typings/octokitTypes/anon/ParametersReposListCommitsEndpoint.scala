package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListCommitsEndpoint
import typings.octokitTypes.endpointsMod.ReposListCommitsRequestOptions
import typings.octokitTypes.endpointsMod.ReposListCommitsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListCommitsEndpoint extends js.Object {
  var parameters: ReposListCommitsEndpoint
  var request: ReposListCommitsRequestOptions
  var response: OctokitResponse[ReposListCommitsResponseData]
}

object ParametersReposListCommitsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListCommitsEndpoint,
    request: ReposListCommitsRequestOptions,
    response: OctokitResponse[ReposListCommitsResponseData]
  ): ParametersReposListCommitsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListCommitsEndpoint]
  }
}

