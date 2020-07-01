package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsGetMembershipForUserInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetMembershipForUserInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsGetMembershipForUserInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsGetMembershipForUserInOrgEndpoint extends js.Object {
  var parameters: TeamsGetMembershipForUserInOrgEndpoint
  var request: TeamsGetMembershipForUserInOrgRequestOptions
  var response: OctokitResponse[TeamsGetMembershipForUserInOrgResponseData]
}

object ParametersTeamsGetMembershipForUserInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsGetMembershipForUserInOrgEndpoint,
    request: TeamsGetMembershipForUserInOrgRequestOptions,
    response: OctokitResponse[TeamsGetMembershipForUserInOrgResponseData]
  ): ParametersTeamsGetMembershipForUserInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetMembershipForUserInOrgEndpoint]
  }
}

