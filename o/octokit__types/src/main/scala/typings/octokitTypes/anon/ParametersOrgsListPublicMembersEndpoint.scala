package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListPublicMembersEndpoint
import typings.octokitTypes.endpointsMod.OrgsListPublicMembersRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListPublicMembersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsListPublicMembersEndpoint extends js.Object {
  var parameters: OrgsListPublicMembersEndpoint
  var request: OrgsListPublicMembersRequestOptions
  var response: OctokitResponse[OrgsListPublicMembersResponseData]
}

object ParametersOrgsListPublicMembersEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsListPublicMembersEndpoint,
    request: OrgsListPublicMembersRequestOptions,
    response: OctokitResponse[OrgsListPublicMembersResponseData]
  ): ParametersOrgsListPublicMembersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListPublicMembersEndpoint]
  }
}

