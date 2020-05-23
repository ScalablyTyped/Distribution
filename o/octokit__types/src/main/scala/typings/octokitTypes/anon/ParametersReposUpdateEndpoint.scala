package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposUpdateEndpoint extends js.Object {
  var parameters: ReposUpdateEndpoint
  var request: ReposUpdateRequestOptions
  var response: OctokitResponse[ReposUpdateResponseData]
}

object ParametersReposUpdateEndpoint {
  @scala.inline
  def apply(
    parameters: ReposUpdateEndpoint,
    request: ReposUpdateRequestOptions,
    response: OctokitResponse[ReposUpdateResponseData]
  ): ParametersReposUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateEndpoint]
  }
}

