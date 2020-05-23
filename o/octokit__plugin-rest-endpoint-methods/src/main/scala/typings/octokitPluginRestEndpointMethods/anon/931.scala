package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetDownloadEndpoint
import typings.octokitTypes.endpointsMod.ReposGetDownloadResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `931` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetDownloadEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetDownloadResponseData]
}

object `931` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetDownloadEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetDownloadResponseData]
  ): `931` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`931`]
  }
}

