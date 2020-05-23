package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetPagesEndpoint
import typings.octokitTypes.endpointsMod.ReposGetPagesRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetPagesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetPagesEndpoint extends js.Object {
  var parameters: ReposGetPagesEndpoint
  var request: ReposGetPagesRequestOptions
  var response: OctokitResponse[ReposGetPagesResponseData]
}

object ParametersReposGetPagesEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetPagesEndpoint,
    request: ReposGetPagesRequestOptions,
    response: OctokitResponse[ReposGetPagesResponseData]
  ): ParametersReposGetPagesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetPagesEndpoint]
  }
}

