package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsCreateDiscussionInOrgEndpoint extends js.Object {
  /**
    * The discussion post's body text.
    */
  var body: String = js.native
  @JSName("org")
  var org_ : String = js.native
  /**
    * Private posts are only visible to team members, organization owners, and team maintainers. Public posts are visible to all members of the organization. Set to `true` to create a private post.
    */
  var `private`: js.UndefOr[Boolean] = js.native
  var team_slug: String = js.native
  /**
    * The discussion post's title.
    */
  var title: String = js.native
}

object TeamsCreateDiscussionInOrgEndpoint {
  @scala.inline
  def apply(body: String, org_ : String, team_slug: String, title: String): TeamsCreateDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateDiscussionInOrgEndpoint]
  }
  @scala.inline
  implicit class TeamsCreateDiscussionInOrgEndpointOps[Self <: TeamsCreateDiscussionInOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeam_slug(value: String): Self = this.set("team_slug", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
  }
  
}

