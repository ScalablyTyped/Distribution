package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.GistsListStarredEndpoint
import typings.octokitTypes.endpointsMod.GistsListStarredResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGistsListStarredEndpoint extends js.Object {
  var parameters: GistsListStarredEndpoint
  var response: OctokitResponse[GistsListStarredResponseData]
}

object ParametersGistsListStarredEndpoint {
  @scala.inline
  def apply(parameters: GistsListStarredEndpoint, response: OctokitResponse[GistsListStarredResponseData]): ParametersGistsListStarredEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListStarredEndpoint]
  }
}

