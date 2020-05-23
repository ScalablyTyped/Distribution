package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposReplaceProtectedBranchRequiredStatusChecksContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposReplaceProtectedBranchRequiredStatusChecksContextsRequestOptions
import typings.octokitTypes.endpointsMod.ReposReplaceProtectedBranchRequiredStatusChecksContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposReplaceProtectedBranchRequiredStatusChecksContextsEndpoint extends js.Object {
  var parameters: ReposReplaceProtectedBranchRequiredStatusChecksContextsEndpoint
  var request: ReposReplaceProtectedBranchRequiredStatusChecksContextsRequestOptions
  var response: OctokitResponse[ReposReplaceProtectedBranchRequiredStatusChecksContextsResponseData]
}

object ParametersReposReplaceProtectedBranchRequiredStatusChecksContextsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposReplaceProtectedBranchRequiredStatusChecksContextsEndpoint,
    request: ReposReplaceProtectedBranchRequiredStatusChecksContextsRequestOptions,
    response: OctokitResponse[ReposReplaceProtectedBranchRequiredStatusChecksContextsResponseData]
  ): ParametersReposReplaceProtectedBranchRequiredStatusChecksContextsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposReplaceProtectedBranchRequiredStatusChecksContextsEndpoint]
  }
}

