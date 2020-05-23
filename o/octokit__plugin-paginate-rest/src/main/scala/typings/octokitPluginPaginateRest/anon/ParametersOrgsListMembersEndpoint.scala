package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListMembersEndpoint
import typings.octokitTypes.endpointsMod.OrgsListMembersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsListMembersEndpoint extends js.Object {
  var parameters: OrgsListMembersEndpoint
  var response: OctokitResponse[OrgsListMembersResponseData]
}

object ParametersOrgsListMembersEndpoint {
  @scala.inline
  def apply(parameters: OrgsListMembersEndpoint, response: OctokitResponse[OrgsListMembersResponseData]): ParametersOrgsListMembersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListMembersEndpoint]
  }
}

