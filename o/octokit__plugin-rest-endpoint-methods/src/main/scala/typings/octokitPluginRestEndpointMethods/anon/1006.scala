package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposUpdateCommitCommentEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateCommitCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1006` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposUpdateCommitCommentEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposUpdateCommitCommentResponseData]
}

object `1006` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposUpdateCommitCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposUpdateCommitCommentResponseData]
  ): `1006` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1006`]
  }
}

