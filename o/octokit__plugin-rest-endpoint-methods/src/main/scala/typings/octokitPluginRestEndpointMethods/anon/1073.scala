package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersListFollowersForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListFollowersForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1073` extends js.Object {
  var parameters: RequestParameters with (Omit[UsersListFollowersForUserEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[UsersListFollowersForUserResponseData]
}

object `1073` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersListFollowersForUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListFollowersForUserResponseData]
  ): `1073` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1073`]
  }
}

