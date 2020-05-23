package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsCreateCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `828` extends js.Object {
  var parameters: RequestParameters with (Omit[PullsCreateCommentEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[PullsCreateCommentResponseData]
}

object `828` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsCreateCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsCreateCommentResponseData]
  ): `828` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`828`]
  }
}

