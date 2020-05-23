package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.SearchCommitsEndpoint
import typings.octokitTypes.endpointsMod.SearchCommitsRequestOptions
import typings.octokitTypes.endpointsMod.SearchCommitsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersSearchCommitsEndpoint extends js.Object {
  var parameters: SearchCommitsEndpoint
  var request: SearchCommitsRequestOptions
  var response: OctokitResponse[SearchCommitsResponseData]
}

object ParametersSearchCommitsEndpoint {
  @scala.inline
  def apply(
    parameters: SearchCommitsEndpoint,
    request: SearchCommitsRequestOptions,
    response: OctokitResponse[SearchCommitsResponseData]
  ): ParametersSearchCommitsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchCommitsEndpoint]
  }
}

