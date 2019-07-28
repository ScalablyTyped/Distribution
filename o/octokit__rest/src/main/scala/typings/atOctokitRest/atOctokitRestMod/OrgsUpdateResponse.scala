package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUpdateResponse extends js.Object {
  var avatar_url: String
  var billing_email: String
  var blog: String
  var collaborators: Double
  var company: String
  var created_at: String
  var default_repository_settings: String
  var description: String
  var disk_usage: Double
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
  var members_allowed_repository_creation_type: String
  var members_can_create_repositories: Boolean
  var members_url: String
  var name: String
  var node_id: String
  var owned_private_repos: Double
  var plan: OrgsUpdateResponsePlan
  var private_gists: Double
  var public_gists: Double
  var public_members_url: String
  var public_repos: Double
  var repos_url: String
  var total_private_repos: Double
  var two_factor_requirement_enabled: Boolean
  var `type`: String
  var url: String
}

object OrgsUpdateResponse {
  @scala.inline
  def apply(
    avatar_url: String,
    billing_email: String,
    blog: String,
    collaborators: Double,
    company: String,
    created_at: String,
    default_repository_settings: String,
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
    members_can_create_repositories: Boolean,
    members_url: String,
    name: String,
    node_id: String,
    owned_private_repos: Double,
    plan: OrgsUpdateResponsePlan,
    private_gists: Double,
    public_gists: Double,
    public_members_url: String,
    public_repos: Double,
    repos_url: String,
    total_private_repos: Double,
    two_factor_requirement_enabled: Boolean,
    `type`: String,
    url: String
  ): OrgsUpdateResponse = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, billing_email = billing_email, blog = blog, collaborators = collaborators, company = company, created_at = created_at, default_repository_settings = default_repository_settings, description = description, disk_usage = disk_usage, email = email, events_url = events_url, followers = followers, following = following, has_organization_projects = has_organization_projects, has_repository_projects = has_repository_projects, hooks_url = hooks_url, html_url = html_url, id = id, is_verified = is_verified, issues_url = issues_url, location = location, login = login, members_allowed_repository_creation_type = members_allowed_repository_creation_type, members_can_create_repositories = members_can_create_repositories, members_url = members_url, name = name, node_id = node_id, owned_private_repos = owned_private_repos, plan = plan, private_gists = private_gists, public_gists = public_gists, public_members_url = public_members_url, public_repos = public_repos, repos_url = repos_url, total_private_repos = total_private_repos, two_factor_requirement_enabled = two_factor_requirement_enabled, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OrgsUpdateResponse]
  }
}

