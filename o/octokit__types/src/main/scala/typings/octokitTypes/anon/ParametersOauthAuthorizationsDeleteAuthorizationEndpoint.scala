package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsDeleteAuthorizationEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsDeleteAuthorizationRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOauthAuthorizationsDeleteAuthorizationEndpoint extends js.Object {
  var parameters: OauthAuthorizationsDeleteAuthorizationEndpoint
  var request: OauthAuthorizationsDeleteAuthorizationRequestOptions
  var response: OctokitResponse[_]
}

object ParametersOauthAuthorizationsDeleteAuthorizationEndpoint {
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsDeleteAuthorizationEndpoint,
    request: OauthAuthorizationsDeleteAuthorizationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOauthAuthorizationsDeleteAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsDeleteAuthorizationEndpoint]
  }
}

