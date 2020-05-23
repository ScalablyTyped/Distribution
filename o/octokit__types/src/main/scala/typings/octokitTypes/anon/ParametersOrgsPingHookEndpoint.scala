package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsPingHookEndpoint
import typings.octokitTypes.endpointsMod.OrgsPingHookRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOrgsPingHookEndpoint extends js.Object {
  var parameters: OrgsPingHookEndpoint
  var request: OrgsPingHookRequestOptions
  var response: OctokitResponse[_]
}

object ParametersOrgsPingHookEndpoint {
  @scala.inline
  def apply(
    parameters: OrgsPingHookEndpoint,
    request: OrgsPingHookRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsPingHookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsPingHookEndpoint]
  }
}

