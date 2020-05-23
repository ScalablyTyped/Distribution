package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.SearchTopicsEndpoint
import typings.octokitTypes.endpointsMod.SearchTopicsRequestOptions
import typings.octokitTypes.endpointsMod.SearchTopicsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersSearchTopicsEndpoint extends js.Object {
  var parameters: SearchTopicsEndpoint
  var request: SearchTopicsRequestOptions
  var response: OctokitResponse[SearchTopicsResponseData]
}

object ParametersSearchTopicsEndpoint {
  @scala.inline
  def apply(
    parameters: SearchTopicsEndpoint,
    request: SearchTopicsRequestOptions,
    response: OctokitResponse[SearchTopicsResponseData]
  ): ParametersSearchTopicsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchTopicsEndpoint]
  }
}

