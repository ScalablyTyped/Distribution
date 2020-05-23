package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesListLabelsOnIssueEndpoint
import typings.octokitTypes.endpointsMod.IssuesListLabelsOnIssueResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `726` extends js.Object {
  var parameters: RequestParameters with (Omit[IssuesListLabelsOnIssueEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[IssuesListLabelsOnIssueResponseData]
}

object `726` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesListLabelsOnIssueEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListLabelsOnIssueResponseData]
  ): `726` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`726`]
  }
}

