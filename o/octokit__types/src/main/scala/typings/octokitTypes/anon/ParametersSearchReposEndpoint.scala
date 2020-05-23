package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.SearchReposEndpoint
import typings.octokitTypes.endpointsMod.SearchReposRequestOptions
import typings.octokitTypes.endpointsMod.SearchReposResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersSearchReposEndpoint extends js.Object {
  var parameters: SearchReposEndpoint
  var request: SearchReposRequestOptions
  var response: OctokitResponse[SearchReposResponseData]
}

object ParametersSearchReposEndpoint {
  @scala.inline
  def apply(
    parameters: SearchReposEndpoint,
    request: SearchReposRequestOptions,
    response: OctokitResponse[SearchReposResponseData]
  ): ParametersSearchReposEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchReposEndpoint]
  }
}

