package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposReplaceProtectedBranchUserRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposReplaceProtectedBranchUserRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposReplaceProtectedBranchUserRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposReplaceProtectedBranchUserRestrictionsEndpoint extends js.Object {
  var parameters: ReposReplaceProtectedBranchUserRestrictionsEndpoint
  var request: ReposReplaceProtectedBranchUserRestrictionsRequestOptions
  var response: OctokitResponse[ReposReplaceProtectedBranchUserRestrictionsResponseData]
}

object ParametersReposReplaceProtectedBranchUserRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposReplaceProtectedBranchUserRestrictionsEndpoint,
    request: ReposReplaceProtectedBranchUserRestrictionsRequestOptions,
    response: OctokitResponse[ReposReplaceProtectedBranchUserRestrictionsResponseData]
  ): ParametersReposReplaceProtectedBranchUserRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposReplaceProtectedBranchUserRestrictionsEndpoint]
  }
}

