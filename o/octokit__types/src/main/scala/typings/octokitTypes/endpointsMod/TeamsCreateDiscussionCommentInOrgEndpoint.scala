package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateDiscussionCommentInOrgEndpoint extends js.Object {
  /**
    * The discussion comment's body text.
    */
  var body: String
  var discussion_number: Double
  @JSName("org")
  var org_ : String
  var team_slug: String
}

object TeamsCreateDiscussionCommentInOrgEndpoint {
  @scala.inline
  def apply(body: String, discussion_number: Double, org_ : String, team_slug: String): TeamsCreateDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateDiscussionCommentInOrgEndpoint]
  }
}

