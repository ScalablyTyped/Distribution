package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteBranchProtectionRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposDeleteBranchProtectionEndpoint extends js.Object {
  var parameters: ReposDeleteBranchProtectionEndpoint
  var request: ReposDeleteBranchProtectionRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposDeleteBranchProtectionEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeleteBranchProtectionEndpoint,
    request: ReposDeleteBranchProtectionRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteBranchProtectionEndpoint]
  }
}

