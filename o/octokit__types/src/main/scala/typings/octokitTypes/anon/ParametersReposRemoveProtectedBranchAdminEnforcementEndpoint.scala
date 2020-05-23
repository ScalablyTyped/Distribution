package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchAdminEnforcementEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchAdminEnforcementRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposRemoveProtectedBranchAdminEnforcementEndpoint extends js.Object {
  var parameters: ReposRemoveProtectedBranchAdminEnforcementEndpoint
  var request: ReposRemoveProtectedBranchAdminEnforcementRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposRemoveProtectedBranchAdminEnforcementEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRemoveProtectedBranchAdminEnforcementEndpoint,
    request: ReposRemoveProtectedBranchAdminEnforcementRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposRemoveProtectedBranchAdminEnforcementEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveProtectedBranchAdminEnforcementEndpoint]
  }
}

