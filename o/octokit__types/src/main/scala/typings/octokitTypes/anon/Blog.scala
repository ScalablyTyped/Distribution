package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blog extends StObject {
  
  var avatar_url: String
  
  var blog: String
  
  var company: String
  
  var created_at: String
  
  var description: String
  
  var email: String
  
  var events_url: String
  
  var followers: Double
  
  var following: Double
  
  var has_organization_projects: Boolean
  
  var has_repository_projects: Boolean
  
  var hooks_url: String
  
  var html_url: String
  
  var id: Double
  
  var is_verified: Boolean
  
  var issues_url: String
  
  var location: String
  
  var login: String
  
  var members_url: String
  
  var name: String
  
  var node_id: String
  
  var public_gists: Double
  
  var public_members_url: String
  
  var public_repos: Double
  
  var repos_url: String
  
  var twitter_username: String
  
  var `type`: String
  
  var url: String
}
object Blog {
  
  @scala.inline
  def apply(
    avatar_url: String,
    blog: String,
    company: String,
    created_at: String,
    description: String,
    email: String,
    events_url: String,
    followers: Double,
    following: Double,
    has_organization_projects: Boolean,
    has_repository_projects: Boolean,
    hooks_url: String,
    html_url: String,
    id: Double,
    is_verified: Boolean,
    issues_url: String,
    location: String,
    login: String,
    members_url: String,
    name: String,
    node_id: String,
    public_gists: Double,
    public_members_url: String,
    public_repos: Double,
    repos_url: String,
    twitter_username: String,
    `type`: String,
    url: String
  ): Blog = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], has_organization_projects = has_organization_projects.asInstanceOf[js.Any], has_repository_projects = has_repository_projects.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_members_url = public_members_url.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], twitter_username = twitter_username.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blog]
  }
  
  @scala.inline
  implicit class BlogMutableBuilder[Self <: Blog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlog(value: String): Self = StObject.set(x, "blog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents_url(value: String): Self = StObject.set(x, "events_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowers(value: Double): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowing(value: Double): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_organization_projects(value: Boolean): Self = StObject.set(x, "has_organization_projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_repository_projects(value: Boolean): Self = StObject.set(x, "has_repository_projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooks_url(value: String): Self = StObject.set(x, "hooks_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssues_url(value: String): Self = StObject.set(x, "issues_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers_url(value: String): Self = StObject.set(x, "members_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic_gists(value: Double): Self = StObject.set(x, "public_gists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic_members_url(value: String): Self = StObject.set(x, "public_members_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic_repos(value: Double): Self = StObject.set(x, "public_repos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepos_url(value: String): Self = StObject.set(x, "repos_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwitter_username(value: String): Self = StObject.set(x, "twitter_username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
