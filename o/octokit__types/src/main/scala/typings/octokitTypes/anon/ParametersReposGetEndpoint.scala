package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetEndpoint
import typings.octokitTypes.endpointsMod.ReposGetRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetEndpoint extends js.Object {
  var parameters: ReposGetEndpoint
  var request: ReposGetRequestOptions
  var response: OctokitResponse[ReposGetResponseData]
}

object ParametersReposGetEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetEndpoint,
    request: ReposGetRequestOptions,
    response: OctokitResponse[ReposGetResponseData]
  ): ParametersReposGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetEndpoint]
  }
}

