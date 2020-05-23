package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetProtectedBranchRequiredStatusChecksEndpoint
import typings.octokitTypes.endpointsMod.ReposGetProtectedBranchRequiredStatusChecksRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetProtectedBranchRequiredStatusChecksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetProtectedBranchRequiredStatusChecksEndpoint extends js.Object {
  var parameters: ReposGetProtectedBranchRequiredStatusChecksEndpoint
  var request: ReposGetProtectedBranchRequiredStatusChecksRequestOptions
  var response: OctokitResponse[ReposGetProtectedBranchRequiredStatusChecksResponseData]
}

object ParametersReposGetProtectedBranchRequiredStatusChecksEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetProtectedBranchRequiredStatusChecksEndpoint,
    request: ReposGetProtectedBranchRequiredStatusChecksRequestOptions,
    response: OctokitResponse[ReposGetProtectedBranchRequiredStatusChecksResponseData]
  ): ParametersReposGetProtectedBranchRequiredStatusChecksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetProtectedBranchRequiredStatusChecksEndpoint]
  }
}

