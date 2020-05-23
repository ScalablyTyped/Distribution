package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsCheckTokenEndpoint
import typings.octokitTypes.endpointsMod.AppsCheckTokenResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `613` extends js.Object {
  var parameters: RequestParameters with (Omit[AppsCheckTokenEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[AppsCheckTokenResponseData]
}

object `613` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsCheckTokenEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsCheckTokenResponseData]
  ): `613` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`613`]
  }
}

