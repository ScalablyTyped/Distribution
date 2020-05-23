package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsDeleteDiscussionCommentInOrgEndpoint extends js.Object {
  var comment_number: Double
  var discussion_number: Double
  @JSName("org")
  var org_ : String
  var team_slug: String
}

object TeamsDeleteDiscussionCommentInOrgEndpoint {
  @scala.inline
  def apply(comment_number: Double, discussion_number: Double, org_ : String, team_slug: String): TeamsDeleteDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsDeleteDiscussionCommentInOrgEndpoint]
  }
}

