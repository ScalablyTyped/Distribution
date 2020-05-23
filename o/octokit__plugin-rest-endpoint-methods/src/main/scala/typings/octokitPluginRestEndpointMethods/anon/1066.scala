package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersGetGpgKeyEndpoint
import typings.octokitTypes.endpointsMod.UsersGetGpgKeyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1066` extends js.Object {
  var parameters: RequestParameters with (Omit[UsersGetGpgKeyEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[UsersGetGpgKeyResponseData]
}

object `1066` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersGetGpgKeyEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersGetGpgKeyResponseData]
  ): `1066` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1066`]
  }
}

