package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListMembershipsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListMembershipsRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListMembershipsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsListMembershipsEndpoint extends js.Object {
  var parameters: OrgsListMembershipsEndpoint
  var request: OrgsListMembershipsRequestOptions
  var response: OctokitResponse[OrgsListMembershipsResponseData]
}

object ParametersOrgsListMembershipsEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsListMembershipsEndpoint,
    request: OrgsListMembershipsRequestOptions,
    response: OctokitResponse[OrgsListMembershipsResponseData]
  ): ParametersOrgsListMembershipsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListMembershipsEndpoint]
  }
}

