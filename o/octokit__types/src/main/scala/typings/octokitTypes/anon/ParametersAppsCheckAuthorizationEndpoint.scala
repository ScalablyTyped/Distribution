package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsCheckAuthorizationEndpoint
import typings.octokitTypes.endpointsMod.AppsCheckAuthorizationRequestOptions
import typings.octokitTypes.endpointsMod.AppsCheckAuthorizationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsCheckAuthorizationEndpoint extends js.Object {
  var parameters: AppsCheckAuthorizationEndpoint
  var request: AppsCheckAuthorizationRequestOptions
  var response: OctokitResponse[AppsCheckAuthorizationResponseData]
}

object ParametersAppsCheckAuthorizationEndpoint {
  @scala.inline
  def apply(
    parameters: AppsCheckAuthorizationEndpoint,
    request: AppsCheckAuthorizationRequestOptions,
    response: OctokitResponse[AppsCheckAuthorizationResponseData]
  ): ParametersAppsCheckAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsCheckAuthorizationEndpoint]
  }
}

