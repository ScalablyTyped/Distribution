package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposCreateReleaseEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateReleaseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `894` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposCreateReleaseEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposCreateReleaseResponseData]
}

object `894` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposCreateReleaseEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreateReleaseResponseData]
  ): `894` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`894`]
  }
}

