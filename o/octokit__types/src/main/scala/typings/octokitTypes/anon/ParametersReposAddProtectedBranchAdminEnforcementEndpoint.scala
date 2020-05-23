package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchAdminEnforcementEndpoint
import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchAdminEnforcementRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchAdminEnforcementResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposAddProtectedBranchAdminEnforcementEndpoint extends js.Object {
  var parameters: ReposAddProtectedBranchAdminEnforcementEndpoint
  var request: ReposAddProtectedBranchAdminEnforcementRequestOptions
  var response: OctokitResponse[ReposAddProtectedBranchAdminEnforcementResponseData]
}

object ParametersReposAddProtectedBranchAdminEnforcementEndpoint {
  @scala.inline
  def apply(
    parameters: ReposAddProtectedBranchAdminEnforcementEndpoint,
    request: ReposAddProtectedBranchAdminEnforcementRequestOptions,
    response: OctokitResponse[ReposAddProtectedBranchAdminEnforcementResponseData]
  ): ParametersReposAddProtectedBranchAdminEnforcementEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddProtectedBranchAdminEnforcementEndpoint]
  }
}

