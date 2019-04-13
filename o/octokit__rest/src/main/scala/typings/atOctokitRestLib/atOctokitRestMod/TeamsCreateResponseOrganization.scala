package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateResponseOrganization extends js.Object {
  var avatar_url: java.lang.String
  var blog: java.lang.String
  var company: java.lang.String
  var created_at: java.lang.String
  var description: java.lang.String
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
  var members_url: java.lang.String
  var name: java.lang.String
  var node_id: java.lang.String
  var public_gists: scala.Double
  var public_members_url: java.lang.String
  var public_repos: scala.Double
  var repos_url: java.lang.String
  var `type`: java.lang.String
  var url: java.lang.String
}

object TeamsCreateResponseOrganization {
  @scala.inline
  def apply(
    avatar_url: java.lang.String,
    blog: java.lang.String,
    company: java.lang.String,
    created_at: java.lang.String,
    description: java.lang.String,
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
    members_url: java.lang.String,
    name: java.lang.String,
    node_id: java.lang.String,
    public_gists: scala.Double,
    public_members_url: java.lang.String,
    public_repos: scala.Double,
    repos_url: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String
  ): TeamsCreateResponseOrganization = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, blog = blog, company = company, created_at = created_at, description = description, email = email, events_url = events_url, followers = followers, following = following, has_organization_projects = has_organization_projects, has_repository_projects = has_repository_projects, hooks_url = hooks_url, html_url = html_url, id = id, is_verified = is_verified, issues_url = issues_url, location = location, login = login, members_url = members_url, name = name, node_id = node_id, public_gists = public_gists, public_members_url = public_members_url, public_repos = public_repos, repos_url = repos_url, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TeamsCreateResponseOrganization]
  }
}

