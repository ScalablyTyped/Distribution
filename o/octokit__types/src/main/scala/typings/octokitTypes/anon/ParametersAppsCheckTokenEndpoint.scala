package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.AppsCheckTokenEndpoint
import typings.octokitTypes.endpointsMod.AppsCheckTokenRequestOptions
import typings.octokitTypes.endpointsMod.AppsCheckTokenResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsCheckTokenEndpoint extends js.Object {
  var parameters: AppsCheckTokenEndpoint
  var request: AppsCheckTokenRequestOptions
  var response: OctokitResponse[AppsCheckTokenResponseData]
}

object ParametersAppsCheckTokenEndpoint {
  @scala.inline
  def apply(
    parameters: AppsCheckTokenEndpoint,
    request: AppsCheckTokenRequestOptions,
    response: OctokitResponse[AppsCheckTokenResponseData]
  ): ParametersAppsCheckTokenEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsCheckTokenEndpoint]
  }
}

