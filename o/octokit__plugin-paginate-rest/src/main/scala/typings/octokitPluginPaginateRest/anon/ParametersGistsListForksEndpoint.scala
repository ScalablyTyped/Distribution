package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.GistsListForksEndpoint
import typings.octokitTypes.endpointsMod.GistsListForksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGistsListForksEndpoint extends js.Object {
  var parameters: GistsListForksEndpoint
  var response: OctokitResponse[GistsListForksResponseData]
}

object ParametersGistsListForksEndpoint {
  @scala.inline
  def apply(parameters: GistsListForksEndpoint, response: OctokitResponse[GistsListForksResponseData]): ParametersGistsListForksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListForksEndpoint]
  }
}

