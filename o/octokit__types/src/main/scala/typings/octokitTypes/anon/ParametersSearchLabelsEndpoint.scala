package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.SearchLabelsEndpoint
import typings.octokitTypes.endpointsMod.SearchLabelsRequestOptions
import typings.octokitTypes.endpointsMod.SearchLabelsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersSearchLabelsEndpoint extends js.Object {
  var parameters: SearchLabelsEndpoint
  var request: SearchLabelsRequestOptions
  var response: OctokitResponse[SearchLabelsResponseData]
}

object ParametersSearchLabelsEndpoint {
  @scala.inline
  def apply(
    parameters: SearchLabelsEndpoint,
    request: SearchLabelsRequestOptions,
    response: OctokitResponse[SearchLabelsResponseData]
  ): ParametersSearchLabelsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchLabelsEndpoint]
  }
}

