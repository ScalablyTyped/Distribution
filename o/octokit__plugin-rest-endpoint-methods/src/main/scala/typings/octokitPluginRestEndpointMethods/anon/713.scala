package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesGetMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesGetMilestoneResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `713` extends js.Object {
  var parameters: RequestParameters with (Omit[IssuesGetMilestoneEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[IssuesGetMilestoneResponseData]
}

object `713` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesGetMilestoneEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesGetMilestoneResponseData]
  ): `713` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`713`]
  }
}

