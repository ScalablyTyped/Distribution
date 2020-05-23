package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchRequiredStatusChecksContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchRequiredStatusChecksContextsRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchRequiredStatusChecksContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposAddProtectedBranchRequiredStatusChecksContextsEndpoint extends js.Object {
  var parameters: ReposAddProtectedBranchRequiredStatusChecksContextsEndpoint
  var request: ReposAddProtectedBranchRequiredStatusChecksContextsRequestOptions
  var response: OctokitResponse[ReposAddProtectedBranchRequiredStatusChecksContextsResponseData]
}

object ParametersReposAddProtectedBranchRequiredStatusChecksContextsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposAddProtectedBranchRequiredStatusChecksContextsEndpoint,
    request: ReposAddProtectedBranchRequiredStatusChecksContextsRequestOptions,
    response: OctokitResponse[ReposAddProtectedBranchRequiredStatusChecksContextsResponseData]
  ): ParametersReposAddProtectedBranchRequiredStatusChecksContextsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddProtectedBranchRequiredStatusChecksContextsEndpoint]
  }
}

