package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsRemoveMemberEndpoint
import typings.octokitTypes.endpointsMod.OrgsRemoveMemberRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsRemoveMemberEndpoint extends js.Object {
  var parameters: OrgsRemoveMemberEndpoint
  var request: OrgsRemoveMemberRequestOptions
  var response: OctokitResponse[_]
}

object ParametersOrgsRemoveMemberEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsRemoveMemberEndpoint,
    request: OrgsRemoveMemberRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsRemoveMemberEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsRemoveMemberEndpoint]
  }
}

