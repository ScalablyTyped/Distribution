package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.SearchCodeEndpoint
import typings.octokitTypes.endpointsMod.SearchCodeRequestOptions
import typings.octokitTypes.endpointsMod.SearchCodeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersSearchCodeEndpoint extends js.Object {
  var parameters: SearchCodeEndpoint
  var request: SearchCodeRequestOptions
  var response: OctokitResponse[SearchCodeResponseData]
}

object ParametersSearchCodeEndpoint {
  @scala.inline
  def apply(
    parameters: SearchCodeEndpoint,
    request: SearchCodeRequestOptions,
    response: OctokitResponse[SearchCodeResponseData]
  ): ParametersSearchCodeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchCodeEndpoint]
  }
}

