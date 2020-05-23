package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposCreateUsingTemplateEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateUsingTemplateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `896` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposCreateUsingTemplateEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposCreateUsingTemplateResponseData]
}

object `896` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposCreateUsingTemplateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreateUsingTemplateResponseData]
  ): `896` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`896`]
  }
}

