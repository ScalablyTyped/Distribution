package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListMembershipsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsListMembershipsForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListMembershipsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsListMembershipsForAuthenticatedUserEndpoint extends js.Object {
  var parameters: OrgsListMembershipsForAuthenticatedUserEndpoint
  var request: OrgsListMembershipsForAuthenticatedUserRequestOptions
  var response: OctokitResponse[OrgsListMembershipsForAuthenticatedUserResponseData]
}

object ParametersOrgsListMembershipsForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsListMembershipsForAuthenticatedUserEndpoint,
    request: OrgsListMembershipsForAuthenticatedUserRequestOptions,
    response: OctokitResponse[OrgsListMembershipsForAuthenticatedUserResponseData]
  ): ParametersOrgsListMembershipsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListMembershipsForAuthenticatedUserEndpoint]
  }
}

