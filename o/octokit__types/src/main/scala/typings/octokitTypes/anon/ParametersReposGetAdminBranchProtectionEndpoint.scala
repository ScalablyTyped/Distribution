package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetAdminBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposGetAdminBranchProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetAdminBranchProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetAdminBranchProtectionEndpoint extends js.Object {
  var parameters: ReposGetAdminBranchProtectionEndpoint
  var request: ReposGetAdminBranchProtectionRequestOptions
  var response: OctokitResponse[ReposGetAdminBranchProtectionResponseData]
}

object ParametersReposGetAdminBranchProtectionEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetAdminBranchProtectionEndpoint,
    request: ReposGetAdminBranchProtectionRequestOptions,
    response: OctokitResponse[ReposGetAdminBranchProtectionResponseData]
  ): ParametersReposGetAdminBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetAdminBranchProtectionEndpoint]
  }
}

