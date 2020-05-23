package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveBranchProtectionRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposRemoveBranchProtectionEndpoint extends js.Object {
  var parameters: ReposRemoveBranchProtectionEndpoint
  var request: ReposRemoveBranchProtectionRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposRemoveBranchProtectionEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRemoveBranchProtectionEndpoint,
    request: ReposRemoveBranchProtectionRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposRemoveBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveBranchProtectionEndpoint]
  }
}

