package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsGetCommentEndpoint
import typings.octokitTypes.endpointsMod.PullsGetCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `837` extends js.Object {
  var parameters: RequestParameters with (Omit[PullsGetCommentEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[PullsGetCommentResponseData]
}

object `837` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsGetCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsGetCommentResponseData]
  ): `837` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`837`]
  }
}

