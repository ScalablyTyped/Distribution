package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetProtectedBranchRequiredSignaturesEndpoint
import typings.octokitTypes.endpointsMod.ReposGetProtectedBranchRequiredSignaturesRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetProtectedBranchRequiredSignaturesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetProtectedBranchRequiredSignaturesEndpoint extends js.Object {
  var parameters: ReposGetProtectedBranchRequiredSignaturesEndpoint
  var request: ReposGetProtectedBranchRequiredSignaturesRequestOptions
  var response: OctokitResponse[ReposGetProtectedBranchRequiredSignaturesResponseData]
}

object ParametersReposGetProtectedBranchRequiredSignaturesEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetProtectedBranchRequiredSignaturesEndpoint,
    request: ReposGetProtectedBranchRequiredSignaturesRequestOptions,
    response: OctokitResponse[ReposGetProtectedBranchRequiredSignaturesResponseData]
  ): ParametersReposGetProtectedBranchRequiredSignaturesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetProtectedBranchRequiredSignaturesEndpoint]
  }
}

