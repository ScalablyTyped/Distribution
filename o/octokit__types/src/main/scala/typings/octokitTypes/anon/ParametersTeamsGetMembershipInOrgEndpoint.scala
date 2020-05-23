package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetMembershipInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetMembershipInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetMembershipInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsGetMembershipInOrgEndpoint extends js.Object {
  var parameters: TeamsGetMembershipInOrgEndpoint
  var request: TeamsGetMembershipInOrgRequestOptions
  var response: OctokitResponse[TeamsGetMembershipInOrgResponseData]
}

object ParametersTeamsGetMembershipInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsGetMembershipInOrgEndpoint,
    request: TeamsGetMembershipInOrgRequestOptions,
    response: OctokitResponse[TeamsGetMembershipInOrgResponseData]
  ): ParametersTeamsGetMembershipInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetMembershipInOrgEndpoint]
  }
}

