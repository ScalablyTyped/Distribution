package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchTeamRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchTeamRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchTeamRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposRemoveProtectedBranchTeamRestrictionsEndpoint extends js.Object {
  var parameters: ReposRemoveProtectedBranchTeamRestrictionsEndpoint
  var request: ReposRemoveProtectedBranchTeamRestrictionsRequestOptions
  var response: OctokitResponse[ReposRemoveProtectedBranchTeamRestrictionsResponseData]
}

object ParametersReposRemoveProtectedBranchTeamRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRemoveProtectedBranchTeamRestrictionsEndpoint,
    request: ReposRemoveProtectedBranchTeamRestrictionsRequestOptions,
    response: OctokitResponse[ReposRemoveProtectedBranchTeamRestrictionsResponseData]
  ): ParametersReposRemoveProtectedBranchTeamRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveProtectedBranchTeamRestrictionsEndpoint]
  }
}

