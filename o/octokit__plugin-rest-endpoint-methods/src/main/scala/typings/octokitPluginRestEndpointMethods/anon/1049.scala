package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionCommentInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsUpdateDiscussionCommentInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1049` extends js.Object {
  var parameters: RequestParameters with (Omit[TeamsUpdateDiscussionCommentInOrgEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[TeamsUpdateDiscussionCommentInOrgResponseData]
}

object `1049` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[TeamsUpdateDiscussionCommentInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsUpdateDiscussionCommentInOrgResponseData]
  ): `1049` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1049`]
  }
}

