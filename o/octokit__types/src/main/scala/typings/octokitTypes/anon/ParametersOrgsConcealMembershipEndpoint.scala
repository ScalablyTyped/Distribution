package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsConcealMembershipEndpoint
import typings.octokitTypes.endpointsMod.OrgsConcealMembershipRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsConcealMembershipEndpoint extends js.Object {
  var parameters: OrgsConcealMembershipEndpoint
  var request: OrgsConcealMembershipRequestOptions
  var response: OctokitResponse[_]
}

object ParametersOrgsConcealMembershipEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsConcealMembershipEndpoint,
    request: OrgsConcealMembershipRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsConcealMembershipEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsConcealMembershipEndpoint]
  }
}

