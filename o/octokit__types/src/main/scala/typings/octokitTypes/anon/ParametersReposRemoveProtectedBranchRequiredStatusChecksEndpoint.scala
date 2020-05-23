package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchRequiredStatusChecksEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchRequiredStatusChecksRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposRemoveProtectedBranchRequiredStatusChecksEndpoint extends js.Object {
  var parameters: ReposRemoveProtectedBranchRequiredStatusChecksEndpoint
  var request: ReposRemoveProtectedBranchRequiredStatusChecksRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposRemoveProtectedBranchRequiredStatusChecksEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRemoveProtectedBranchRequiredStatusChecksEndpoint,
    request: ReposRemoveProtectedBranchRequiredStatusChecksRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposRemoveProtectedBranchRequiredStatusChecksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveProtectedBranchRequiredStatusChecksEndpoint]
  }
}

