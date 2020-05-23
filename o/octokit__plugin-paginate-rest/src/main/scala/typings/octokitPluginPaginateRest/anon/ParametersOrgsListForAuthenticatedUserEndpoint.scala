package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsListForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsListForAuthenticatedUserEndpoint extends js.Object {
  var parameters: OrgsListForAuthenticatedUserEndpoint
  var response: OctokitResponse[OrgsListForAuthenticatedUserResponseData]
}

object ParametersOrgsListForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsListForAuthenticatedUserEndpoint,
    response: OctokitResponse[OrgsListForAuthenticatedUserResponseData]
  ): ParametersOrgsListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListForAuthenticatedUserEndpoint]
  }
}

