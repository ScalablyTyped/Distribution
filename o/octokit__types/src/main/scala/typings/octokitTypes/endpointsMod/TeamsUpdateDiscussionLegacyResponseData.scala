package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import typings.octokitTypes.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsUpdateDiscussionLegacyResponseData extends js.Object {
  var author: Avatarurl = js.native
  var body: String = js.native
  var body_html: String = js.native
  var body_version: String = js.native
  var comments_count: Double = js.native
  var comments_url: String = js.native
  var created_at: String = js.native
  var html_url: String = js.native
  var last_edited_at: String = js.native
  var node_id: String = js.native
  var number: Double = js.native
  var pinned: Boolean = js.native
  var `private`: Boolean = js.native
  var reactions: `1` = js.native
  var team_url: String = js.native
  var title: String = js.native
  var updated_at: String = js.native
  var url: String = js.native
}

object TeamsUpdateDiscussionLegacyResponseData {
  @scala.inline
  def apply(
    author: Avatarurl,
    body: String,
    body_html: String,
    body_version: String,
    comments_count: Double,
    comments_url: String,
    created_at: String,
    html_url: String,
    last_edited_at: String,
    node_id: String,
    number: Double,
    pinned: Boolean,
    `private`: Boolean,
    reactions: `1`,
    team_url: String,
    title: String,
    updated_at: String,
    url: String
  ): TeamsUpdateDiscussionLegacyResponseData = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], body_html = body_html.asInstanceOf[js.Any], body_version = body_version.asInstanceOf[js.Any], comments_count = comments_count.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], last_edited_at = last_edited_at.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], team_url = team_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsUpdateDiscussionLegacyResponseData]
  }
  @scala.inline
  implicit class TeamsUpdateDiscussionLegacyResponseDataOps[Self <: TeamsUpdateDiscussionLegacyResponseData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthor(value: Avatarurl): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody_html(value: String): Self = this.set("body_html", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody_version(value: String): Self = this.set("body_version", value.asInstanceOf[js.Any])
    @scala.inline
    def setComments_count(value: Double): Self = this.set("comments_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setComments_url(value: String): Self = this.set("comments_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_edited_at(value: String): Self = this.set("last_edited_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    @scala.inline
    def setReactions(value: `1`): Self = this.set("reactions", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeam_url(value: String): Self = this.set("team_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

