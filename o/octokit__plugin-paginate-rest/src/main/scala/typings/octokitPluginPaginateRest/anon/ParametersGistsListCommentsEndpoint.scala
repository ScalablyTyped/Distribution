package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.GistsListCommentsEndpoint
import typings.octokitTypes.endpointsMod.GistsListCommentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGistsListCommentsEndpoint extends js.Object {
  var parameters: GistsListCommentsEndpoint
  var response: OctokitResponse[GistsListCommentsResponseData]
}

object ParametersGistsListCommentsEndpoint {
  @scala.inline
  def apply(parameters: GistsListCommentsEndpoint, response: OctokitResponse[GistsListCommentsResponseData]): ParametersGistsListCommentsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListCommentsEndpoint]
  }
}

