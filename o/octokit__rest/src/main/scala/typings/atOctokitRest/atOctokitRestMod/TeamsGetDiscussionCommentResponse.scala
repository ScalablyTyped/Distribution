package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetDiscussionCommentResponse extends js.Object {
  var author: TeamsGetDiscussionCommentResponseAuthor
  var body: String
  var body_html: String
  var body_version: String
  var created_at: String
  var discussion_url: String
  var html_url: String
  var last_edited_at: Null
  var node_id: String
  var number: Double
  var reactions: TeamsGetDiscussionCommentResponseReactions
  var updated_at: String
  var url: String
}

object TeamsGetDiscussionCommentResponse {
  @scala.inline
  def apply(
    author: TeamsGetDiscussionCommentResponseAuthor,
    body: String,
    body_html: String,
    body_version: String,
    created_at: String,
    discussion_url: String,
    html_url: String,
    last_edited_at: Null,
    node_id: String,
    number: Double,
    reactions: TeamsGetDiscussionCommentResponseReactions,
    updated_at: String,
    url: String
  ): TeamsGetDiscussionCommentResponse = {
    val __obj = js.Dynamic.literal(author = author, body = body, body_html = body_html, body_version = body_version, created_at = created_at, discussion_url = discussion_url, html_url = html_url, last_edited_at = last_edited_at, node_id = node_id, number = number, reactions = reactions, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[TeamsGetDiscussionCommentResponse]
  }
}

