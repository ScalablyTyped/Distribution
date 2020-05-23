package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListBranchesEndpoint
import typings.octokitTypes.endpointsMod.ReposListBranchesRequestOptions
import typings.octokitTypes.endpointsMod.ReposListBranchesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListBranchesEndpoint extends js.Object {
  var parameters: ReposListBranchesEndpoint
  var request: ReposListBranchesRequestOptions
  var response: OctokitResponse[ReposListBranchesResponseData]
}

object ParametersReposListBranchesEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListBranchesEndpoint,
    request: ReposListBranchesRequestOptions,
    response: OctokitResponse[ReposListBranchesResponseData]
  ): ParametersReposListBranchesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListBranchesEndpoint]
  }
}

