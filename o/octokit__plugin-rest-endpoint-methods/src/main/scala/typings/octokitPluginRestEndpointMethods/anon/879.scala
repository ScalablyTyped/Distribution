package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposAddStatusCheckContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposAddStatusCheckContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `879` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposAddStatusCheckContextsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposAddStatusCheckContextsResponseData]
}

object `879` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposAddStatusCheckContextsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposAddStatusCheckContextsResponseData]
  ): `879` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`879`]
  }
}

