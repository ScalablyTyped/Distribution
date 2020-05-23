package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListReleasesEndpoint
import typings.octokitTypes.endpointsMod.ReposListReleasesRequestOptions
import typings.octokitTypes.endpointsMod.ReposListReleasesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListReleasesEndpoint extends js.Object {
  var parameters: ReposListReleasesEndpoint
  var request: ReposListReleasesRequestOptions
  var response: OctokitResponse[ReposListReleasesResponseData]
}

object ParametersReposListReleasesEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListReleasesEndpoint,
    request: ReposListReleasesRequestOptions,
    response: OctokitResponse[ReposListReleasesResponseData]
  ): ParametersReposListReleasesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListReleasesEndpoint]
  }
}

