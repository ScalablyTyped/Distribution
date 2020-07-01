package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsListDiscussionsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListDiscussionsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1040` extends js.Object {
  var parameters: RequestParameters with (Omit[TeamsListDiscussionsInOrgEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[TeamsListDiscussionsInOrgResponseData]
}

object `1040` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[TeamsListDiscussionsInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsListDiscussionsInOrgResponseData]
  ): `1040` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1040`]
  }
}

