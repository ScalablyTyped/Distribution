package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsListGrantsEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsListGrantsRequestOptions
import typings.octokitTypes.endpointsMod.OauthAuthorizationsListGrantsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersOauthAuthorizationsListGrantsEndpoint extends js.Object {
  var parameters: OauthAuthorizationsListGrantsEndpoint
  var request: OauthAuthorizationsListGrantsRequestOptions
  var response: OctokitResponse[OauthAuthorizationsListGrantsResponseData]
}

object ParametersOauthAuthorizationsListGrantsEndpoint {
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsListGrantsEndpoint,
    request: OauthAuthorizationsListGrantsRequestOptions,
    response: OctokitResponse[OauthAuthorizationsListGrantsResponseData]
  ): ParametersOauthAuthorizationsListGrantsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsListGrantsEndpoint]
  }
}

