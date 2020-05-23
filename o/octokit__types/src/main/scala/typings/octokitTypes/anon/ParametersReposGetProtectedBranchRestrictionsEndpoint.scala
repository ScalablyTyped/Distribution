package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetProtectedBranchRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetProtectedBranchRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetProtectedBranchRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetProtectedBranchRestrictionsEndpoint extends js.Object {
  var parameters: ReposGetProtectedBranchRestrictionsEndpoint
  var request: ReposGetProtectedBranchRestrictionsRequestOptions
  var response: OctokitResponse[ReposGetProtectedBranchRestrictionsResponseData]
}

object ParametersReposGetProtectedBranchRestrictionsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetProtectedBranchRestrictionsEndpoint,
    request: ReposGetProtectedBranchRestrictionsRequestOptions,
    response: OctokitResponse[ReposGetProtectedBranchRestrictionsResponseData]
  ): ParametersReposGetProtectedBranchRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetProtectedBranchRestrictionsEndpoint]
  }
}

