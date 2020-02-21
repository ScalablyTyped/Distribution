package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetDiscussionCommentInOrgResponse extends js.Object {
  var author: TeamsGetDiscussionCommentInOrgResponseAuthor
  var body: String
  var body_html: String
  var body_version: String
  var created_at: String
  var discussion_url: String
  var html_url: String
  var last_edited_at: Null
  var node_id: String
  var number: Double
  var reactions: TeamsGetDiscussionCommentInOrgResponseReactions
  var updated_at: String
  var url: String
}

object TeamsGetDiscussionCommentInOrgResponse {
  @scala.inline
  def apply(
    author: TeamsGetDiscussionCommentInOrgResponseAuthor,
    body: String,
    body_html: String,
    body_version: String,
    created_at: String,
    discussion_url: String,
    html_url: String,
    last_edited_at: Null,
    node_id: String,
    number: Double,
    reactions: TeamsGetDiscussionCommentInOrgResponseReactions,
    updated_at: String,
    url: String
  ): TeamsGetDiscussionCommentInOrgResponse = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], body_html = body_html.asInstanceOf[js.Any], body_version = body_version.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], discussion_url = discussion_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], last_edited_at = last_edited_at.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsGetDiscussionCommentInOrgResponse]
  }
}

