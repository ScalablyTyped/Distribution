package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Billingemail extends StObject {
  
  /**
    * @description Whether GitHub Advanced Security is enabled for new repositories and repositories transferred to this organization.
    *
    * This field is only visible to organization owners or members of a team with the security manager role.
    * @example false
    */
  var advanced_security_enabled_for_new_repositories: js.UndefOr[Boolean] = js.undefined
  
  /** @example https://github.com/images/error/octocat_happy.gif */
  var avatar_url: String
  
  /**
    * Format: email
    * @example org@example.com
    */
  var billing_email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Format: uri
    * @example https://github.com/blog
    */
  var blog: js.UndefOr[String] = js.undefined
  
  /** @example 8 */
  var collaborators: js.UndefOr[Double | Null] = js.undefined
  
  /** @example GitHub */
  var company: js.UndefOr[String] = js.undefined
  
  /**
    * Format: date-time
    * @example 2008-01-14T04:33:35Z
    */
  var created_at: String
  
  var default_repository_permission: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @description Whether GitHub Advanced Security is automatically enabled for new repositories and repositories transferred to
    * this organization.
    *
    * This field is only visible to organization owners or members of a team with the security manager role.
    * @example false
    */
  var dependabot_alerts_enabled_for_new_repositories: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether dependabot security updates are automatically enabled for new repositories and repositories transferred
    * to this organization.
    *
    * This field is only visible to organization owners or members of a team with the security manager role.
    * @example false
    */
  var dependabot_security_updates_enabled_for_new_repositories: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether dependency graph is automatically enabled for new repositories and repositories transferred to this
    * organization.
    *
    * This field is only visible to organization owners or members of a team with the security manager role.
    * @example false
    */
  var dependency_graph_enabled_for_new_repositories: js.UndefOr[Boolean] = js.undefined
  
  /** @example A great organization */
  var description: String | Null
  
  /** @example 10000 */
  var disk_usage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Format: email
    * @example octocat@github.com
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * Format: uri
    * @example https://api.github.com/orgs/github/events
    */
  var events_url: String
  
  /** @example 20 */
  var followers: Double
  
  /** @example 0 */
  var following: Double
  
  /** @example true */
  var has_organization_projects: Boolean
  
  /** @example true */
  var has_repository_projects: Boolean
  
  /** @example https://api.github.com/orgs/github/hooks */
  var hooks_url: String
  
  /**
    * Format: uri
    * @example https://github.com/octocat
    */
  var html_url: String
  
  /** @example 1 */
  var id: Double
  
  /** @example true */
  var is_verified: js.UndefOr[Boolean] = js.undefined
  
  /** @example https://api.github.com/orgs/github/issues */
  var issues_url: String
  
  /** @example San Francisco */
  var location: js.UndefOr[String] = js.undefined
  
  /** @example github */
  var login: String
  
  /** @example all */
  var members_allowed_repository_creation_type: js.UndefOr[String] = js.undefined
  
  /** @example true */
  var members_can_create_internal_repositories: js.UndefOr[Boolean] = js.undefined
  
  /** @example true */
  var members_can_create_pages: js.UndefOr[Boolean] = js.undefined
  
  /** @example true */
  var members_can_create_private_pages: js.UndefOr[Boolean] = js.undefined
  
  /** @example true */
  var members_can_create_private_repositories: js.UndefOr[Boolean] = js.undefined
  
  /** @example true */
  var members_can_create_public_pages: js.UndefOr[Boolean] = js.undefined
  
  /** @example true */
  var members_can_create_public_repositories: js.UndefOr[Boolean] = js.undefined
  
  /** @example true */
  var members_can_create_repositories: js.UndefOr[Boolean | Null] = js.undefined
  
  /** @example false */
  var members_can_fork_private_repositories: js.UndefOr[Boolean | Null] = js.undefined
  
  /** @example https://api.github.com/orgs/github/members{/member} */
  var members_url: String
  
  /** @example github */
  var name: js.UndefOr[String] = js.undefined
  
  /** @example MDEyOk9yZ2FuaXphdGlvbjE= */
  var node_id: String
  
  /** @example 100 */
  var owned_private_repos: js.UndefOr[Double] = js.undefined
  
  var plan: js.UndefOr[Filledseats] = js.undefined
  
  /** @example 81 */
  var private_gists: js.UndefOr[Double | Null] = js.undefined
  
  /** @example 1 */
  var public_gists: Double
  
  /** @example https://api.github.com/orgs/github/public_members{/member} */
  var public_members_url: String
  
  /** @example 2 */
  var public_repos: Double
  
  /**
    * Format: uri
    * @example https://api.github.com/orgs/github/repos
    */
  var repos_url: String
  
  /**
    * @description Whether secret scanning is automatically enabled for new repositories and repositories transferred to this
    * organization.
    *
    * This field is only visible to organization owners or members of a team with the security manager role.
    * @example false
    */
  var secret_scanning_enabled_for_new_repositories: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether secret scanning push protection is automatically enabled for new repositories and repositories
    * transferred to this organization.
    *
    * This field is only visible to organization owners or members of a team with the security manager role.
    * @example false
    */
  var secret_scanning_push_protection_enabled_for_new_repositories: js.UndefOr[Boolean] = js.undefined
  
  /** @example 100 */
  var total_private_repos: js.UndefOr[Double] = js.undefined
  
  /** @example github */
  var twitter_username: js.UndefOr[String | Null] = js.undefined
  
  /** @example true */
  var two_factor_requirement_enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /** @example Organization */
  var `type`: String
  
  /** Format: date-time */
  var updated_at: String
  
  /**
    * Format: uri
    * @example https://api.github.com/orgs/github
    */
  var url: String
  
  /** @example false */
  var web_commit_signoff_required: js.UndefOr[Boolean] = js.undefined
}
object Billingemail {
  
