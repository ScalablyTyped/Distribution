package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetProtectedBranchAdminEnforcementEndpoint
import typings.octokitTypes.endpointsMod.ReposGetProtectedBranchAdminEnforcementRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetProtectedBranchAdminEnforcementResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetProtectedBranchAdminEnforcementEndpoint extends js.Object {
  var parameters: ReposGetProtectedBranchAdminEnforcementEndpoint
  var request: ReposGetProtectedBranchAdminEnforcementRequestOptions
  var response: OctokitResponse[ReposGetProtectedBranchAdminEnforcementResponseData]
}

object ParametersReposGetProtectedBranchAdminEnforcementEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetProtectedBranchAdminEnforcementEndpoint,
    request: ReposGetProtectedBranchAdminEnforcementRequestOptions,
    response: OctokitResponse[ReposGetProtectedBranchAdminEnforcementResponseData]
  ): ParametersReposGetProtectedBranchAdminEnforcementEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetProtectedBranchAdminEnforcementEndpoint]
  }
}

