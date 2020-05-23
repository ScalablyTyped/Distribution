package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateDiscussionInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1028` extends js.Object {
  var parameters: RequestParameters with (Omit[TeamsCreateDiscussionInOrgEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[TeamsCreateDiscussionInOrgResponseData]
}

object `1028` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[TeamsCreateDiscussionInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsCreateDiscussionInOrgResponseData]
  ): `1028` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1028`]
  }
}

