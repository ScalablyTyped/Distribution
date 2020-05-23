package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsDeleteGrantEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsDeleteGrantRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOauthAuthorizationsDeleteGrantEndpoint extends js.Object {
  var parameters: OauthAuthorizationsDeleteGrantEndpoint
  var request: OauthAuthorizationsDeleteGrantRequestOptions
  var response: OctokitResponse[_]
}

object ParametersOauthAuthorizationsDeleteGrantEndpoint {
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsDeleteGrantEndpoint,
    request: OauthAuthorizationsDeleteGrantRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOauthAuthorizationsDeleteGrantEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsDeleteGrantEndpoint]
  }
}

