package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsCreateContentAttachmentEndpoint
import typings.octokitTypes.endpointsMod.AppsCreateContentAttachmentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `614` extends js.Object {
  var parameters: RequestParameters with (Omit[AppsCreateContentAttachmentEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[AppsCreateContentAttachmentResponseData]
}

object `614` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsCreateContentAttachmentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsCreateContentAttachmentResponseData]
  ): `614` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`614`]
  }
}

