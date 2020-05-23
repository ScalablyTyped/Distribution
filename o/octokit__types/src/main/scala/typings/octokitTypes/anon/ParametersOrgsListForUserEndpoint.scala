package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListForUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsListForUserRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsListForUserEndpoint extends js.Object {
  var parameters: OrgsListForUserEndpoint
  var request: OrgsListForUserRequestOptions
  var response: OctokitResponse[OrgsListForUserResponseData]
}

object ParametersOrgsListForUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsListForUserEndpoint,
    request: OrgsListForUserRequestOptions,
    response: OctokitResponse[OrgsListForUserResponseData]
  ): ParametersOrgsListForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListForUserEndpoint]
  }
}

