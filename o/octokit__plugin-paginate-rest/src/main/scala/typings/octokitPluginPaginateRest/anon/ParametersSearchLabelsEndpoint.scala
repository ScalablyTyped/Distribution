package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.SearchLabelsEndpoint
import typings.octokitTypes.endpointsMod.SearchLabelsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersSearchLabelsEndpoint extends js.Object {
  var parameters: SearchLabelsEndpoint
  var response: OctokitResponse[SearchLabelsResponseData] with `16`
}

object ParametersSearchLabelsEndpoint {
  @scala.inline
  def apply(parameters: SearchLabelsEndpoint, response: OctokitResponse[SearchLabelsResponseData] with `16`): ParametersSearchLabelsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchLabelsEndpoint]
  }
}

