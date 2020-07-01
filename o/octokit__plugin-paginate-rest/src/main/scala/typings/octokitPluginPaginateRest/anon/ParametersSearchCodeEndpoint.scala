package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.SearchCodeEndpoint
import typings.octokitTypes.endpointsMod.SearchCodeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersSearchCodeEndpoint extends js.Object {
  var parameters: SearchCodeEndpoint
  var response: OctokitResponse[SearchCodeResponseData] with `13`
}

object ParametersSearchCodeEndpoint {
  @scala.inline
  def apply(parameters: SearchCodeEndpoint, response: OctokitResponse[SearchCodeResponseData] with `13`): ParametersSearchCodeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchCodeEndpoint]
  }
}

