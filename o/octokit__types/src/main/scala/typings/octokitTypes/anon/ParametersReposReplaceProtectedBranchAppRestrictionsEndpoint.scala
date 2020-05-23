package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposReplaceProtectedBranchAppRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposReplaceProtectedBranchAppRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposReplaceProtectedBranchAppRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposReplaceProtectedBranchAppRestrictionsEndpoint extends js.Object {
  var parameters: ReposReplaceProtectedBranchAppRestrictionsEndpoint
  var request: ReposReplaceProtectedBranchAppRestrictionsRequestOptions
  var response: OctokitResponse[ReposReplaceProtectedBranchAppRestrictionsResponseData]
}

object ParametersReposReplaceProtectedBranchAppRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposReplaceProtectedBranchAppRestrictionsEndpoint,
    request: ReposReplaceProtectedBranchAppRestrictionsRequestOptions,
    response: OctokitResponse[ReposReplaceProtectedBranchAppRestrictionsResponseData]
  ): ParametersReposReplaceProtectedBranchAppRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposReplaceProtectedBranchAppRestrictionsEndpoint]
  }
}

