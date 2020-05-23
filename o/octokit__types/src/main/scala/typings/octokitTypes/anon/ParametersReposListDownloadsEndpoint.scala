package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListDownloadsEndpoint
import typings.octokitTypes.endpointsMod.ReposListDownloadsRequestOptions
import typings.octokitTypes.endpointsMod.ReposListDownloadsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListDownloadsEndpoint extends js.Object {
  var parameters: ReposListDownloadsEndpoint
  var request: ReposListDownloadsRequestOptions
  var response: OctokitResponse[ReposListDownloadsResponseData]
}

object ParametersReposListDownloadsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListDownloadsEndpoint,
    request: ReposListDownloadsRequestOptions,
    response: OctokitResponse[ReposListDownloadsResponseData]
  ): ParametersReposListDownloadsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListDownloadsEndpoint]
  }
}

