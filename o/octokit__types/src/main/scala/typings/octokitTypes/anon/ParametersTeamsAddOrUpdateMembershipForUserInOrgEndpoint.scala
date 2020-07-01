package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserInOrgResponse422Data
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersTeamsAddOrUpdateMembershipForUserInOrgEndpoint extends js.Object {
  var parameters: TeamsAddOrUpdateMembershipForUserInOrgEndpoint
  var request: TeamsAddOrUpdateMembershipForUserInOrgRequestOptions
  var response: OctokitResponse[
    TeamsAddOrUpdateMembershipForUserInOrgResponseData | TeamsAddOrUpdateMembershipForUserInOrgResponse422Data
  ]
}

object ParametersTeamsAddOrUpdateMembershipForUserInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsAddOrUpdateMembershipForUserInOrgEndpoint,
    request: TeamsAddOrUpdateMembershipForUserInOrgRequestOptions,
    response: OctokitResponse[
      TeamsAddOrUpdateMembershipForUserInOrgResponseData | TeamsAddOrUpdateMembershipForUserInOrgResponse422Data
    ]
  ): ParametersTeamsAddOrUpdateMembershipForUserInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateMembershipForUserInOrgEndpoint]
  }
}

