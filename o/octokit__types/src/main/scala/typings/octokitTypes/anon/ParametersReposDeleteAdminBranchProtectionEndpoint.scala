package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteAdminBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteAdminBranchProtectionRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposDeleteAdminBranchProtectionEndpoint extends js.Object {
  var parameters: ReposDeleteAdminBranchProtectionEndpoint
  var request: ReposDeleteAdminBranchProtectionRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposDeleteAdminBranchProtectionEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeleteAdminBranchProtectionEndpoint,
    request: ReposDeleteAdminBranchProtectionRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteAdminBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteAdminBranchProtectionEndpoint]
  }
}

