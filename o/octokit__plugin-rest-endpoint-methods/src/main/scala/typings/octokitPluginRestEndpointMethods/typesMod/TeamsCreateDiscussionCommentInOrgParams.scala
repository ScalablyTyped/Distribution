package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateDiscussionCommentInOrgParams extends js.Object {
  /**
    * The discussion comment's body text.
    */
  var body: String
  var discussion_number: Double
  var org: String
  var team_slug: String
}

object TeamsCreateDiscussionCommentInOrgParams {
  @scala.inline
  def apply(body: String, discussion_number: Double, org: String, team_slug: String): TeamsCreateDiscussionCommentInOrgParams = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateDiscussionCommentInOrgParams]
  }
}

