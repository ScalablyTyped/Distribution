package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OauthAuthorizationsListGrantsEndpoint
import typings.octokitTypes.endpointsMod.OauthAuthorizationsListGrantsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var parameters: OauthAuthorizationsListGrantsEndpoint
  var response: OctokitResponse[OauthAuthorizationsListGrantsResponseData]
}

object Response {
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsListGrantsEndpoint,
    response: OctokitResponse[OauthAuthorizationsListGrantsResponseData]
  ): Response = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

