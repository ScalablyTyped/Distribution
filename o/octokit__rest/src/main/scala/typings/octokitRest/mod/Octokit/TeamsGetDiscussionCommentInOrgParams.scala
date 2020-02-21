package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetDiscussionCommentInOrgParams extends js.Object {
  var comment_number: Double
  var discussion_number: Double
  var org: String
  var team_slug: String
}

object TeamsGetDiscussionCommentInOrgParams {
  @scala.inline
  def apply(comment_number: Double, discussion_number: Double, org: String, team_slug: String): TeamsGetDiscussionCommentInOrgParams = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsGetDiscussionCommentInOrgParams]
  }
}

