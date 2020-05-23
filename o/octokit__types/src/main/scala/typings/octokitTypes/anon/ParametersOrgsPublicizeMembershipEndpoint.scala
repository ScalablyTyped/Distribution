package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsPublicizeMembershipEndpoint
import typings.octokitTypes.endpointsMod.OrgsPublicizeMembershipRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsPublicizeMembershipEndpoint extends js.Object {
  var parameters: OrgsPublicizeMembershipEndpoint
  var request: OrgsPublicizeMembershipRequestOptions
  var response: OctokitResponse[_]
}

object ParametersOrgsPublicizeMembershipEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsPublicizeMembershipEndpoint,
    request: OrgsPublicizeMembershipRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsPublicizeMembershipEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsPublicizeMembershipEndpoint]
  }
}

