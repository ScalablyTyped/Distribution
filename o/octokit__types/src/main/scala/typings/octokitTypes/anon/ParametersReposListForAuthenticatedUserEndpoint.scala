package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ReposListForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposListForAuthenticatedUserEndpoint extends js.Object {
  var parameters: ReposListForAuthenticatedUserEndpoint
  var request: ReposListForAuthenticatedUserRequestOptions
  var response: OctokitResponse[_]
}

object ParametersReposListForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListForAuthenticatedUserEndpoint,
    request: ReposListForAuthenticatedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListForAuthenticatedUserEndpoint]
  }
}

