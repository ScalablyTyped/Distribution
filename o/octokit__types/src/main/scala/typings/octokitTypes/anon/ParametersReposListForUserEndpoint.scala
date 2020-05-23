package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListForUserEndpoint
import typings.octokitTypes.endpointsMod.ReposListForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListForUserEndpoint extends js.Object {
  var parameters: ReposListForUserEndpoint
  var request: ReposListForUserRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposListForUserEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListForUserEndpoint,
    request: ReposListForUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposListForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListForUserEndpoint]
  }
}

