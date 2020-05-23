package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposUploadReleaseAssetEndpoint
import typings.octokitTypes.endpointsMod.ReposUploadReleaseAssetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1014` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposUploadReleaseAssetEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposUploadReleaseAssetResponseData]
}

object `1014` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposUploadReleaseAssetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposUploadReleaseAssetResponseData]
  ): `1014` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1014`]
  }
}

