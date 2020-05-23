package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.MigrationsStartForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsStartForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `761` extends js.Object {
  var parameters: RequestParameters with (Omit[MigrationsStartForOrgEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[MigrationsStartForOrgResponseData]
}

object `761` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[MigrationsStartForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsStartForOrgResponseData]
  ): `761` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`761`]
  }
}

