package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Privaterepos
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsGetResponseData extends js.Object {
  var avatar_url: String
  var billing_email: String
  var blog: String
  var collaborators: Double
  var company: String
  var created_at: String
  var default_repository_permission: String
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
  var members_can_create_internal_repositories: Boolean
  var members_can_create_private_repositories: Boolean
  var members_can_create_public_repositories: Boolean
  var members_can_create_repositories: Boolean
  var members_url: String
  var name: String
  var node_id: String
  var owned_private_repos: Double
  var plan: Privaterepos
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
    plan: Privaterepos,
    private_gists: Double,
    public_gists: Double,
    public_members_url: String,
    public_repos: Double,
    repos_url: String,
    total_private_repos: Double,
    two_factor_requirement_enabled: Boolean,
    `type`: String,
    url: String
  ): OrgsGetResponseData = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], billing_email = billing_email.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], collaborators = collaborators.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], default_repository_permission = default_repository_permission.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], disk_usage = disk_usage.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], has_organization_projects = has_organization_projects.asInstanceOf[js.Any], has_repository_projects = has_repository_projects.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], members_allowed_repository_creation_type = members_allowed_repository_creation_type.asInstanceOf[js.Any], members_can_create_internal_repositories = members_can_create_internal_repositories.asInstanceOf[js.Any], members_can_create_private_repositories = members_can_create_private_repositories.asInstanceOf[js.Any], members_can_create_public_repositories = members_can_create_public_repositories.asInstanceOf[js.Any], members_can_create_repositories = members_can_create_repositories.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], owned_private_repos = owned_private_repos.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], private_gists = private_gists.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_members_url = public_members_url.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], total_private_repos = total_private_repos.asInstanceOf[js.Any], two_factor_requirement_enabled = two_factor_requirement_enabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsGetResponseData]
  }
}

