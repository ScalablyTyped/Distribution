package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.GistsListForUserEndpoint
import typings.octokitTypes.endpointsMod.GistsListForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersGistsListForUserEndpoint extends js.Object {
  var parameters: GistsListForUserEndpoint
  var response: OctokitResponse[GistsListForUserResponseData]
}

object ParametersGistsListForUserEndpoint {
  @scala.inline
  def apply(parameters: GistsListForUserEndpoint, response: OctokitResponse[GistsListForUserResponseData]): ParametersGistsListForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListForUserEndpoint]
  }
}

