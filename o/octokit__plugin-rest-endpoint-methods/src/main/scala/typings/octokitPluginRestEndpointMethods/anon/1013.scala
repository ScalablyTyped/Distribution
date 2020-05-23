package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposUpdateReleaseAssetEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateReleaseAssetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1013` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposUpdateReleaseAssetEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposUpdateReleaseAssetResponseData]
}

object `1013` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposUpdateReleaseAssetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposUpdateReleaseAssetResponseData]
  ): `1013` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1013`]
  }
}

