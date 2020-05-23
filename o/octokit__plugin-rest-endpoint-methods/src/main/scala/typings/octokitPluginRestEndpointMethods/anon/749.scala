package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.MigrationsGetCommitAuthorsEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetCommitAuthorsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `749` extends js.Object {
  var parameters: RequestParameters with (Omit[MigrationsGetCommitAuthorsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[MigrationsGetCommitAuthorsResponseData]
}

object `749` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[MigrationsGetCommitAuthorsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsGetCommitAuthorsResponseData]
  ): `749` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`749`]
  }
}

