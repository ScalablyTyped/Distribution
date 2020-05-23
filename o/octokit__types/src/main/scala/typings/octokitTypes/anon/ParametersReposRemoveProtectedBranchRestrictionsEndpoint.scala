package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchRestrictionsRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposRemoveProtectedBranchRestrictionsEndpoint extends js.Object {
  var parameters: ReposRemoveProtectedBranchRestrictionsEndpoint
  var request: ReposRemoveProtectedBranchRestrictionsRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposRemoveProtectedBranchRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRemoveProtectedBranchRestrictionsEndpoint,
    request: ReposRemoveProtectedBranchRestrictionsRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposRemoveProtectedBranchRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveProtectedBranchRestrictionsEndpoint]
  }
}

