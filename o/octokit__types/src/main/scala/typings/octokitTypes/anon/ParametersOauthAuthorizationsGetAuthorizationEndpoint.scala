package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetAuthorizationEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetAuthorizationRequestOptions
import typings.octokitTypes.endpointsMod.OauthAuthorizationsGetAuthorizationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOauthAuthorizationsGetAuthorizationEndpoint extends js.Object {
  var parameters: OauthAuthorizationsGetAuthorizationEndpoint
  var request: OauthAuthorizationsGetAuthorizationRequestOptions
  var response: OctokitResponse[OauthAuthorizationsGetAuthorizationResponseData]
}

object ParametersOauthAuthorizationsGetAuthorizationEndpoint {
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsGetAuthorizationEndpoint,
    request: OauthAuthorizationsGetAuthorizationRequestOptions,
    response: OctokitResponse[OauthAuthorizationsGetAuthorizationResponseData]
  ): ParametersOauthAuthorizationsGetAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsGetAuthorizationEndpoint]
  }
}

