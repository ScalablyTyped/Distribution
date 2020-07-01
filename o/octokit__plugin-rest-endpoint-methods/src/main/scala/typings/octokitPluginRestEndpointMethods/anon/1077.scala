package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersListPublicEmailsForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListPublicEmailsForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1077` extends js.Object {
  var parameters: RequestParameters with (Omit[UsersListPublicEmailsForAuthenticatedEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[UsersListPublicEmailsForAuthenticatedResponseData]
}

object `1077` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersListPublicEmailsForAuthenticatedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListPublicEmailsForAuthenticatedResponseData]
  ): `1077` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1077`]
  }
}

