package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchTeamRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchTeamRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchTeamRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposAddProtectedBranchTeamRestrictionsEndpoint extends js.Object {
  var parameters: ReposAddProtectedBranchTeamRestrictionsEndpoint
  var request: ReposAddProtectedBranchTeamRestrictionsRequestOptions
  var response: OctokitResponse[ReposAddProtectedBranchTeamRestrictionsResponseData]
}

object ParametersReposAddProtectedBranchTeamRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposAddProtectedBranchTeamRestrictionsEndpoint,
    request: ReposAddProtectedBranchTeamRestrictionsRequestOptions,
    response: OctokitResponse[ReposAddProtectedBranchTeamRestrictionsResponseData]
  ): ParametersReposAddProtectedBranchTeamRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddProtectedBranchTeamRestrictionsEndpoint]
  }
}

