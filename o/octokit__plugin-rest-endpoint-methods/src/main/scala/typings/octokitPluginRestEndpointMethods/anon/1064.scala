package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersGetByUsernameEndpoint
import typings.octokitTypes.endpointsMod.UsersGetByUsernameResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1064` extends js.Object {
  var parameters: RequestParameters with (Omit[UsersGetByUsernameEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[UsersGetByUsernameResponseData]
}

object `1064` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersGetByUsernameEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersGetByUsernameResponseData]
  ): `1064` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1064`]
  }
}

