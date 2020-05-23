package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionCommentInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsGetDiscussionCommentInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1033` extends js.Object {
  var parameters: RequestParameters with (Omit[TeamsGetDiscussionCommentInOrgEndpoint, baseUrl | headers | mediaType])
  var response: OctokitResponse[TeamsGetDiscussionCommentInOrgResponseData]
}

object `1033` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[TeamsGetDiscussionCommentInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsGetDiscussionCommentInOrgResponseData]
  ): `1033` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1033`]
  }
}

