package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetReleaseEndpoint
import typings.octokitTypes.endpointsMod.ReposGetReleaseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `945` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetReleaseEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetReleaseResponseData]
}

object `945` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetReleaseEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetReleaseResponseData]
  ): `945` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`945`]
  }
}

