package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesListLabelsForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListLabelsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `725` extends js.Object {
  var parameters: RequestParameters with (Omit[IssuesListLabelsForRepoEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[IssuesListLabelsForRepoResponseData]
}

object `725` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesListLabelsForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListLabelsForRepoResponseData]
  ): `725` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`725`]
  }
}

