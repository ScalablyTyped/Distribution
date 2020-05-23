package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.MigrationsSetLfsPreferenceEndpoint
import typings.octokitTypes.endpointsMod.MigrationsSetLfsPreferenceResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `759` extends js.Object {
  var parameters: RequestParameters with (Omit[MigrationsSetLfsPreferenceEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[MigrationsSetLfsPreferenceResponseData]
}

object `759` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[MigrationsSetLfsPreferenceEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsSetLfsPreferenceResponseData]
  ): `759` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`759`]
  }
}

