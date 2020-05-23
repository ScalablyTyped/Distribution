package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesListEndpoint
import typings.octokitTypes.endpointsMod.IssuesListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `714` extends js.Object {
  var parameters: RequestParameters with (Omit[IssuesListEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[IssuesListResponseData]
}

object `714` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesListEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListResponseData]
  ): `714` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`714`]
  }
}

