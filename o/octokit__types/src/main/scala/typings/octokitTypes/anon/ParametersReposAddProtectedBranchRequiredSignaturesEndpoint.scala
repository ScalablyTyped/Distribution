package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchRequiredSignaturesEndpoint
import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchRequiredSignaturesRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddProtectedBranchRequiredSignaturesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposAddProtectedBranchRequiredSignaturesEndpoint extends js.Object {
  var parameters: ReposAddProtectedBranchRequiredSignaturesEndpoint
  var request: ReposAddProtectedBranchRequiredSignaturesRequestOptions
  var response: OctokitResponse[ReposAddProtectedBranchRequiredSignaturesResponseData]
}

object ParametersReposAddProtectedBranchRequiredSignaturesEndpoint {
  @scala.inline
  def apply(
    parameters: ReposAddProtectedBranchRequiredSignaturesEndpoint,
    request: ReposAddProtectedBranchRequiredSignaturesRequestOptions,
    response: OctokitResponse[ReposAddProtectedBranchRequiredSignaturesResponseData]
  ): ParametersReposAddProtectedBranchRequiredSignaturesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddProtectedBranchRequiredSignaturesEndpoint]
  }
}

