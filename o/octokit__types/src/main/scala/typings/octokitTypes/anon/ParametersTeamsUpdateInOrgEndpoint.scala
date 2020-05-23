package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsUpdateInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsUpdateInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsUpdateInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsUpdateInOrgEndpoint extends js.Object {
  var parameters: TeamsUpdateInOrgEndpoint
  var request: TeamsUpdateInOrgRequestOptions
  var response: OctokitResponse[TeamsUpdateInOrgResponseData]
}

object ParametersTeamsUpdateInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsUpdateInOrgEndpoint,
    request: TeamsUpdateInOrgRequestOptions,
    response: OctokitResponse[TeamsUpdateInOrgResponseData]
  ): ParametersTeamsUpdateInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsUpdateInOrgEndpoint]
  }
}

