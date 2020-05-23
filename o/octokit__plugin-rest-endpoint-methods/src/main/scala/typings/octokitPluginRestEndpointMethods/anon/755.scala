package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.MigrationsListForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsListForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `755` extends js.Object {
  var parameters: RequestParameters with (Omit[MigrationsListForOrgEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[MigrationsListForOrgResponseData]
}

object `755` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[MigrationsListForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsListForOrgResponseData]
  ): `755` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`755`]
  }
}

