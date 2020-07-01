package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetContentEndpoint
import typings.octokitTypes.endpointsMod.ReposGetContentRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetContentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetContentEndpoint extends js.Object {
  var parameters: ReposGetContentEndpoint
  var request: ReposGetContentRequestOptions
  var response: OctokitResponse[ReposGetContentResponseData]
}

object ParametersReposGetContentEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetContentEndpoint,
    request: ReposGetContentRequestOptions,
    response: OctokitResponse[ReposGetContentResponseData]
  ): ParametersReposGetContentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetContentEndpoint]
  }
}

