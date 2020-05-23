package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersListBlockedEndpoint
import typings.octokitTypes.endpointsMod.UsersListBlockedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1069` extends js.Object {
  var parameters: RequestParameters with (Omit[UsersListBlockedEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[UsersListBlockedResponseData]
}

object `1069` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersListBlockedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListBlockedResponseData]
  ): `1069` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1069`]
  }
}

