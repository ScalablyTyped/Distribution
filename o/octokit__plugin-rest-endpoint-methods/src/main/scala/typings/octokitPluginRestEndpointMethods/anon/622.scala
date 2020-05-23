package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsGetInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsGetInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `622` extends js.Object {
  var parameters: RequestParameters with (Omit[AppsGetInstallationEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[AppsGetInstallationResponseData]
}

object `622` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsGetInstallationEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsGetInstallationResponseData]
  ): `622` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`622`]
  }
}

