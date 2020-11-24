package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Filledseats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgsGetResponseData extends js.Object {
  
  var avatar_url: String = js.native
  
  var billing_email: String = js.native
  
  var blog: String = js.native
  
  var collaborators: Double = js.native
  
  var company: String = js.native
  
  var created_at: String = js.native
  
  var default_repository_permission: String = js.native
  
  var description: String = js.native
  
  var disk_usage: Double = js.native
  
  var email: String = js.native
  
  var events_url: String = js.native
  
  var followers: Double = js.native
  
  var following: Double = js.native
  
  var has_organization_projects: Boolean = js.native
  
  var has_repository_projects: Boolean = js.native
  
  var hooks_url: String = js.native
  
  var html_url: String = js.native
  
  var id: Double = js.native
  
  var is_verified: Boolean = js.native
  
  var issues_url: String = js.native
  
  var location: String = js.native
  
  var login: String = js.native
  
  var members_allowed_repository_creation_type: String = js.native
  
  var members_can_create_internal_repositories: Boolean = js.native
  
  var members_can_create_private_repositories: Boolean = js.native
  
  var members_can_create_public_repositories: Boolean = js.native
  
  var members_can_create_repositories: Boolean = js.native
  
  var members_url: String = js.native
  
  var name: String = js.native
  
  var node_id: String = js.native
  
  var owned_private_repos: Double = js.native
  
  var plan: Filledseats = js.native
  
  var private_gists: Double = js.native
  
  var public_gists: Double = js.native
  
  var public_members_url: String = js.native
  
  var public_repos: Double = js.native
  
  var repos_url: String = js.native
  
  var total_private_repos: Double = js.native
  
  var twitter_username: String = js.native
  
  var two_factor_requirement_enabled: Boolean = js.native
  
  var `type`: String = js.native
  
  var url: String = js.native
}
object OrgsGetResponseData {
  
  @scala.inline
  def apply(
    avatar_url: String,
    billing_email: String,
    blog: String,
    collaborators: Double,
    company: String,
    created_at: String,
    default_repository_permission: String,
    description: String,
    disk_usage: Double,
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
    members_allowed_repository_creation_type: String,
    members_can_create_internal_repositories: Boolean,
    members_can_create_private_repositories: Boolean,
    members_can_create_public_repositories: Boolean,
    members_can_create_repositories: Boolean,
    members_url: String,
    name: String,
    node_id: String,
    owned_private_repos: Double,
    plan: Filledseats,
    private_gists: Double,
    public_gists: Double,
    public_members_url: String,
    public_repos: Double,
    repos_url: String,
    total_private_repos: Double,
    twitter_username: String,
    two_factor_requirement_enabled: Boolean,
    `type`: String,
    url: String
  ): OrgsGetResponseData = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], billing_email = billing_email.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], collaborators = collaborators.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], default_repository_permission = default_repository_permission.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], disk_usage = disk_usage.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], has_organization_projects = has_organization_projects.asInstanceOf[js.Any], has_repository_projects = has_repository_projects.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], members_allowed_repository_creation_type = members_allowed_repository_creation_type.asInstanceOf[js.Any], members_can_create_internal_repositories = members_can_create_internal_repositories.asInstanceOf[js.Any], members_can_create_private_repositories = members_can_create_private_repositories.asInstanceOf[js.Any], members_can_create_public_repositories = members_can_create_public_repositories.asInstanceOf[js.Any], members_can_create_repositories = members_can_create_repositories.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], owned_private_repos = owned_private_repos.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], private_gists = private_gists.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_members_url = public_members_url.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], total_private_repos = total_private_repos.asInstanceOf[js.Any], twitter_username = twitter_username.asInstanceOf[js.Any], two_factor_requirement_enabled = two_factor_requirement_enabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsGetResponseData]
  }
  
  @scala.inline
  implicit class OrgsGetResponseDataOps[Self <: OrgsGetResponseData] (val x: Self) extends AnyVal {
    
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
    def setBilling_email(value: String): Self = this.set("billing_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlog(value: String): Self = this.set("blog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollaborators(value: Double): Self = this.set("collaborators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompany(value: String): Self = this.set("company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_repository_permission(value: String): Self = this.set("default_repository_permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisk_usage(value: Double): Self = this.set("disk_usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents_url(value: String): Self = this.set("events_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowers(value: Double): Self = this.set("followers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowing(value: Double): Self = this.set("following", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_organization_projects(value: Boolean): Self = this.set("has_organization_projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_repository_projects(value: Boolean): Self = this.set("has_repository_projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooks_url(value: String): Self = this.set("hooks_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_verified(value: Boolean): Self = this.set("is_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssues_url(value: String): Self = this.set("issues_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogin(value: String): Self = this.set("login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers_allowed_repository_creation_type(value: String): Self = this.set("members_allowed_repository_creation_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers_can_create_internal_repositories(value: Boolean): Self = this.set("members_can_create_internal_repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers_can_create_private_repositories(value: Boolean): Self = this.set("members_can_create_private_repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers_can_create_public_repositories(value: Boolean): Self = this.set("members_can_create_public_repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers_can_create_repositories(value: Boolean): Self = this.set("members_can_create_repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers_url(value: String): Self = this.set("members_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwned_private_repos(value: Double): Self = this.set("owned_private_repos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlan(value: Filledseats): Self = this.set("plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate_gists(value: Double): Self = this.set("private_gists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic_gists(value: Double): Self = this.set("public_gists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic_members_url(value: String): Self = this.set("public_members_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic_repos(value: Double): Self = this.set("public_repos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepos_url(value: String): Self = this.set("repos_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_private_repos(value: Double): Self = this.set("total_private_repos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwitter_username(value: String): Self = this.set("twitter_username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwo_factor_requirement_enabled(value: Boolean): Self = this.set("two_factor_requirement_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
