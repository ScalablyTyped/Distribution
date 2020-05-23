package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateReleaseEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateReleaseRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateReleaseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposCreateReleaseEndpoint extends js.Object {
  var parameters: ReposCreateReleaseEndpoint
  var request: ReposCreateReleaseRequestOptions
  var response: OctokitResponse[ReposCreateReleaseResponseData]
}

object ParametersReposCreateReleaseEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCreateReleaseEndpoint,
    request: ReposCreateReleaseRequestOptions,
    response: OctokitResponse[ReposCreateReleaseResponseData]
  ): ParametersReposCreateReleaseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateReleaseEndpoint]
  }
}

