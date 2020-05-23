package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsGetRepoInstallationEndpoint
import typings.octokitTypes.endpointsMod.AppsGetRepoInstallationResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `624` extends js.Object {
  var parameters: RequestParameters with (Omit[AppsGetRepoInstallationEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[AppsGetRepoInstallationResponseData]
}

object `624` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsGetRepoInstallationEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsGetRepoInstallationResponseData]
  ): `624` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`624`]
  }
}

