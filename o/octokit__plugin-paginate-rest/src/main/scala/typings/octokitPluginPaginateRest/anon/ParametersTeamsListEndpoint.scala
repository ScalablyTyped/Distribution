package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListEndpoint
import typings.octokitTypes.endpointsMod.TeamsListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListEndpoint extends js.Object {
  var parameters: TeamsListEndpoint
  var response: OctokitResponse[TeamsListResponseData]
}

object ParametersTeamsListEndpoint {
  @scala.inline
  def apply(parameters: TeamsListEndpoint, response: OctokitResponse[TeamsListResponseData]): ParametersTeamsListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListEndpoint]
  }
}

