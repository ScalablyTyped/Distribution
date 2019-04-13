package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetDiscussionResponse extends js.Object {
  var author: TeamsGetDiscussionResponseAuthor
  var body: java.lang.String
  var body_html: java.lang.String
  var body_version: java.lang.String
  var comments_count: scala.Double
  var comments_url: java.lang.String
  var created_at: java.lang.String
  var html_url: java.lang.String
  var last_edited_at: scala.Null
  var node_id: java.lang.String
  var number: scala.Double
  var pinned: scala.Boolean
  var `private`: scala.Boolean
  var reactions: TeamsGetDiscussionResponseReactions
  var team_url: java.lang.String
  var title: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
}

object TeamsGetDiscussionResponse {
  @scala.inline
  def apply(
    author: TeamsGetDiscussionResponseAuthor,
    body: java.lang.String,
    body_html: java.lang.String,
    body_version: java.lang.String,
    comments_count: scala.Double,
    comments_url: java.lang.String,
    created_at: java.lang.String,
    html_url: java.lang.String,
    last_edited_at: scala.Null,
    node_id: java.lang.String,
    number: scala.Double,
    pinned: scala.Boolean,
    `private`: scala.Boolean,
    reactions: TeamsGetDiscussionResponseReactions,
    team_url: java.lang.String,
    title: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String
  ): TeamsGetDiscussionResponse = {
    val __obj = js.Dynamic.literal(author = author, body = body, body_html = body_html, body_version = body_version, comments_count = comments_count, comments_url = comments_url, created_at = created_at, html_url = html_url, last_edited_at = last_edited_at, node_id = node_id, number = number, pinned = pinned, reactions = reactions, team_url = team_url, title = title, updated_at = updated_at, url = url)
    __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[TeamsGetDiscussionResponse]
  }
}

