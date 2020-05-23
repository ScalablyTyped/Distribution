package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesListMilestonesForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListMilestonesForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `727` extends js.Object {
  var parameters: RequestParameters with (Omit[IssuesListMilestonesForRepoEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[IssuesListMilestonesForRepoResponseData]
}

object `727` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesListMilestonesForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListMilestonesForRepoResponseData]
  ): `727` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`727`]
  }
}

