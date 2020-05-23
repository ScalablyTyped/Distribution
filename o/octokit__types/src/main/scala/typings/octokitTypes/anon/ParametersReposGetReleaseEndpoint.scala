package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetReleaseEndpoint
import typings.octokitTypes.endpointsMod.ReposGetReleaseRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetReleaseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetReleaseEndpoint extends js.Object {
  var parameters: ReposGetReleaseEndpoint
  var request: ReposGetReleaseRequestOptions
  var response: OctokitResponse[ReposGetReleaseResponseData]
}

object ParametersReposGetReleaseEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetReleaseEndpoint,
    request: ReposGetReleaseRequestOptions,
    response: OctokitResponse[ReposGetReleaseResponseData]
  ): ParametersReposGetReleaseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetReleaseEndpoint]
  }
}

