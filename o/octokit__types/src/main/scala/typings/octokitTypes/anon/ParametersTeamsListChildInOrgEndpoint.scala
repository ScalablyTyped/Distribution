package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListChildInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListChildInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListChildInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsListChildInOrgEndpoint extends js.Object {
  var parameters: TeamsListChildInOrgEndpoint
  var request: TeamsListChildInOrgRequestOptions
  var response: OctokitResponse[TeamsListChildInOrgResponseData]
}

object ParametersTeamsListChildInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListChildInOrgEndpoint,
    request: TeamsListChildInOrgRequestOptions,
    response: OctokitResponse[TeamsListChildInOrgResponseData]
  ): ParametersTeamsListChildInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListChildInOrgEndpoint]
  }
}

