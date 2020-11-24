package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Eventsurl extends js.Object {
  
  var avatar_url: String = js.native
  
  var description: String = js.native
  
  var events_url: String = js.native
  
  var followers_url: String = js.native
  
  var following_url: String = js.native
  
  var gists_url: String = js.native
  
  var gravatar_id: String = js.native
  
  var hooks_url: String = js.native
  
  var html_url: String = js.native
  
  var id: Double = js.native
  
  var issues_url: String = js.native
  
  var login: String = js.native
  
  var members_url: String = js.native
  
  var node_id: String = js.native
  
  var organizations_url: String = js.native
  
  var public_members_url: String = js.native
  
  var received_events_url: String = js.native
  
  var repos_url: String = js.native
  
  var site_admin: Boolean = js.native
  
  var starred_url: String = js.native
  
  var subscriptions_url: String = js.native
  
  var `type`: String = js.native
  
  var url: String = js.native
}
object Eventsurl {
  
  @scala.inline
  def apply(
    avatar_url: String,
    description: String,
    events_url: String,
    followers_url: String,
    following_url: String,
    gists_url: String,
    gravatar_id: String,
    hooks_url: String,
    html_url: String,
    id: Double,
    issues_url: String,
    login: String,
    members_url: String,
    node_id: String,
    organizations_url: String,
    public_members_url: String,
    received_events_url: String,
    repos_url: String,
    site_admin: Boolean,
    starred_url: String,
    subscriptions_url: String,
    `type`: String,
    url: String
  ): Eventsurl = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers_url = followers_url.asInstanceOf[js.Any], following_url = following_url.asInstanceOf[js.Any], gists_url = gists_url.asInstanceOf[js.Any], gravatar_id = gravatar_id.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], organizations_url = organizations_url.asInstanceOf[js.Any], public_members_url = public_members_url.asInstanceOf[js.Any], received_events_url = received_events_url.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], site_admin = site_admin.asInstanceOf[js.Any], starred_url = starred_url.asInstanceOf[js.Any], subscriptions_url = subscriptions_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eventsurl]
  }
  
  @scala.inline
  implicit class EventsurlOps[Self <: Eventsurl] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents_url(value: String): Self = this.set("events_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowers_url(value: String): Self = this.set("followers_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowing_url(value: String): Self = this.set("following_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGists_url(value: String): Self = this.set("gists_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravatar_id(value: String): Self = this.set("gravatar_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooks_url(value: String): Self = this.set("hooks_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssues_url(value: String): Self = this.set("issues_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogin(value: String): Self = this.set("login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers_url(value: String): Self = this.set("members_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizations_url(value: String): Self = this.set("organizations_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic_members_url(value: String): Self = this.set("public_members_url", value.asInstanceOf[js.Any])
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
