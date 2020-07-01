package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsResponse201Data
import typings.octokitTypes.endpointsMod.ReposCreateOrUpdateFileContentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposCreateOrUpdateFileContentsEndpoint extends js.Object {
  var parameters: ReposCreateOrUpdateFileContentsEndpoint
  var request: ReposCreateOrUpdateFileContentsRequestOptions
  var response: OctokitResponse[
    ReposCreateOrUpdateFileContentsResponseData | ReposCreateOrUpdateFileContentsResponse201Data
  ]
}

object ParametersReposCreateOrUpdateFileContentsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCreateOrUpdateFileContentsEndpoint,
    request: ReposCreateOrUpdateFileContentsRequestOptions,
    response: OctokitResponse[
      ReposCreateOrUpdateFileContentsResponseData | ReposCreateOrUpdateFileContentsResponse201Data
    ]
  ): ParametersReposCreateOrUpdateFileContentsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateOrUpdateFileContentsEndpoint]
  }
}

