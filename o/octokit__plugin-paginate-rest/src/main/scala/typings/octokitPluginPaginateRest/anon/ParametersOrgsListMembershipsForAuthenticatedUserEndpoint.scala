package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListMembershipsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsListMembershipsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsListMembershipsForAuthenticatedUserEndpoint extends js.Object {
  var parameters: OrgsListMembershipsForAuthenticatedUserEndpoint
  var response: OctokitResponse[OrgsListMembershipsForAuthenticatedUserResponseData]
}

object ParametersOrgsListMembershipsForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsListMembershipsForAuthenticatedUserEndpoint,
    response: OctokitResponse[OrgsListMembershipsForAuthenticatedUserResponseData]
  ): ParametersOrgsListMembershipsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListMembershipsForAuthenticatedUserEndpoint]
  }
}

