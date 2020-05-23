package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.UsersListEmailsEndpoint
import typings.octokitTypes.endpointsMod.UsersListEmailsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1070` extends js.Object {
  var parameters: RequestParameters with (Omit[UsersListEmailsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[UsersListEmailsResponseData]
}

object `1070` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersListEmailsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListEmailsResponseData]
  ): `1070` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1070`]
  }
}

