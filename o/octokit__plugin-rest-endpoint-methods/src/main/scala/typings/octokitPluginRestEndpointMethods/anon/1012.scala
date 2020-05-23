package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposUpdateReleaseEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateReleaseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1012` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposUpdateReleaseEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposUpdateReleaseResponseData]
}

object `1012` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposUpdateReleaseEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposUpdateReleaseResponseData]
  ): `1012` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1012`]
  }
}

