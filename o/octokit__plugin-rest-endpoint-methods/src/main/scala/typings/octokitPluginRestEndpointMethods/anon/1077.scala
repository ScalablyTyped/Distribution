package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersListPublicEmailsEndpoint
import typings.octokitTypes.endpointsMod.UsersListPublicEmailsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1077` extends js.Object {
  var parameters: RequestParameters with (Omit[UsersListPublicEmailsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[UsersListPublicEmailsResponseData]
}

object `1077` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersListPublicEmailsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListPublicEmailsResponseData]
  ): `1077` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1077`]
  }
}

