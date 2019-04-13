package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUpdateResponse extends js.Object {
  var avatar_url: java.lang.String
  var billing_email: java.lang.String
  var blog: java.lang.String
  var collaborators: scala.Double
  var company: java.lang.String
  var created_at: java.lang.String
  var default_repository_settings: java.lang.String
  var description: java.lang.String
  var disk_usage: scala.Double
  var email: java.lang.String
  var events_url: java.lang.String
  var followers: scala.Double
  var following: scala.Double
  var has_organization_projects: scala.Boolean
  var has_repository_projects: scala.Boolean
  var hooks_url: java.lang.String
  var html_url: java.lang.String
  var id: scala.Double
  var is_verified: scala.Boolean
  var issues_url: java.lang.String
  var location: java.lang.String
  var login: java.lang.String
  var members_allowed_repository_creation_type: java.lang.String
  var members_can_create_repositories: scala.Boolean
  var members_url: java.lang.String
  var name: java.lang.String
  var node_id: java.lang.String
  var owned_private_repos: scala.Double
  var plan: OrgsUpdateResponsePlan
  var private_gists: scala.Double
  var public_gists: scala.Double
  var public_members_url: java.lang.String
  var public_repos: scala.Double
  var repos_url: java.lang.String
  var total_private_repos: scala.Double
  var two_factor_requirement_enabled: scala.Boolean
  var `type`: java.lang.String
  var url: java.lang.String
}

object OrgsUpdateResponse {
  @scala.inline
  def apply(
    avatar_url: java.lang.String,
    billing_email: java.lang.String,
    blog: java.lang.String,
    collaborators: scala.Double,
    company: java.lang.String,
    created_at: java.lang.String,
    default_repository_settings: java.lang.String,
    description: java.lang.String,
    disk_usage: scala.Double,
    email: java.lang.String,
    events_url: java.lang.String,
    followers: scala.Double,
    following: scala.Double,
    has_organization_projects: scala.Boolean,
    has_repository_projects: scala.Boolean,
    hooks_url: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    is_verified: scala.Boolean,
    issues_url: java.lang.String,
    location: java.lang.String,
    login: java.lang.String,
    members_allowed_repository_creation_type: java.lang.String,
    members_can_create_repositories: scala.Boolean,
    members_url: java.lang.String,
    name: java.lang.String,
    node_id: java.lang.String,
    owned_private_repos: scala.Double,
    plan: OrgsUpdateResponsePlan,
    private_gists: scala.Double,
    public_gists: scala.Double,
    public_members_url: java.lang.String,
    public_repos: scala.Double,
    repos_url: java.lang.String,
    total_private_repos: scala.Double,
    two_factor_requirement_enabled: scala.Boolean,
    `type`: java.lang.String,
    url: java.lang.String
  ): OrgsUpdateResponse = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, billing_email = billing_email, blog = blog, collaborators = collaborators, company = company, created_at = created_at, default_repository_settings = default_repository_settings, description = description, disk_usage = disk_usage, email = email, events_url = events_url, followers = followers, following = following, has_organization_projects = has_organization_projects, has_repository_projects = has_repository_projects, hooks_url = hooks_url, html_url = html_url, id = id, is_verified = is_verified, issues_url = issues_url, location = location, login = login, members_allowed_repository_creation_type = members_allowed_repository_creation_type, members_can_create_repositories = members_can_create_repositories, members_url = members_url, name = name, node_id = node_id, owned_private_repos = owned_private_repos, plan = plan, private_gists = private_gists, public_gists = public_gists, public_members_url = public_members_url, public_repos = public_repos, repos_url = repos_url, total_private_repos = total_private_repos, two_factor_requirement_enabled = two_factor_requirement_enabled, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OrgsUpdateResponse]
  }
}

