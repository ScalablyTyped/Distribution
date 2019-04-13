package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListDiscussionCommentsResponseItem extends js.Object {
  var author: TeamsListDiscussionCommentsResponseItemAuthor
  var body: java.lang.String
  var body_html: java.lang.String
  var body_version: java.lang.String
  var created_at: java.lang.String
  var discussion_url: java.lang.String
  var html_url: java.lang.String
  var last_edited_at: scala.Null
  var node_id: java.lang.String
  var number: scala.Double
  var reactions: TeamsListDiscussionCommentsResponseItemReactions
  var updated_at: java.lang.String
  var url: java.lang.String
}

object TeamsListDiscussionCommentsResponseItem {
  @scala.inline
  def apply(
    author: TeamsListDiscussionCommentsResponseItemAuthor,
    body: java.lang.String,
    body_html: java.lang.String,
    body_version: java.lang.String,
    created_at: java.lang.String,
    discussion_url: java.lang.String,
    html_url: java.lang.String,
    last_edited_at: scala.Null,
    node_id: java.lang.String,
    number: scala.Double,
    reactions: TeamsListDiscussionCommentsResponseItemReactions,
    updated_at: java.lang.String,
    url: java.lang.String
  ): TeamsListDiscussionCommentsResponseItem = {
    val __obj = js.Dynamic.literal(author = author, body = body, body_html = body_html, body_version = body_version, created_at = created_at, discussion_url = discussion_url, html_url = html_url, last_edited_at = last_edited_at, node_id = node_id, number = number, reactions = reactions, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[TeamsListDiscussionCommentsResponseItem]
  }
}

