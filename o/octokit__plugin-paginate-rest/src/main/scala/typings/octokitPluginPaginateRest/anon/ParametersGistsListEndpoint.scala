package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.GistsListEndpoint
import typings.octokitTypes.endpointsMod.GistsListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGistsListEndpoint extends js.Object {
  var parameters: GistsListEndpoint
  var response: OctokitResponse[GistsListResponseData]
}

object ParametersGistsListEndpoint {
  @scala.inline
  def apply(parameters: GistsListEndpoint, response: OctokitResponse[GistsListResponseData]): ParametersGistsListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListEndpoint]
  }
}

