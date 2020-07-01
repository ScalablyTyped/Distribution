package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetReleaseAssetEndpoint
import typings.octokitTypes.endpointsMod.ReposGetReleaseAssetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `954` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetReleaseAssetEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetReleaseAssetResponseData]
}

object `954` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetReleaseAssetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetReleaseAssetResponseData]
  ): `954` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`954`]
  }
}

