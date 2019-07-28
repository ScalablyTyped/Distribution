package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListDiscussionsResponseItem extends js.Object {
  var author: TeamsListDiscussionsResponseItemAuthor
  var body: String
  var body_html: String
  var body_version: String
  var comments_count: Double
  var comments_url: String
  var created_at: String
  var html_url: String
  var last_edited_at: Null
  var node_id: String
  var number: Double
  var pinned: Boolean
  var `private`: Boolean
  var reactions: TeamsListDiscussionsResponseItemReactions
  var team_url: String
  var title: String
  var updated_at: String
  var url: String
}

object TeamsListDiscussionsResponseItem {
  @scala.inline
  def apply(
    author: TeamsListDiscussionsResponseItemAuthor,
    body: String,
    body_html: String,
    body_version: String,
    comments_count: Double,
    comments_url: String,
    created_at: String,
    html_url: String,
    last_edited_at: Null,
    node_id: String,
    number: Double,
    pinned: Boolean,
    `private`: Boolean,
    reactions: TeamsListDiscussionsResponseItemReactions,
    team_url: String,
    title: String,
    updated_at: String,
    url: String
  ): TeamsListDiscussionsResponseItem = {
    val __obj = js.Dynamic.literal(author = author, body = body, body_html = body_html, body_version = body_version, comments_count = comments_count, comments_url = comments_url, created_at = created_at, html_url = html_url, last_edited_at = last_edited_at, node_id = node_id, number = number, pinned = pinned, reactions = reactions, team_url = team_url, title = title, updated_at = updated_at, url = url)
    __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[TeamsListDiscussionsResponseItem]
  }
}

