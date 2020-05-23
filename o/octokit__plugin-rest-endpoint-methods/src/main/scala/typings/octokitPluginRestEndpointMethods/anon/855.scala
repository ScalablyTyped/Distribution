package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `855` extends js.Object {
  var parameters: RequestParameters with (Omit[ReactionsCreateForIssueEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[ReactionsCreateForIssueResponseData]
}

object `855` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReactionsCreateForIssueEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReactionsCreateForIssueResponseData]
  ): `855` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`855`]
  }
}

