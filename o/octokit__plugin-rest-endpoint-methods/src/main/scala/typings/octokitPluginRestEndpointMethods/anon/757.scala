package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.MigrationsListReposForUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsListReposForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `757` extends js.Object {
  var parameters: RequestParameters with (Omit[MigrationsListReposForUserEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[MigrationsListReposForUserResponseData]
}

object `757` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[MigrationsListReposForUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsListReposForUserResponseData]
  ): `757` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`757`]
  }
}

