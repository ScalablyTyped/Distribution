package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListBlockedUsersEndpoint
import typings.octokitTypes.endpointsMod.OrgsListBlockedUsersRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListBlockedUsersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsListBlockedUsersEndpoint extends js.Object {
  var parameters: OrgsListBlockedUsersEndpoint
  var request: OrgsListBlockedUsersRequestOptions
  var response: OctokitResponse[OrgsListBlockedUsersResponseData]
}

object ParametersOrgsListBlockedUsersEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsListBlockedUsersEndpoint,
    request: OrgsListBlockedUsersRequestOptions,
    response: OctokitResponse[OrgsListBlockedUsersResponseData]
  ): ParametersOrgsListBlockedUsersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListBlockedUsersEndpoint]
  }
}

