package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListHooksEndpoint
import typings.octokitTypes.endpointsMod.ReposListHooksRequestOptions
import typings.octokitTypes.endpointsMod.ReposListHooksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListHooksEndpoint extends js.Object {
  var parameters: ReposListHooksEndpoint
  var request: ReposListHooksRequestOptions
  var response: OctokitResponse[ReposListHooksResponseData]
}

object ParametersReposListHooksEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListHooksEndpoint,
    request: ReposListHooksRequestOptions,
    response: OctokitResponse[ReposListHooksResponseData]
  ): ParametersReposListHooksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListHooksEndpoint]
  }
}

