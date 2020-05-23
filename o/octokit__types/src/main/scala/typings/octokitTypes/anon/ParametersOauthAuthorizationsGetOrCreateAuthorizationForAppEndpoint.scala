package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppRequestOptions
import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppResponse201Data
import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint extends js.Object {
  var parameters: OauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint
  var request: OauthAuthorizationsGetOrCreateAuthorizationForAppRequestOptions
  var response: OctokitResponse[
    OauthAuthorizationsGetOrCreateAuthorizationForAppResponseData | OauthAuthorizationsGetOrCreateAuthorizationForAppResponse201Data
  ]
}

object ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint {
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint,
    request: OauthAuthorizationsGetOrCreateAuthorizationForAppRequestOptions,
    response: OctokitResponse[
      OauthAuthorizationsGetOrCreateAuthorizationForAppResponseData | OauthAuthorizationsGetOrCreateAuthorizationForAppResponse201Data
    ]
  ): ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint]
  }
}

