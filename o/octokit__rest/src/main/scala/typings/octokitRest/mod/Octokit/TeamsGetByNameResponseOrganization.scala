package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetByNameResponseOrganization extends js.Object {
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
  var `type`: String
  var url: String
}

object TeamsGetByNameResponseOrganization {
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
    `type`: String,
    url: String
  ): TeamsGetByNameResponseOrganization = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], has_organization_projects = has_organization_projects.asInstanceOf[js.Any], has_repository_projects = has_repository_projects.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_members_url = public_members_url.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsGetByNameResponseOrganization]
  }
}

