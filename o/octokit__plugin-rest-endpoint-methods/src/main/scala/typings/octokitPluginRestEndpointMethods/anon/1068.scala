package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersListEndpoint
import typings.octokitTypes.endpointsMod.UsersListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1068` extends js.Object {
  var parameters: RequestParameters with (Omit[UsersListEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[UsersListResponseData]
}

object `1068` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersListEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListResponseData]
  ): `1068` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1068`]
  }
}

