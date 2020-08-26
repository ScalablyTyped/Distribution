package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Collaborators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersGetByUsernameResponseData extends js.Object {
  var avatar_url: String = js.native
  var bio: String = js.native
  var blog: String = js.native
  var company: String = js.native
  var created_at: String = js.native
  var email: String = js.native
  var events_url: String = js.native
  var followers: Double = js.native
  var followers_url: String = js.native
  var following: Double = js.native
  var following_url: String = js.native
  var gists_url: String = js.native
  var gravatar_id: String = js.native
  var hireable: Boolean = js.native
  var html_url: String = js.native
  var id: Double = js.native
  var location: String = js.native
  var login: String = js.native
  var name: String = js.native
  var node_id: String = js.native
  var organizations_url: String = js.native
  var plan: Collaborators = js.native
  var public_gists: Double = js.native
  var public_repos: Double = js.native
  var received_events_url: String = js.native
  var repos_url: String = js.native
  var site_admin: Boolean = js.native
  var starred_url: String = js.native
  var subscriptions_url: String = js.native
  var twitter_username: String = js.native
  var `type`: String = js.native
  var updated_at: String = js.native
  var url: String = js.native
}

object UsersGetByUsernameResponseData {
  @scala.inline
  def apply(
    avatar_url: String,
    bio: String,
    blog: String,
    company: String,
    created_at: String,
    email: String,
    events_url: String,
    followers: Double,
    followers_url: String,
    following: Double,
    following_url: String,
    gists_url: String,
    gravatar_id: String,
    hireable: Boolean,
    html_url: String,
    id: Double,
    location: String,
    login: String,
    name: String,
    node_id: String,
    organizations_url: String,
    plan: Collaborators,
    public_gists: Double,
    public_repos: Double,
    received_events_url: String,
    repos_url: String,
    site_admin: Boolean,
    starred_url: String,
    subscriptions_url: String,
    twitter_username: String,
    `type`: String,
    updated_at: String,
    url: String
  ): UsersGetByUsernameResponseData = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], bio = bio.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], followers_url = followers_url.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], following_url = following_url.asInstanceOf[js.Any], gists_url = gists_url.asInstanceOf[js.Any], gravatar_id = gravatar_id.asInstanceOf[js.Any], hireable = hireable.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], organizations_url = organizations_url.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], received_events_url = received_events_url.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], site_admin = site_admin.asInstanceOf[js.Any], starred_url = starred_url.asInstanceOf[js.Any], subscriptions_url = subscriptions_url.asInstanceOf[js.Any], twitter_username = twitter_username.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetByUsernameResponseData]
  }
  @scala.inline
  implicit class UsersGetByUsernameResponseDataOps[Self <: UsersGetByUsernameResponseData] (val x: Self) extends AnyVal {
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
    def setAvatar_url(value: String): Self = this.set("avatar_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setBio(value: String): Self = this.set("bio", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlog(value: String): Self = this.set("blog", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompany(value: String): Self = this.set("company", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvents_url(value: String): Self = this.set("events_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setFollowers(value: Double): Self = this.set("followers", value.asInstanceOf[js.Any])
    @scala.inline
    def setFollowers_url(value: String): Self = this.set("followers_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setFollowing(value: Double): Self = this.set("following", value.asInstanceOf[js.Any])
    @scala.inline
    def setFollowing_url(value: String): Self = this.set("following_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setGists_url(value: String): Self = this.set("gists_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setGravatar_id(value: String): Self = this.set("gravatar_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setHireable(value: Boolean): Self = this.set("hireable", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogin(value: String): Self = this.set("login", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizations_url(value: String): Self = this.set("organizations_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlan(value: Collaborators): Self = this.set("plan", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublic_gists(value: Double): Self = this.set("public_gists", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublic_repos(value: Double): Self = this.set("public_repos", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceived_events_url(value: String): Self = this.set("received_events_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepos_url(value: String): Self = this.set("repos_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setSite_admin(value: Boolean): Self = this.set("site_admin", value.asInstanceOf[js.Any])
    @scala.inline
    def setStarred_url(value: String): Self = this.set("starred_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptions_url(value: String): Self = this.set("subscriptions_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwitter_username(value: String): Self = this.set("twitter_username", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

