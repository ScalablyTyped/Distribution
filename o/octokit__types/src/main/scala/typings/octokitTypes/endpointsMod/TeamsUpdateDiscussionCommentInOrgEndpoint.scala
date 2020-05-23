package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsUpdateDiscussionCommentInOrgEndpoint extends js.Object {
  /**
    * The discussion comment's body text.
    */
  var body: String
  var comment_number: Double
  var discussion_number: Double
  @JSName("org")
  var org_ : String
  var team_slug: String
}

object TeamsUpdateDiscussionCommentInOrgEndpoint {
  @scala.inline
  def apply(body: String, comment_number: Double, discussion_number: Double, org_ : String, team_slug: String): TeamsUpdateDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsUpdateDiscussionCommentInOrgEndpoint]
  }
}

