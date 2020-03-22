package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetDiscussionInOrgResponse extends js.Object {
  var author: TeamsGetDiscussionInOrgResponseAuthor
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
  var reactions: TeamsGetDiscussionInOrgResponseReactions
  var team_url: String
  var title: String
  var updated_at: String
  var url: String
}

object TeamsGetDiscussionInOrgResponse {
  @scala.inline
  def apply(
    author: TeamsGetDiscussionInOrgResponseAuthor,
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
    reactions: TeamsGetDiscussionInOrgResponseReactions,
    team_url: String,
    title: String,
    updated_at: String,
    url: String
  ): TeamsGetDiscussionInOrgResponse = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], body_html = body_html.asInstanceOf[js.Any], body_version = body_version.asInstanceOf[js.Any], comments_count = comments_count.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], last_edited_at = last_edited_at.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], team_url = team_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsGetDiscussionInOrgResponse]
  }
}

