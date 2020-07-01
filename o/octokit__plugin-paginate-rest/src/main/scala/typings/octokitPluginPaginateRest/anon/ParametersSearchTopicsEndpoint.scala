package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.SearchTopicsEndpoint
import typings.octokitTypes.endpointsMod.SearchTopicsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersSearchTopicsEndpoint extends js.Object {
  var parameters: SearchTopicsEndpoint
  var response: OctokitResponse[SearchTopicsResponseData] with `18`
}

object ParametersSearchTopicsEndpoint {
  @scala.inline
  def apply(parameters: SearchTopicsEndpoint, response: OctokitResponse[SearchTopicsResponseData] with `18`): ParametersSearchTopicsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchTopicsEndpoint]
  }
}

