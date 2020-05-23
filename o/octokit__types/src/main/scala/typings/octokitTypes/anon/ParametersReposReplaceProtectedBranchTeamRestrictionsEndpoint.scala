package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposReplaceProtectedBranchTeamRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposReplaceProtectedBranchTeamRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposReplaceProtectedBranchTeamRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposReplaceProtectedBranchTeamRestrictionsEndpoint extends js.Object {
  var parameters: ReposReplaceProtectedBranchTeamRestrictionsEndpoint
  var request: ReposReplaceProtectedBranchTeamRestrictionsRequestOptions
  var response: OctokitResponse[ReposReplaceProtectedBranchTeamRestrictionsResponseData]
}

object ParametersReposReplaceProtectedBranchTeamRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposReplaceProtectedBranchTeamRestrictionsEndpoint,
    request: ReposReplaceProtectedBranchTeamRestrictionsRequestOptions,
    response: OctokitResponse[ReposReplaceProtectedBranchTeamRestrictionsResponseData]
  ): ParametersReposReplaceProtectedBranchTeamRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposReplaceProtectedBranchTeamRestrictionsEndpoint]
  }
}

