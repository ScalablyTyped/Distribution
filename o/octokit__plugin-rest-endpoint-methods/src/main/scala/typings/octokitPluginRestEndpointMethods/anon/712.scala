package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesGetLabelEndpoint
import typings.octokitTypes.endpointsMod.IssuesGetLabelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `712` extends js.Object {
  var parameters: RequestParameters with (Omit[IssuesGetLabelEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[IssuesGetLabelResponseData]
}

object `712` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesGetLabelEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesGetLabelResponseData]
  ): `712` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`712`]
  }
}

