package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequestOptions
import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponse201Data
import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint extends js.Object {
  var parameters: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint
  var request: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequestOptions
  var response: OctokitResponse[
    OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponseData | OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponse201Data
  ]
}

object ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint {
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint,
    request: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequestOptions,
    response: OctokitResponse[
      OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponseData | OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponse201Data
    ]
  ): ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint]
  }
}

