package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesUpdateCommentEndpoint
import typings.octokitTypes.endpointsMod.IssuesUpdateCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `735` extends js.Object {
  var parameters: RequestParameters with (Omit[IssuesUpdateCommentEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[IssuesUpdateCommentResponseData]
}

object `735` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesUpdateCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesUpdateCommentResponseData]
  ): `735` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`735`]
  }
}

