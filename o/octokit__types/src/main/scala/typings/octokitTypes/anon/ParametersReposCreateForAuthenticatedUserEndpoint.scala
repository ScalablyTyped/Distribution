package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersReposCreateForAuthenticatedUserEndpoint extends js.Object {
  var parameters: ReposCreateForAuthenticatedUserEndpoint
  var request: ReposCreateForAuthenticatedUserRequestOptions
  var response: OctokitResponse[ReposCreateForAuthenticatedUserResponseData]
}

object ParametersReposCreateForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCreateForAuthenticatedUserEndpoint,
    request: ReposCreateForAuthenticatedUserRequestOptions,
    response: OctokitResponse[ReposCreateForAuthenticatedUserResponseData]
  ): ParametersReposCreateForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateForAuthenticatedUserEndpoint]
  }
}

