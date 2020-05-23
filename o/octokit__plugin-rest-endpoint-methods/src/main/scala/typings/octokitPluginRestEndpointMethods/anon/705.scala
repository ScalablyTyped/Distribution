package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesCreateMilestoneEndpoint
import typings.octokitTypes.endpointsMod.IssuesCreateMilestoneResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `705` extends js.Object {
  var parameters: RequestParameters with (Omit[IssuesCreateMilestoneEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[IssuesCreateMilestoneResponseData]
}

object `705` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesCreateMilestoneEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesCreateMilestoneResponseData]
  ): `705` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`705`]
  }
}

