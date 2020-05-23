package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.MigrationsGetStatusForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetStatusForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `752` extends js.Object {
  var parameters: RequestParameters with (Omit[MigrationsGetStatusForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[MigrationsGetStatusForAuthenticatedUserResponseData]
}

object `752` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[MigrationsGetStatusForAuthenticatedUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsGetStatusForAuthenticatedUserResponseData]
  ): `752` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`752`]
  }
}

