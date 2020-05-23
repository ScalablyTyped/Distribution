package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsUpdateBranchEndpoint
import typings.octokitTypes.endpointsMod.PullsUpdateBranchRequestOptions
import typings.octokitTypes.endpointsMod.PullsUpdateBranchResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersPullsUpdateBranchEndpoint extends js.Object {
  var parameters: PullsUpdateBranchEndpoint
  var request: PullsUpdateBranchRequestOptions
  var response: OctokitResponse[PullsUpdateBranchResponseData]
}

object ParametersPullsUpdateBranchEndpoint {
  @scala.inline
  def apply(
    parameters: PullsUpdateBranchEndpoint,
    request: PullsUpdateBranchRequestOptions,
    response: OctokitResponse[PullsUpdateBranchResponseData]
  ): ParametersPullsUpdateBranchEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsUpdateBranchEndpoint]
  }
}

