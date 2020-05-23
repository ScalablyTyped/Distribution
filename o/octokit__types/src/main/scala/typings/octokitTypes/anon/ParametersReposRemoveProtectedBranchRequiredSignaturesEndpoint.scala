package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchRequiredSignaturesEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveProtectedBranchRequiredSignaturesRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposRemoveProtectedBranchRequiredSignaturesEndpoint extends js.Object {
  var parameters: ReposRemoveProtectedBranchRequiredSignaturesEndpoint
  var request: ReposRemoveProtectedBranchRequiredSignaturesRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposRemoveProtectedBranchRequiredSignaturesEndpoint {
  @scala.inline
  def apply(
    parameters: ReposRemoveProtectedBranchRequiredSignaturesEndpoint,
    request: ReposRemoveProtectedBranchRequiredSignaturesRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposRemoveProtectedBranchRequiredSignaturesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveProtectedBranchRequiredSignaturesEndpoint]
  }
}

