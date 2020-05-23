package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReactionsListForCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReactionsListForCommitCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `867` extends js.Object {
  var parameters: RequestParameters with (Omit[ReactionsListForCommitCommentEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReactionsListForCommitCommentResponseData]
}

object `867` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReactionsListForCommitCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReactionsListForCommitCommentResponseData]
  ): `867` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`867`]
  }
}

