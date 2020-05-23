package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsResetAuthorizationEndpoint
import typings.octokitTypes.endpointsMod.AppsResetAuthorizationRequestOptions
import typings.octokitTypes.endpointsMod.AppsResetAuthorizationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsResetAuthorizationEndpoint extends js.Object {
  var parameters: AppsResetAuthorizationEndpoint
  var request: AppsResetAuthorizationRequestOptions
  var response: OctokitResponse[AppsResetAuthorizationResponseData]
}

object ParametersAppsResetAuthorizationEndpoint {
  @scala.inline
  def apply(
    parameters: AppsResetAuthorizationEndpoint,
    request: AppsResetAuthorizationRequestOptions,
    response: OctokitResponse[AppsResetAuthorizationResponseData]
  ): ParametersAppsResetAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsResetAuthorizationEndpoint]
  }
}

