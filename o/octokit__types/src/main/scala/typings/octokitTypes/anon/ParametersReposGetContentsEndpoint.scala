package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetContentsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetContentsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetContentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetContentsEndpoint extends js.Object {
  var parameters: ReposGetContentsEndpoint
  var request: ReposGetContentsRequestOptions
  var response: OctokitResponse[ReposGetContentsResponseData]
}

object ParametersReposGetContentsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetContentsEndpoint,
    request: ReposGetContentsRequestOptions,
    response: OctokitResponse[ReposGetContentsResponseData]
  ): ParametersReposGetContentsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetContentsEndpoint]
  }
}

