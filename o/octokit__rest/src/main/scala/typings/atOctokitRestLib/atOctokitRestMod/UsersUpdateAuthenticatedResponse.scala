package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersUpdateAuthenticatedResponse extends js.Object {
  var avatar_url: java.lang.String
  var bio: java.lang.String
  var blog: java.lang.String
  var collaborators: scala.Double
  var company: java.lang.String
  var created_at: java.lang.String
  var disk_usage: scala.Double
  var email: java.lang.String
  var events_url: java.lang.String
  var followers: scala.Double
  var followers_url: java.lang.String
  var following: scala.Double
  var following_url: java.lang.String
  var gists_url: java.lang.String
  var gravatar_id: java.lang.String
  var hireable: scala.Boolean
  var html_url: java.lang.String
  var id: scala.Double
  var location: java.lang.String
  var login: java.lang.String
  var name: java.lang.String
  var node_id: java.lang.String
  var organizations_url: java.lang.String
  var owned_private_repos: scala.Double
  var plan: UsersUpdateAuthenticatedResponsePlan
  var private_gists: scala.Double
  var public_gists: scala.Double
  var public_repos: scala.Double
  var received_events_url: java.lang.String
  var repos_url: java.lang.String
  var site_admin: scala.Boolean
  var starred_url: java.lang.String
  var subscriptions_url: java.lang.String
  var total_private_repos: scala.Double
  var two_factor_authentication: scala.Boolean
  var `type`: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
}

object UsersUpdateAuthenticatedResponse {
  @scala.inline
  def apply(
    avatar_url: java.lang.String,
    bio: java.lang.String,
    blog: java.lang.String,
    collaborators: scala.Double,
    company: java.lang.String,
    created_at: java.lang.String,
    disk_usage: scala.Double,
    email: java.lang.String,
    events_url: java.lang.String,
    followers: scala.Double,
    followers_url: java.lang.String,
    following: scala.Double,
    following_url: java.lang.String,
    gists_url: java.lang.String,
    gravatar_id: java.lang.String,
    hireable: scala.Boolean,
    html_url: java.lang.String,
    id: scala.Double,
    location: java.lang.String,
    login: java.lang.String,
    name: java.lang.String,
    node_id: java.lang.String,
    organizations_url: java.lang.String,
    owned_private_repos: scala.Double,
    plan: UsersUpdateAuthenticatedResponsePlan,
    private_gists: scala.Double,
    public_gists: scala.Double,
    public_repos: scala.Double,
    received_events_url: java.lang.String,
    repos_url: java.lang.String,
    site_admin: scala.Boolean,
    starred_url: java.lang.String,
    subscriptions_url: java.lang.String,
    total_private_repos: scala.Double,
    two_factor_authentication: scala.Boolean,
    `type`: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String
  ): UsersUpdateAuthenticatedResponse = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, bio = bio, blog = blog, collaborators = collaborators, company = company, created_at = created_at, disk_usage = disk_usage, email = email, events_url = events_url, followers = followers, followers_url = followers_url, following = following, following_url = following_url, gists_url = gists_url, gravatar_id = gravatar_id, hireable = hireable, html_url = html_url, id = id, location = location, login = login, name = name, node_id = node_id, organizations_url = organizations_url, owned_private_repos = owned_private_repos, plan = plan, private_gists = private_gists, public_gists = public_gists, public_repos = public_repos, received_events_url = received_events_url, repos_url = repos_url, site_admin = site_admin, starred_url = starred_url, subscriptions_url = subscriptions_url, total_private_repos = total_private_repos, two_factor_authentication = two_factor_authentication, updated_at = updated_at, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UsersUpdateAuthenticatedResponse]
  }
}

