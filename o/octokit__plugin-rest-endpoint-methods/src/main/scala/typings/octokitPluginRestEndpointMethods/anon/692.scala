package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GitignoreGetTemplateEndpoint
import typings.octokitTypes.endpointsMod.GitignoreGetTemplateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `692` extends js.Object {
  var parameters: RequestParameters with (Omit[GitignoreGetTemplateEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[GitignoreGetTemplateResponseData]
}

object `692` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GitignoreGetTemplateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitignoreGetTemplateResponseData]
  ): `692` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`692`]
  }
}

