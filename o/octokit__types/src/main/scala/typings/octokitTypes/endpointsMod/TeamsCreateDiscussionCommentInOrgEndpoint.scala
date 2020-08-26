package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsCreateDiscussionCommentInOrgEndpoint extends js.Object {
  /**
    * The discussion comment's body text.
    */
  var body: String = js.native
  var discussion_number: Double = js.native
  @JSName("org")
  var org_ : String = js.native
  var team_slug: String = js.native
}

object TeamsCreateDiscussionCommentInOrgEndpoint {
  @scala.inline
  def apply(body: String, discussion_number: Double, org_ : String, team_slug: String): TeamsCreateDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateDiscussionCommentInOrgEndpoint]
  }
  @scala.inline
  implicit class TeamsCreateDiscussionCommentInOrgEndpointOps[Self <: TeamsCreateDiscussionCommentInOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiscussion_number(value: Double): Self = this.set("discussion_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeam_slug(value: String): Self = this.set("team_slug", value.asInstanceOf[js.Any])
  }
  
}

