package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsGetResponse extends js.Object {
  var avatar_url: String
  var billing_email: js.UndefOr[String] = js.undefined
  var blog: String
  var collaborators: js.UndefOr[Double] = js.undefined
  var company: String
  var created_at: String
  var default_repository_settings: js.UndefOr[String] = js.undefined
  var description: String
  var disk_usage: js.UndefOr[Double] = js.undefined
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
  var members_allowed_repository_creation_type: js.UndefOr[String] = js.undefined
  var members_can_create_internal_repositories: js.UndefOr[Boolean] = js.undefined
  var members_can_create_private_repositories: js.UndefOr[Boolean] = js.undefined
  var members_can_create_public_repositories: js.UndefOr[Boolean] = js.undefined
  var members_can_create_repositories: js.UndefOr[Boolean] = js.undefined
  var members_url: String
  var name: String
  var node_id: String
  var owned_private_repos: js.UndefOr[Double] = js.undefined
  var plan: OrgsGetResponsePlan
  var private_gists: js.UndefOr[Double] = js.undefined
  var public_gists: Double
  var public_members_url: String
  var public_repos: Double
  var repos_url: String
  var total_private_repos: js.UndefOr[Double] = js.undefined
  var two_factor_requirement_enabled: js.UndefOr[Boolean] = js.undefined
  var `type`: String
  var url: String
}

object OrgsGetResponse {
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
    plan: OrgsGetResponsePlan,
    public_gists: Double,
    public_members_url: String,
    public_repos: Double,
    repos_url: String,
    `type`: String,
    url: String,
    billing_email: String = null,
    collaborators: Int | Double = null,
    default_repository_settings: String = null,
    disk_usage: Int | Double = null,
    members_allowed_repository_creation_type: String = null,
    members_can_create_internal_repositories: js.UndefOr[Boolean] = js.undefined,
    members_can_create_private_repositories: js.UndefOr[Boolean] = js.undefined,
    members_can_create_public_repositories: js.UndefOr[Boolean] = js.undefined,
    members_can_create_repositories: js.UndefOr[Boolean] = js.undefined,
    owned_private_repos: Int | Double = null,
    private_gists: Int | Double = null,
    total_private_repos: Int | Double = null,
    two_factor_requirement_enabled: js.UndefOr[Boolean] = js.undefined
  ): OrgsGetResponse = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], has_organization_projects = has_organization_projects.asInstanceOf[js.Any], has_repository_projects = has_repository_projects.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_members_url = public_members_url.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (billing_email != null) __obj.updateDynamic("billing_email")(billing_email.asInstanceOf[js.Any])
    if (collaborators != null) __obj.updateDynamic("collaborators")(collaborators.asInstanceOf[js.Any])
    if (default_repository_settings != null) __obj.updateDynamic("default_repository_settings")(default_repository_settings.asInstanceOf[js.Any])
    if (disk_usage != null) __obj.updateDynamic("disk_usage")(disk_usage.asInstanceOf[js.Any])
    if (members_allowed_repository_creation_type != null) __obj.updateDynamic("members_allowed_repository_creation_type")(members_allowed_repository_creation_type.asInstanceOf[js.Any])
    if (!js.isUndefined(members_can_create_internal_repositories)) __obj.updateDynamic("members_can_create_internal_repositories")(members_can_create_internal_repositories.asInstanceOf[js.Any])
    if (!js.isUndefined(members_can_create_private_repositories)) __obj.updateDynamic("members_can_create_private_repositories")(members_can_create_private_repositories.asInstanceOf[js.Any])
    if (!js.isUndefined(members_can_create_public_repositories)) __obj.updateDynamic("members_can_create_public_repositories")(members_can_create_public_repositories.asInstanceOf[js.Any])
    if (!js.isUndefined(members_can_create_repositories)) __obj.updateDynamic("members_can_create_repositories")(members_can_create_repositories.asInstanceOf[js.Any])
    if (owned_private_repos != null) __obj.updateDynamic("owned_private_repos")(owned_private_repos.asInstanceOf[js.Any])
    if (private_gists != null) __obj.updateDynamic("private_gists")(private_gists.asInstanceOf[js.Any])
    if (total_private_repos != null) __obj.updateDynamic("total_private_repos")(total_private_repos.asInstanceOf[js.Any])
    if (!js.isUndefined(two_factor_requirement_enabled)) __obj.updateDynamic("two_factor_requirement_enabled")(two_factor_requirement_enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsGetResponse]
  }
}

