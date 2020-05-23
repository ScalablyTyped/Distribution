package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersListGpgKeysForUserEndpoint
import typings.octokitTypes.endpointsMod.UsersListGpgKeysForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1076` extends js.Object {
  var parameters: RequestParameters with (Omit[UsersListGpgKeysForUserEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[UsersListGpgKeysForUserResponseData]
}

object `1076` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersListGpgKeysForUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListGpgKeysForUserResponseData]
  ): `1076` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1076`]
  }
}

