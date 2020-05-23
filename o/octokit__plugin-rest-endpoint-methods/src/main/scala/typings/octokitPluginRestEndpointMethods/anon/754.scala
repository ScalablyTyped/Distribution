package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.MigrationsListForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsListForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `754` extends js.Object {
  var parameters: RequestParameters with (Omit[MigrationsListForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[MigrationsListForAuthenticatedUserResponseData]
}

object `754` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[MigrationsListForAuthenticatedUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsListForAuthenticatedUserResponseData]
  ): `754` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`754`]
  }
}

