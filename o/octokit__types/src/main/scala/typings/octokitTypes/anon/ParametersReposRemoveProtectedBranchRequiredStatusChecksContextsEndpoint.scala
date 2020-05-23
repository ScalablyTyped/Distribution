package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchRequiredStatusChecksContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchRequiredStatusChecksContextsRequestOptions
import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchRequiredStatusChecksContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposRemoveProtectedBranchRequiredStatusChecksContextsEndpoint extends js.Object {
  var parameters: ReposRemoveProtectedBranchRequiredStatusChecksContextsEndpoint
  var request: ReposRemoveProtectedBranchRequiredStatusChecksContextsRequestOptions
  var response: OctokitResponse[ReposRemoveProtectedBranchRequiredStatusChecksContextsResponseData]
}

object ParametersReposRemoveProtectedBranchRequiredStatusChecksContextsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRemoveProtectedBranchRequiredStatusChecksContextsEndpoint,
    request: ReposRemoveProtectedBranchRequiredStatusChecksContextsRequestOptions,
    response: OctokitResponse[ReposRemoveProtectedBranchRequiredStatusChecksContextsResponseData]
  ): ParametersReposRemoveProtectedBranchRequiredStatusChecksContextsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveProtectedBranchRequiredStatusChecksContextsEndpoint]
  }
}

