package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListCommitCommentsEndpoint
import typings.octokitTypes.endpointsMod.ReposListCommitCommentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `959` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposListCommitCommentsEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReposListCommitCommentsResponseData]
}

object `959` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListCommitCommentsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListCommitCommentsResponseData]
  ): `959` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`959`]
  }
}

