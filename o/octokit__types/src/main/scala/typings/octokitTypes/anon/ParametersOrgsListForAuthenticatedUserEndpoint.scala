package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsListForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsListForAuthenticatedUserEndpoint extends js.Object {
  var parameters: OrgsListForAuthenticatedUserEndpoint
  var request: OrgsListForAuthenticatedUserRequestOptions
  var response: OctokitResponse[OrgsListForAuthenticatedUserResponseData]
}

object ParametersOrgsListForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsListForAuthenticatedUserEndpoint,
    request: OrgsListForAuthenticatedUserRequestOptions,
    response: OctokitResponse[OrgsListForAuthenticatedUserResponseData]
  ): ParametersOrgsListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListForAuthenticatedUserEndpoint]
  }
}

