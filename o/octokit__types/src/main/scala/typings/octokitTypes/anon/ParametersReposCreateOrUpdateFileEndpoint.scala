package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileResponse201Data
import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposCreateOrUpdateFileEndpoint extends js.Object {
  var parameters: ReposCreateOrUpdateFileEndpoint
  var request: ReposCreateOrUpdateFileRequestOptions
  var response: OctokitResponse[ReposCreateOrUpdateFileResponseData | ReposCreateOrUpdateFileResponse201Data]
}

object ParametersReposCreateOrUpdateFileEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCreateOrUpdateFileEndpoint,
    request: ReposCreateOrUpdateFileRequestOptions,
    response: OctokitResponse[ReposCreateOrUpdateFileResponseData | ReposCreateOrUpdateFileResponse201Data]
  ): ParametersReposCreateOrUpdateFileEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateOrUpdateFileEndpoint]
  }
}

