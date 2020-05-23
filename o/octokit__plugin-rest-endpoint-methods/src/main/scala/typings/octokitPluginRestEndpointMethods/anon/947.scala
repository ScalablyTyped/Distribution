package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetReleaseByTagEndpoint
import typings.octokitTypes.endpointsMod.ReposGetReleaseByTagResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `947` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetReleaseByTagEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposGetReleaseByTagResponseData]
}

object `947` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetReleaseByTagEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetReleaseByTagResponseData]
  ): `947` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`947`]
  }
}

