package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateProtectedBranchRequiredStatusChecksEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateProtectedBranchRequiredStatusChecksRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateProtectedBranchRequiredStatusChecksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposUpdateProtectedBranchRequiredStatusChecksEndpoint extends js.Object {
  var parameters: ReposUpdateProtectedBranchRequiredStatusChecksEndpoint
  var request: ReposUpdateProtectedBranchRequiredStatusChecksRequestOptions
  var response: OctokitResponse[ReposUpdateProtectedBranchRequiredStatusChecksResponseData]
}

object ParametersReposUpdateProtectedBranchRequiredStatusChecksEndpoint {
  @scala.inline
  def apply(
    parameters: ReposUpdateProtectedBranchRequiredStatusChecksEndpoint,
    request: ReposUpdateProtectedBranchRequiredStatusChecksRequestOptions,
    response: OctokitResponse[ReposUpdateProtectedBranchRequiredStatusChecksResponseData]
  ): ParametersReposUpdateProtectedBranchRequiredStatusChecksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateProtectedBranchRequiredStatusChecksEndpoint]
  }
}

