package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetBranchEndpoint
import typings.octokitTypes.endpointsMod.ReposGetBranchRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetBranchResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposGetBranchEndpoint extends js.Object {
  var parameters: ReposGetBranchEndpoint
  var request: ReposGetBranchRequestOptions
  var response: OctokitResponse[ReposGetBranchResponseData]
}

object ParametersReposGetBranchEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetBranchEndpoint,
    request: ReposGetBranchRequestOptions,
    response: OctokitResponse[ReposGetBranchResponseData]
  ): ParametersReposGetBranchEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetBranchEndpoint]
  }
}