  inline def apply(
    avatar_url: String,
    created_at: String,
    events_url: String,
    followers: Double,
    following: Double,
    has_organization_projects: Boolean,
    has_repository_projects: Boolean,
    hooks_url: String,
    html_url: String,
    id: Double,
    issues_url: String,
    login: String,
    members_url: String,
    node_id: String,
    public_gists: Double,
    public_members_url: String,
    public_repos: Double,
    repos_url: String,
    `type`: String,
    updated_at: String,
    url: String
  ): Billingemail = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], has_organization_projects = has_organization_projects.asInstanceOf[js.Any], has_repository_projects = has_repository_projects.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_members_url = public_members_url.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], description = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Billingemail]
  }
  
  extension [Self <: Billingemail](x: Self) {
    
    inline def setAdvanced_security_enabled_for_new_repositories(value: Boolean): Self = StObject.set(x, "advanced_security_enabled_for_new_repositories", value.asInstanceOf[js.Any])
    
    inline def setAdvanced_security_enabled_for_new_repositoriesUndefined: Self = StObject.set(x, "advanced_security_enabled_for_new_repositories", js.undefined)
    
    inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setBilling_email(value: String): Self = StObject.set(x, "billing_email", value.asInstanceOf[js.Any])
    
    inline def setBilling_emailNull: Self = StObject.set(x, "billing_email", null)
    
    inline def setBilling_emailUndefined: Self = StObject.set(x, "billing_email", js.undefined)
    
    inline def setBlog(value: String): Self = StObject.set(x, "blog", value.asInstanceOf[js.Any])
    
    inline def setBlogUndefined: Self = StObject.set(x, "blog", js.undefined)
    
    inline def setCollaborators(value: Double): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
    
    inline def setCollaboratorsNull: Self = StObject.set(x, "collaborators", null)
    
    inline def setCollaboratorsUndefined: Self = StObject.set(x, "collaborators", js.undefined)
    
    inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDefault_repository_permission(value: String): Self = StObject.set(x, "default_repository_permission", value.asInstanceOf[js.Any])
    
    inline def setDefault_repository_permissionNull: Self = StObject.set(x, "default_repository_permission", null)
    
    inline def setDefault_repository_permissionUndefined: Self = StObject.set(x, "default_repository_permission", js.undefined)
    
    inline def setDependabot_alerts_enabled_for_new_repositories(value: Boolean): Self = StObject.set(x, "dependabot_alerts_enabled_for_new_repositories", value.asInstanceOf[js.Any])
    
    inline def setDependabot_alerts_enabled_for_new_repositoriesUndefined: Self = StObject.set(x, "dependabot_alerts_enabled_for_new_repositories", js.undefined)
    
    inline def setDependabot_security_updates_enabled_for_new_repositories(value: Boolean): Self = StObject.set(x, "dependabot_security_updates_enabled_for_new_repositories", value.asInstanceOf[js.Any])
    
    inline def setDependabot_security_updates_enabled_for_new_repositoriesUndefined: Self = StObject.set(x, "dependabot_security_updates_enabled_for_new_repositories", js.undefined)
    
    inline def setDependency_graph_enabled_for_new_repositories(value: Boolean): Self = StObject.set(x, "dependency_graph_enabled_for_new_repositories", value.asInstanceOf[js.Any])
    
    inline def setDependency_graph_enabled_for_new_repositoriesUndefined: Self = StObject.set(x, "dependency_graph_enabled_for_new_repositories", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDisk_usage(value: Double): Self = StObject.set(x, "disk_usage", value.asInstanceOf[js.Any])
    
    inline def setDisk_usageNull: Self = StObject.set(x, "disk_usage", null)
    
    inline def setDisk_usageUndefined: Self = StObject.set(x, "disk_usage", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEvents_url(value: String): Self = StObject.set(x, "events_url", value.asInstanceOf[js.Any])
    
    inline def setFollowers(value: Double): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
    
    inline def setFollowing(value: Double): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
    
    inline def setHas_organization_projects(value: Boolean): Self = StObject.set(x, "has_organization_projects", value.asInstanceOf[js.Any])
    
    inline def setHas_repository_projects(value: Boolean): Self = StObject.set(x, "has_repository_projects", value.asInstanceOf[js.Any])
    
    inline def setHooks_url(value: String): Self = StObject.set(x, "hooks_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
    
    inline def setIs_verifiedUndefined: Self = StObject.set(x, "is_verified", js.undefined)
    
    inline def setIssues_url(value: String): Self = StObject.set(x, "issues_url", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setMembers_allowed_repository_creation_type(value: String): Self = StObject.set(x, "members_allowed_repository_creation_type", value.asInstanceOf[js.Any])
    
    inline def setMembers_allowed_repository_creation_typeUndefined: Self = StObject.set(x, "members_allowed_repository_creation_type", js.undefined)
    
    inline def setMembers_can_create_internal_repositories(value: Boolean): Self = StObject.set(x, "members_can_create_internal_repositories", value.asInstanceOf[js.Any])
    
    inline def setMembers_can_create_internal_repositoriesUndefined: Self = StObject.set(x, "members_can_create_internal_repositories", js.undefined)
    
    inline def setMembers_can_create_pages(value: Boolean): Self = StObject.set(x, "members_can_create_pages", value.asInstanceOf[js.Any])
    
    inline def setMembers_can_create_pagesUndefined: Self = StObject.set(x, "members_can_create_pages", js.undefined)
    
    inline def setMembers_can_create_private_pages(value: Boolean): Self = StObject.set(x, "members_can_create_private_pages", value.asInstanceOf[js.Any])
    
    inline def setMembers_can_create_private_pagesUndefined: Self = StObject.set(x, "members_can_create_private_pages", js.undefined)
    
    inline def setMembers_can_create_private_repositories(value: Boolean): Self = StObject.set(x, "members_can_create_private_repositories", value.asInstanceOf[js.Any])
    
    inline def setMembers_can_create_private_repositoriesUndefined: Self = StObject.set(x, "members_can_create_private_repositories", js.undefined)
    
    inline def setMembers_can_create_public_pages(value: Boolean): Self = StObject.set(x, "members_can_create_public_pages", value.asInstanceOf[js.Any])
    
    inline def setMembers_can_create_public_pagesUndefined: Self = StObject.set(x, "members_can_create_public_pages", js.undefined)
    
    inline def setMembers_can_create_public_repositories(value: Boolean): Self = StObject.set(x, "members_can_create_public_repositories", value.asInstanceOf[js.Any])
    
    inline def setMembers_can_create_public_repositoriesUndefined: Self = StObject.set(x, "members_can_create_public_repositories", js.undefined)
    
    inline def setMembers_can_create_repositories(value: Boolean): Self = StObject.set(x, "members_can_create_repositories", value.asInstanceOf[js.Any])
    
    inline def setMembers_can_create_repositoriesNull: Self = StObject.set(x, "members_can_create_repositories", null)
    
    inline def setMembers_can_create_repositoriesUndefined: Self = StObject.set(x, "members_can_create_repositories", js.undefined)
    
    inline def setMembers_can_fork_private_repositories(value: Boolean): Self = StObject.set(x, "members_can_fork_private_repositories", value.asInstanceOf[js.Any])
    
    inline def setMembers_can_fork_private_repositoriesNull: Self = StObject.set(x, "members_can_fork_private_repositories", null)
    
    inline def setMembers_can_fork_private_repositoriesUndefined: Self = StObject.set(x, "members_can_fork_private_repositories", js.undefined)
    
    inline def setMembers_url(value: String): Self = StObject.set(x, "members_url", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setOwned_private_repos(value: Double): Self = StObject.set(x, "owned_private_repos", value.asInstanceOf[js.Any])
    
    inline def setOwned_private_reposUndefined: Self = StObject.set(x, "owned_private_repos", js.undefined)
    
    inline def setPlan(value: Filledseats): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    inline def setPrivate_gists(value: Double): Self = StObject.set(x, "private_gists", value.asInstanceOf[js.Any])
    
    inline def setPrivate_gistsNull: Self = StObject.set(x, "private_gists", null)
    
    inline def setPrivate_gistsUndefined: Self = StObject.set(x, "private_gists", js.undefined)
    
    inline def setPublic_gists(value: Double): Self = StObject.set(x, "public_gists", value.asInstanceOf[js.Any])
    
    inline def setPublic_members_url(value: String): Self = StObject.set(x, "public_members_url", value.asInstanceOf[js.Any])
    
    inline def setPublic_repos(value: Double): Self = StObject.set(x, "public_repos", value.asInstanceOf[js.Any])
    
    inline def setRepos_url(value: String): Self = StObject.set(x, "repos_url", value.asInstanceOf[js.Any])
    
    inline def setSecret_scanning_enabled_for_new_repositories(value: Boolean): Self = StObject.set(x, "secret_scanning_enabled_for_new_repositories", value.asInstanceOf[js.Any])
    
    inline def setSecret_scanning_enabled_for_new_repositoriesUndefined: Self = StObject.set(x, "secret_scanning_enabled_for_new_repositories", js.undefined)
    
    inline def setSecret_scanning_push_protection_enabled_for_new_repositories(value: Boolean): Self = StObject.set(x, "secret_scanning_push_protection_enabled_for_new_repositories", value.asInstanceOf[js.Any])
    
    inline def setSecret_scanning_push_protection_enabled_for_new_repositoriesUndefined: Self = StObject.set(x, "secret_scanning_push_protection_enabled_for_new_repositories", js.undefined)
    
    inline def setTotal_private_repos(value: Double): Self = StObject.set(x, "total_private_repos", value.asInstanceOf[js.Any])
    
    inline def setTotal_private_reposUndefined: Self = StObject.set(x, "total_private_repos", js.undefined)
    
    inline def setTwitter_username(value: String): Self = StObject.set(x, "twitter_username", value.asInstanceOf[js.Any])
    
    inline def setTwitter_usernameNull: Self = StObject.set(x, "twitter_username", null)
    
    inline def setTwitter_usernameUndefined: Self = StObject.set(x, "twitter_username", js.undefined)
    
    inline def setTwo_factor_requirement_enabled(value: Boolean): Self = StObject.set(x, "two_factor_requirement_enabled", value.asInstanceOf[js.Any])
    
    inline def setTwo_factor_requirement_enabledNull: Self = StObject.set(x, "two_factor_requirement_enabled", null)
    
    inline def setTwo_factor_requirement_enabledUndefined: Self = StObject.set(x, "two_factor_requirement_enabled", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWeb_commit_signoff_required(value: Boolean): Self = StObject.set(x, "web_commit_signoff_required", value.asInstanceOf[js.Any])
    
    inline def setWeb_commit_signoff_requiredUndefined: Self = StObject.set(x, "web_commit_signoff_required", js.undefined)
  }
}
