package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.MigrationsListReposForOrgEndpoint
import typings.octokitTypes.endpointsMod.MigrationsListReposForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `756` extends js.Object {
  var parameters: RequestParameters with (Omit[MigrationsListReposForOrgEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[MigrationsListReposForOrgResponseData]
}

object `756` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[MigrationsListReposForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsListReposForOrgResponseData]
  ): `756` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`756`]
  }
}

