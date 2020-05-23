package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposGetBranchProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetBranchProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetBranchProtectionEndpoint extends js.Object {
  var parameters: ReposGetBranchProtectionEndpoint
  var request: ReposGetBranchProtectionRequestOptions
  var response: OctokitResponse[ReposGetBranchProtectionResponseData]
}

object ParametersReposGetBranchProtectionEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetBranchProtectionEndpoint,
    request: ReposGetBranchProtectionRequestOptions,
    response: OctokitResponse[ReposGetBranchProtectionResponseData]
  ): ParametersReposGetBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetBranchProtectionEndpoint]
  }
}

