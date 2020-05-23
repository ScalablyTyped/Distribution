package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListProtectedBranchRequiredStatusChecksContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposListProtectedBranchRequiredStatusChecksContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListProtectedBranchRequiredStatusChecksContextsEndpoint extends js.Object {
  var parameters: ReposListProtectedBranchRequiredStatusChecksContextsEndpoint
  var response: OctokitResponse[ReposListProtectedBranchRequiredStatusChecksContextsResponseData]
}

object ParametersReposListProtectedBranchRequiredStatusChecksContextsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListProtectedBranchRequiredStatusChecksContextsEndpoint,
    response: OctokitResponse[ReposListProtectedBranchRequiredStatusChecksContextsResponseData]
  ): ParametersReposListProtectedBranchRequiredStatusChecksContextsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListProtectedBranchRequiredStatusChecksContextsEndpoint]
  }
}

