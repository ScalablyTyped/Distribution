package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateBranchProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateBranchProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposUpdateBranchProtectionEndpoint extends js.Object {
  var parameters: ReposUpdateBranchProtectionEndpoint
  var request: ReposUpdateBranchProtectionRequestOptions
  var response: OctokitResponse[ReposUpdateBranchProtectionResponseData]
}

object ParametersReposUpdateBranchProtectionEndpoint {
  @scala.inline
  def apply(
    parameters: ReposUpdateBranchProtectionEndpoint,
    request: ReposUpdateBranchProtectionRequestOptions,
    response: OctokitResponse[ReposUpdateBranchProtectionResponseData]
  ): ParametersReposUpdateBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateBranchProtectionEndpoint]
  }
}

