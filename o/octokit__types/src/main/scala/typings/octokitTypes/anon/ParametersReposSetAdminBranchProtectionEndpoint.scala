package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposSetAdminBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposSetAdminBranchProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposSetAdminBranchProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposSetAdminBranchProtectionEndpoint extends js.Object {
  var parameters: ReposSetAdminBranchProtectionEndpoint
  var request: ReposSetAdminBranchProtectionRequestOptions
  var response: OctokitResponse[ReposSetAdminBranchProtectionResponseData]
}

object ParametersReposSetAdminBranchProtectionEndpoint {
  @scala.inline
  def apply(
    parameters: ReposSetAdminBranchProtectionEndpoint,
    request: ReposSetAdminBranchProtectionRequestOptions,
    response: OctokitResponse[ReposSetAdminBranchProtectionResponseData]
  ): ParametersReposSetAdminBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposSetAdminBranchProtectionEndpoint]
  }
}

